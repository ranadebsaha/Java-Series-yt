class A{
void show(){
    System.out.println("This is class A");
}
}

class B extends A{
void show(){
    System.out.println("This is class B");
}
}

public class movrrding {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
