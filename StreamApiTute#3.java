/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	
	List<Integer> list = List.of(1,3,4,5,77,33,2,12);
	
	Comparator<Integer> compared=(a,b)->{
	    return Integer.compare(a,b);
	};
	
Optional<Integer> inte=list.stream()
	                 .max(compared);
Optional<Integer> inte2=list.stream()
                            .min(compared);
long inte3 = list.stream()
                              .count();
 if (inte.isPresent()) {
            System.out.println("Man: " + inte.get());
        }
	
	 if (inte2.isPresent()) {
            System.out.println("Min: " + inte2.get());
        }
	
	System.out.println("count:"+ inte3);
	}
}
