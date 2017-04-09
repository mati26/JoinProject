import java.util.ArrayList;

/**
 * Created by Kacper on 2017-04-09.
 */
public class Table {
    private ArrayList<Entity> rows;
    private int rowsPerBlock = 625;
    public Table(long size) {
        rows = new ArrayList<Entity>();
        for (long i = 0;i<size;i++) {
            rows.add(new Entity(i));
        }
    }

    public int getInnerPartsCount(int bufferSize) {
        return (int)Math.ceil((double) rows.size()/rowsPerBlock );
    }

    public int getOuterPartsCount (int bufferSize) {
        return (int)Math.ceil((double) rows.size()/(rowsPerBlock*(bufferSize-1)));
    }

    public ArrayList<Entity> getInnerPart(int partNumber) {
        return (ArrayList<Entity>) rows.subList(partNumber*rowsPerBlock,partNumber*rowsPerBlock+625);
    }

    public ArrayList<Entity> getOuterPart(int partNumber,int bufferSize) {
        return (ArrayList<Entity>) rows.subList(partNumber*rowsPerBlock*(bufferSize-1),partNumber*rowsPerBlock*(bufferSize-1)+625);
    }
}
