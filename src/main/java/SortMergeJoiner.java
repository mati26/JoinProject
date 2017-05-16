import java.util.ArrayList;

/**
 * Created by Mateusz on 2017-04-09.
 */
public class SortMergeJoiner implements Joiner {
    private ArrayList<Entity> leftTable;
    private ArrayList<Entity> rightTable;

    public SortMergeJoiner(ArrayList<Entity> leftTable, ArrayList<Entity> rightTable) {
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
        for (int i = 0; i<tableA.getOuterPartsCount(bufferSize);i++) {
            iO+=tableA.getOuterPartSize(i,bufferSize);
                for (int j = 0; j < tableB.getInnerPartsCount(bufferSize); j++) {
                    iO += 1;
                    for (Entity rowA : tableA.getOuterPart(i,bufferSize)) {
                        for (Entity rowB : tableB.getInnerPart(j)) {
                            comparitions++;
                            if (rowB.getId() > rowA.getId()+(bandSize/2)) {
                                break;
                            }

                        }
                    }
                }

        }
        result.setiOs(iO);
        result.setComparitions(comparitions);
        return result;
    }
}
