import java.util.*;

@FunctionalInterface

interface Test{
  void operation(String s);
}

@FunctionalInterface
interface Test2{
  void operation(String s,String str);
}


public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      String demo="World";
      //find string length 
      Test test1= (s)->{
           System.out.println(s.length());        
      };
      
      //to upper case
      Test test2=(s)->{
        System.out.println(s.toUpperCase());
      };
      
       //to lower case
      Test test3=(s)->{
        System.out.println(s.toLowerCase());
      };
      
      //substring present
       Test2 test4=(s,str)->{
         if(s.contains(str)) System.out.println("True");
         else System.out.println("False");
      };
      
      
      
      //concatinate 2 string
       Test2 test5=(s,str)->{
        System.out.println(s.concat(str));
        
      };
      
      test1.operation("Hellow World");
      test2.operation("Hellow World");
      test3.operation("Hellow World");
      test4.operation("Hellow World",demo);
      test5.operation("Hellow World",demo);
      
      System.out.println("Goodbuy, World!");
    }
}
/*
Output:
Hello, World!
12
HELLOW WORLD
hellow world
True
Hellow WorldWorld
Goodbuy, World!
*/

/**/
