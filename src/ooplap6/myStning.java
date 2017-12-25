package ooplap6;

public class myStning {
    public static void main(String[] args) {
        String msg1 = "Khuanruthai Rueagdet";
        System.out.println(msg1);
        char []c = {'H','e','l','l','o'};
        String msg2 = new String(c);
        System.out.println(msg2);

         //concatnation String
        //type 1(+)
        String msg3 = msg2 +" "+ msg1;
        System.out.println(msg3);
        System.out.println(msg3.length());
        //type 2 (concat())
        String msg4 = msg3.concat(" RMUTST");
        System.out.println(msg4);

        System.out.println(msg4.toLowerCase());
        System.out.println(msg4.toUpperCase());
        System.out.println(msg4.substring(5,10));

        //trim()//ตัดด้านซ้ายขวา
        String mag5 = " Hello ";
        System.out.println("*"+mag5+"*");
        System.out.println("*"+mag5.trim()+"*");


    }//main
}//class
