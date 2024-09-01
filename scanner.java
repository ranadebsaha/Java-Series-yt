import java.util.*;
class scanner {
    public static void main(String[] args) {
        int a;
        float b;
        String c;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        a=sc.nextInt();
        System.out.print("Enter a Float: ");
        b=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter a String: ");
        c=sc.nextLine();
        System.out.println("a: "+a+"b: "+b+"c: "+c);
    }
}
