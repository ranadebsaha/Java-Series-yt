class cla{
    public static void main(String[] args) {
        if(args.length!=3){
            System.out.println("Invalid input");
            return;
        }
        int a,b,c; // [10,o,20]
        String o;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[2]);
        o=args[1];
        if(o.equals("+")){
            c=a+b;
            System.out.println("Result is: "+c);
        }else if(o.equals("-")){
            c=a-b;
            System.out.println("Result is: "+c);
        }
        else if(o.equals("x")){
            c=a*b;
            System.out.println("Result is: "+c);
        }
        else if(o.equals("/")){
            c=a/b;
            System.out.println("Result is: "+c);
        }
        else if(o.equals("%")){
            c=a%b;
            System.out.println("Result is: "+c);
        }
    }
}

// class cla{
//     public static void main(String[] rds) {
//         int i;
//         for(i=0;i<rds.length;i++){
//             System.out.println(rds[i]);
//         }
//     }
// }