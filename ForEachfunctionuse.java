
import java .util.*;
import java.util.function.Consumer;

class Main{
    public static void main(String[] arg){
        
        List<String> list= new ArrayList<>();

        list.add("10");
         list.add("20");
         list.add("30");
         list.add("40");
         
         Consumer<String> cn=obj->{
           if(obj instanceof String){
               String s=(String)obj;
               System.out.println(s.toUpperCase());
           }else{
             System.out.println(obj);  
           }  
         };
        
        list.forEach(cn);
        
        list.forEach(System.out::println);
        
        
    }
}
