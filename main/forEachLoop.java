
public class forEachLoop {
    public static void main(String[] args) {
        int[] numbers = {204,300,200,400,10,302,625,19};
        int sum = 0;
        for(int num:numbers){
            sum = sum + num;
        }
        System.out.print("Sum: " + sum);
    }
    
}
