class var_s_array {
    public static void main(String[] args) {
        int a[][];
        a=new int[3][];
        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[2];
        a[2][1]=10;
        System.out.println(a[2][1]);
    }
}
