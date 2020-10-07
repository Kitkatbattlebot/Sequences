/*
 * Author: Tanisha Payne
 * CRN: 20690
 * Program 3: Sequences
 *
 */

public class SeqLoc implements Comparable<SeqLoc>{
    private String seq;
    private int loc;

    public SeqLoc(String seq, int loc) {
        this.seq = seq;
        this.loc = loc;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }

    @Override
    public int compareTo(SeqLoc s) {
        if(seq.length()>s.getSeq().length())
             return -1;
        else if(seq.length()<s.getSeq().length())
            return 1;
        else
            return 0;
    }
}
