package ooplap6;

public class myStrBuffer {
    public static void main(String[] args) {
        //StringBuffer
       StringBuffer buffer= new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("to");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append(2017);
        System.out.println(buffer);
        buffer.replace(0,5,"University to");
        System.out.println(buffer.replace());
        buffer.setCharAt(0, 't');
        System.out.println(buffer);

    }//main
}//class
