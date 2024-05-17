import java.util.*;
public class exercise_05_17{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of lines: ");
        int lines = in.nextInt();
        for(int i=lines; i>=0; i--){
            for(int k=1; k<=i; k++){
                System.out.print("*   ");
            }
            for(int l = i; l>=2; l--){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}