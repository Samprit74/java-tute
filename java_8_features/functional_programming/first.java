class calc{
    static void calculate(Ao ao){
        ao.calculate((int) 10,(int) 20);
    }
}

class Main{
    public static void main(String ar[]){
       
        
        calc.calculate(new Addetion());
         calc.calculate(new Substraction());
          calc.calculate(new Multiply());
         calc.calculate(new Devide());
    }
}
interface Ao{
    abstract void calculate(int a, int b);
}

class Addetion implements Ao{
    public void calculate(int a,int b){
        int c=a+b;
        System.out.println("Addetion is :"+c);
    }
}

class Substraction implements Ao{
    public void calculate(int a,int b){
        int c=a-b;
        System.out.println("Substraction is :"+c);
    }
}

class Multiply implements Ao{
    public void calculate(int a,int b){
        int c=a*b;
        System.out.println("Multiplication is :"+c);
    }
}

class Devide implements Ao{
    public void calculate(int a,int b){
        int c=a/b;
        System.out.println("Devition is :"+c);
    }
}
