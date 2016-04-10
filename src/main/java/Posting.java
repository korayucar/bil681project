/**
 * Created by koray2 on 4/10/16.
 */

/**
 * initially only hods the integer index of occurence of a term
 * This class is intended to hold more informattion than just the index
 */
public class Posting implements  Comparable<Posting>{

    Integer index;


    public Posting(Integer index){
        this.index = index;
    }
    @Override
    public int compareTo(Posting o) {
        return this.index.compareTo(o.index);
    }
}
