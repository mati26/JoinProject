import java.util.ArrayList;

/**
 * Created by Mateusz on 2017-04-09.
 */
public class JoinResult {
    private ArrayList<Entity> leftTableRows;
    private ArrayList<Entity> rightTableRows;

    public JoinResult() {
        leftTableRows = new ArrayList<Entity>();
        rightTableRows = new ArrayList<Entity>();
    }

    public void outputRows(Entity leftTableRow, Entity rightTableRow) {
        leftTableRows.add(leftTableRow);
        rightTableRows.add(rightTableRow);
    }
}
