import java.util.ArrayList;

/**
 * Created by Mateusz on 2017-04-09.
 */
public class NestedLoopsJoiner implements Joiner {
    private Table leftTable;
    private Table rightTable;

    public NestedLoopsJoiner(Table leftTable,Table rightTable) {
        this.leftTable = leftTable;
        this.rightTable = rightTable;
    }

    public JoinResult join() {
        return null;
    }
    public static Result join(Table tableA,Table tableB,int bufferSize,int bandSize) {
        Result result = new Result();
        int iO = 0;
        int comparitions = 0;
        int size = 0;
        for (int i = 0; i<tableA.getOuterPartsCount(bufferSize);i++) {
            iO+=tableA.getOuterPartSize(i,bufferSize);
            for (int j = 0; j<tableB.getInnerPartsCount(bufferSize);j++) {
                iO += 1;
                for (Entity rowA : tableA.getOuterPart(i,bufferSize)) {
                    for (Entity rowB : tableB.getInnerPart(j)) {
                        comparitions++;
                        if (rowB.getId() <= rowA.getId()+(bandSize/2)&&rowB.getId() >= rowA.getId()-(bandSize/2)) {
                            size++;
                        }
                    }
                }
            }
        }
        result.setJoinIOs((int)Math.ceil((double) (size*2)/(tableA.getRowsPerBlock())));
        result.setiOs(iO);
        result.setComparitions(comparitions);
        return result;
    }
}
