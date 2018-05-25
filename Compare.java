package proj3;
import java.lang.String;

public class Compare {

    //method to find the string and return the index

    public void index(String line){
        String s1 = "ACGGC";
        String s2 = "UAGCUA";
        String s3 = "GCCACCC";
        String s4 = "GAGACUCG";
        String s5 = "UAGCGAAAGUCAC";
        String s6 = "CGCUAUUCUGGUGA";

        System.out.println("Index of ACGGC " + line.indexOf(s1));
        System.out.println("Index of UAGCUA " + line.indexOf(s2));
        System.out.println("Index of GCCACCC " + line.indexOf(s3));
        System.out.println("Index of GAGACUCG " + line.indexOf(s4));
        System.out.println("Index of UAGCGAAAGUCAC " + line.indexOf(s5));
        System.out.println("Index of CGCUAUUCUGGUGA " + line.indexOf(s6));

    }


}
