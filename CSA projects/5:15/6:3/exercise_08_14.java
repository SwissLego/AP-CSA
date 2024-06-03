import java.util.*;
public class exercise_08_14 {
    public static void matrix(){
        Scanner s = new Scanner(System.in);
        System.out.print("Eter the size for the matrix: ");
        int num = s.nextInt();
        int[][] matrix = new int[num][num];
        int rand = (int)Math.random()+1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(rand);
            }
            System.out.println();
        }

        for(int q=0; q<matrix.length; q++){
            if(matrix[q].length == 0){
                System.out.println("All 0's on row "+q);
            }
            if(matrix[q].length == 1){
                System.out.println("All 1's on row"+q);
            }
        }

        for(int w=0; w<matrix[0].length; w++){
            if(matrix[w].length == 0 || matrix[w].length == 1){
                System.out.println("Same number column");
            }else{
                System.out.println("No same number column");
            }
        }
    }
}
