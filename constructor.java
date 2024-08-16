class constructor{
   int a;
   constructor(){    
   }
   constructor(int x){
      a=x;
      System.out.println("1)This is a: "+a);
   }
   constructor(constructor c){
      int b;
      b=c.a;
      b=b+10;
      System.out.println(b);
   }
   // constructor(int x,int y){
   //    a=x+y;
   //    System.out.println("2)This is a: "+a);
   // }
   // constructor(int x,int y,int z){
   //    a=x+y+z;
   //    System.out.println("3)This is a: "+a);
   // }

   public static void main(String args[]){
      constructor v1=new constructor(10);
      constructor v2=new constructor(v1);
   }
}
// Constructor
// A Constructor is a block of codes similar to the method. 
// It is called when an instance of the class is created.  
// It is a special type of method that is used to initialize the object. 
// Every time an object is created using the new() keyword, 
// at least one constructor is called.

// 1. Constructors must have the same name as the class 
// within which it is defined it is not necessary for the method in Java.
// 2. Constructors do not return any type, not even void while method(s) 
//    have the return type or void if does not return any value.
// 3. Constructors are called only once at the time of Object 
//    creation while method(s) can be called any number of times.

//Types of Constructor
// 1. Default Constructor
// 2. Parameterized Constructor
// 3. Copy Constructor