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
    public static int iOs(Table tableA,Table tableB,int bufferSize) {
        int iO = 0;
        for (int i = 0; i<tableA.getOuterPartsCount(bufferSize);i++) {
            iO+=tableA.getOuterPartSize(i,bufferSize);
            for (int j = 0; j<tableB.getInnerPartsCount(bufferSize);j++) {
                iO += 1;
            }
        }
        return iO;
    }
}
