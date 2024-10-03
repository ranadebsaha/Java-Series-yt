abstract class ab{
    int a,b;
    ab(int a, int b){
        this.a=a;
        this.b=b;
    }
    abstract void sum();
}

class abs extends ab{
    int sum;
    abs(int a,int b){
        super(a,b);
        sum=a+b;
    }
    void sum(){
        System.out.println("Sum: "+sum);
    }
}

class abstractclass{
    public static void main(String[] args) {
        abs obj=new abs(10,20);
        obj.sum();
    }
}
//Abstract Class
//Abstration means hiding certain details, and showing only essential
// information

//Abstract Class
//Abstract Method