class A1{
    static void m1(){
        System.out.println("A1 m1() hii ");
    }
    
    static void m1(int a){
        System.out.println("A1 m1() hii "+ a);
    }
    
     void m2(){
        System.out.println("A1 m2() hii ");
    }
    
     void m2(int a){
        System.out.println("A1 m2() hii "+ a);
    }
    
    A1(){
        System.out.println("A1 default constructor ");
        }
        
    A1(int a){
        System.out.println("A1 parametarised constructor"+ a);
    }    
    
    
}


interface I2{
    void test(int a);
}

interface I1{
    void test();
}


class Main{
    public static void main(String[] k){
    //1 of 12
    I1 i1= () -> A1.m1();
    I1 i2 =A1::m1;
    
     //2 of 12
    I2 i3= (a) -> A1.m1(a);
    I2 i4 = A1::m1;
    
    //3 of 12
    I1 i11= ()-> new A1().m2();
    I1 i22 = new A1()::m2;
    
    //4 of 12
    I2 i33=(a)-> new A1().m2(a);
    I2 i44= new A1()::m2;

    // 5 of 12
    I1 i55=()-> new A1();
    I1 i66= A1::new;
    //6 of 12
    I2 i77=(a)-> new A1();
    I2 i88=A1::new;
    
    i1.test();
    i2.test();
    i3.test(10);
    i4.test(10);
    i11.test();
    i22.test();
    i33.test(20);
    i44.test(20);
    i55.test();
    i66.test();
    i77.test(40);
    i88.test(40);
    
    }
}

/*
A1 default constructor 
A1 default constructor 
A1 m1() hii 
A1 m1() hii 
A1 m1() hii 10
A1 m1() hii 10
A1 default constructor 
A1 m2() hii 
A1 m2() hii 
A1 default constructor 
A1 m2() hii 20
A1 m2() hii 20
A1 default constructor 
A1 default constructor 
A1 default constructor 
A1 parametarised constructor40

*/

/*
The sequence in which it gets the output is also a stydy thing .Revice it When you dont understand
*/

