import java.util.ArrayList;

/**
 * Created by Mateusz on 2017-04-09.
 */
public class NestedLoopsJoiner implements Joiner {
    private ArrayList<Entity> leftTable;
    private ArrayList<Entity> rightTable;

    public NestedLoopsJoiner(ArrayList<Entity> leftTable, ArrayList<Entity> rightTable) {
        this.leftTable = leftTable;
        this.rightTable = rightTable;
    }

    public JoinResult join() {
        return null;
    }
}
