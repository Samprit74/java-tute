import java.util.function.*;

class Student {
	public int roll;
	public String name;
	public String department;
	private int fees;
	Student(int roll,String Depart,String name,int fees) {
		this.roll=roll;
		this.department=Depart;
		this.name=name;
		this.fees=fees;
		System.out.println("Student name :-"+name+"Created");
	}

	int getFees() {
		return fees;
	}
	
    @Override
    public String toString() {
        return "Student{" +
               ", name='" + name + '\'' +
               ", fees=" + fees +
               '}';
    }
}
public class Main
{
	public static void main(String[] args) {

		Function<int[],Integer> lm= (arr)-> {
			if(arr.length==0)return -1;
			Integer sum=arr[0];
			for(int i=1; i<arr.length; i++) sum+=arr[i];
			return sum;
		};

		Predicate<int[]> lm2=arr -> {
			if(arr.length<1) throw new IllegalArgumentException("Array is empty");
			for(int i:arr) if
				( i%2==0)return true;
			return false;
		};

		int  array=lm.apply(new int[] {1,2,3,4,100});
		System.out.println(array);

		int  array2=lm.apply(new int[] {});
		System.out.println(array2);

		Boolean val =lm2.test(new int[] {45,10,3,999989,5,9});
		System.out.println(val);

		Supplier<Student[]> le3=()-> {
			return  new Student[]{
				new Student(1,"Cse","Samprit",1000),
				new Student(2,"ECE","Samridha",2000),
				new Student(3,"EE","Soma",600)
			};

			 }   ;


		Student[] stu = le3.get();

		for(int i=0; i<stu.length; i++) {
			System.out.println("name :"+stu[i].name+", department :"+stu[i].department+" ,roll:"+stu[i].roll);
		}
		System.out.println("\n");

	

        Consumer<Student> l5= System.out::println ;
	
        
        	Consumer<Student[]> le4= (arr)-> {
			for(Student stud:arr) {
				System.out.println("name :"+stud.name+",fees paid :"+stud.getFees());
				l5.accept(stud);
			}
		};
		
		
			le4.accept(stu);

	}
}
