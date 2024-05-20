import java.util.Scanner;
public class exercise_05_14{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = i.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = i.nextInt();

        int gcd = Math.min(n1, n2);

        while(n1%gcd!=0||n2%gcd!=0){
            gcd--;
        }
        System.out.println("The GCD of "+n1+" and "+ n2 + " is: "+ gcd);
    }
}