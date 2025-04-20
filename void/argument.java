
public class argument {
    //Greet
    static void greet(String name, int age){
        System.out.println("Hi, " + name);
        System.out.println("You are " + age + " years old.");
    }
    
    //Operator
    static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        greet("Dave", 18);
        add(10,10);
    }
}
