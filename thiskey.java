class thiskey{
    int a,b;
    thiskey(int a,int b){
        this.a=a;
        this.b=b;
    }
    void print(){
        System.out.println("This is a: "+a+"This is b: "+b);
    }
    public static void main(String args[]){
        thiskey tk =new thiskey(10, 20);
        tk.print();
    }
}
// In Java, ‘this’ keyword is a reference variable 
// that refers to the current object
// It can be used to call current class methods and fields,  
// and to differentiate between the local and instance variables