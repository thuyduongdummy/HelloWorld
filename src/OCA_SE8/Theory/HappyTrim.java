package OCA_SE8.Theory;


import java.util.Date;

public class HappyTrim {
    public static void main (String[] args){
        String happy = " :) - (: ";
        String really= happy.trim();
        String question = happy.substring(1, happy.length()-1);
        System.out.println(really.equals(question));
        Date rob = new Date();
    }

}
