import java.util.*;
public class exercise_06_17{
    public static void printMatrix(int n){
        int rand = (int)(Math.random())+1;
        Scanner i = new Scanner(System.in);

        System.out.print("Enter n");
        int num = i.nextInt();

        for(int j=num; j<0; j++){
            for(int k=num; k<0; k++){
                System.out.print(rand+" ");
            }
            System.out.println();
        }
    }
}