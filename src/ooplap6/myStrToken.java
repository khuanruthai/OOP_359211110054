package ooplap6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
        StringTokenizer//จำนวนคำ
        String msg = "We to RMUTSV";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());
    }//main

}//class
