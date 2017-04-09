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
        System.out.println(tableA.getOuterPartsCount(bufferSize));
        System.out.println(tableB.getInnerPartsCount(bufferSize));
        int iO = 0;
        for (int i = 0; i<tableA.getOuterPartsCount(bufferSize);i++) {
            iO += bufferSize-1;
            for (int j = 0; j<tableB.getInnerPartsCount(bufferSize);j++) {
                iO += 1;
            }
        }

        System.out.println(iO);
    }
}
