class statickey{
    static int a=10;
    static int b=20;
    static int c;
    static class nc{
        void print(){
            System.out.println("This is nested class");
        }
    }
    // static{
    //     c=a+b;
    // }
    // static int add(){
    //     return a+10;
    // }
    public static void main(String[] args) {
        statickey.nc n1=new statickey.nc();
        n1.print();
        // System.out.println("This is c: "+c);
    }
}

// Static Keyword
// The static keyword in Java is mainly used for memory management. 
// The static keyword in Java is used to share the same variable 
// or method of a given class. 
// The users can apply static keywords with variables, methods, 
// blocks, and nested classes. 
// The static keyword is used for a constant variable or 
// a method that is the same for every instance of a class.
// The static keyword is a non-access modifier in Java