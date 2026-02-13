public class Main {
    public static void main(String[] args) {
      Test<Integer> t1=new Test<>(){
      public Integer sum(Integer a ,Integer b) {return a+b;}
      };
        System.out.println(t1.sum(12,24));
      Test<String> t2 = (a,b) -> a+b;
      System.out.println(t2.sum("Hellow ","World"));
      
      Test<Float> t3 = (a,b) -> a+b;
      System.out.println(t3.sum(10.2f,22.4f));
     
      Test<Integer> t4 = Integer::sum;
      System.out.println(t4.sum((int)10.2,(int)22.4));
      
      I inti = new I();
       Test<Integer> t5 = inti::sum;
      System.out.println(t4.sum((int)10.2,(int)22.4));
    }
}
class I{
    I(){}
    
    public int sum(int a,int b){
        return a+b;
    }
}
interface Test<T>{
    T sum(T a,T b);
}


/*
36
Hellow World
32.6
32
32
*/
