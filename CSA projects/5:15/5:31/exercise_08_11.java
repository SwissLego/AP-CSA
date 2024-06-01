import java.util.*;

public class exercise_08_11 {
    public static void headOrTail(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511");
        int num = s.nextInt();

        String binary = (Integer.toBinaryString(num)).replace(' ', '0');

        char[][] matrix = new char[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (binary.charAt(index) == '0') ? 'H' : 'T';
                index++;
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}

