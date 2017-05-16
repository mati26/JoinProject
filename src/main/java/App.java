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
        Result nlResult = NestedLoopsJoiner.join(tableA,tableB,bufferSize,10000);
        Result smResult = SortMergeJoiner.join(tableA,tableB,bufferSize,10000);
        System.out.println(nlResult.getiOs());
        System.out.println(nlResult.getComparitions());
        System.out.println(smResult.getiOs());
        System.out.println(smResult.getComparitions());
    }
}
