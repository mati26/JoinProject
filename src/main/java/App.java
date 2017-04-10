import lombok.Getter;

/**
 * Created by Mateusz on 2017-04-07.
 */
public class App {
    public static void main(String[] args){
        int tableSize = 10000;
        int bufferSize = 4;
        Table tableA = new Table(tableSize);
        Table tableB = new Table(tableSize);

        System.out.println(NestedLoopsJoiner.iOs(tableA,tableB,bufferSize));
        System.out.println(SortMergeJoiner.iOs(tableA,tableB,bufferSize,1000));
    }
}
