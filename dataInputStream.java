import java.io.*;
class dataInputStream{
    public static void main(String[] args)throws IOException
    {
        int a;
        float b;
        String c;
        DataInputStream ds=new DataInputStream(System.in);
        System.out.print("Enter a Integer: ");
        a=Integer.parseInt(ds.readLine());
        System.out.print("Enter a Float: ");
        b=Float.parseFloat(ds.readLine());
        System.out.print("Enter a String: ");
        c=ds.readLine();
        System.out.println("a: "+a+"b: "+b+"c: "+c);
    }
}