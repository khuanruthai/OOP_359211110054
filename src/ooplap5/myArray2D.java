package ooplap5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myArray2D {
    public static void main(String[] args) {
        int num [][] = new  int[2][3];
//        num[0][0] =1;
//        num[0][1] =2;
//        num[0][2] =3;
        num = inputData2D(num);
    }//main



    private static void showData2D(int[][] num) {
        System.out.println("Data in arrr 2D:");
        for (int i=0;i< num.length; i++) {
            for (int j=0;j<num[i].length; j++) {
                System.out.print("num["+i+"]["+j+"]: ");


                private static int[][] inputData2D(int[][] num) {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print("num["+i+"]["+j+"]: ");
                num[i][j] = Integer.parseInt(reader.readLine());
            }//j
        }//i

        return num;
    }//inputData


