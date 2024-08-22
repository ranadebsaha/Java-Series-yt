class test1{
    test1(){
        System.out.println("This is Test 1");
    }
}
class test2{
    test2(){
        System.out.println("This is Test 2");
        test1 t1=new test1();
    }
}
class test3{
    test3(){
        System.out.println("This is Test 3");
        test2 t2=new test2();
    }
}

class test{
    public static void main(String[] args) {
        test3 t3=new test3(); //test3->test2->test1
    }
}