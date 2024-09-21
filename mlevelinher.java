class A{
int aa;
A(int aa){
    this.aa=aa;
}
}

class B extends A{
int bb;
B(int aa,int bb){
    super(aa);
this.bb=bb;
}
}

class C extends B{
int sum;
C(int aa,int bb){
    super(aa,bb);
    sum=aa+bb;
    System.out.println("Sum: "+sum);
}
}
public class mlevelinher {
    public static void main(String[] args) {
        C c=new C(10,20);
    }
}
