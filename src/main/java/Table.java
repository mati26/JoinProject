import java.util.ArrayList;
import java.util.List;

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

    public List<Entity> getInnerPart(int partNumber) {
        return (List<Entity>) rows.subList(partNumber*rowsPerBlock,Math.min(partNumber*rowsPerBlock+rowsPerBlock,rows.size()));
    }

    public List<Entity> getOuterPart(int partNumber,int bufferSize) {
        return (List<Entity>) rows.subList(partNumber*rowsPerBlock*(bufferSize-1),Math.min(partNumber*rowsPerBlock*(bufferSize-1)+(rowsPerBlock*(bufferSize-1)),rows.size()));
    }

    public int getOuterPartSize ( int partNumber,int bufferSize) {
        return (int) Math.ceil((double) getOuterPart(partNumber,bufferSize).size()/rowsPerBlock);
    }
}
