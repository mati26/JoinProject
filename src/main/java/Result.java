/**
 * Created by Kacper on 2017-04-17.
 */
public class Result {
    private int iOs;
    private int joinIOs;
    private int sortIOs;
    private int comparitions;

    public int getiOs() {
        return iOs;
    }



    public void setiOs(int iOs) {
        this.iOs = iOs;
    }

    public int getComparitions() {
        return comparitions;
    }

    public void setComparitions(int comparitions) {
        this.comparitions = comparitions;
    }

    public int getJoinIOs() {
        return joinIOs;
    }

    public void setJoinIOs(int joinIOs) {
        this.joinIOs = joinIOs;
    }

    public int getSortIOs() {
        return sortIOs;
    }

    public void setSortIOs(int sortIOs) {
        this.sortIOs = sortIOs;
    }
}
