import java.io.*;
class buffered_reader{
    public static void main(String[] args) throws IOException
    {
        int a;
        float b;
        String c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Integer: ");
        a=Integer.parseInt(br.readLine());
        System.out.print("Enter a Float: ");
        b=Float.parseFloat(br.readLine());
        System.out.print("Enter a String: ");
        c=br.readLine();
        System.out.println("a: "+a+"b: "+b+"c: "+c);
    }
}