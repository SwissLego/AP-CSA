import java.util.*;
public class exercise_05_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        for(int i = 2; num / i != 1; ){
            if(num%i==0){
                System.out.print(i+",");
                num /= i;
            }else{
                i++;
            }
        }
        System.out.println(num);
    }
}
