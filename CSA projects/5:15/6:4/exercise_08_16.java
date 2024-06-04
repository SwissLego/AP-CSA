public class exercise_08_16 {
    public static void sort(int m[][]){
        for (int i = 0; i < m.length; i++){
            for (int j = i + 1; j < m.length; j++){
                int temp =0; 
                if(m[j][0] < m[i][0]){

                    temp = m[i][0];
                    m[i][0] = m[j][0];
                    m[j][0] = temp;
                }
            }
        }
        for (int h= 0; h < m[0].length; h++){
            for (int a = h + 1; a < m[0].length; a++){
                int temp =0; 
                if(m[0][a] < m[0][h]){
                    temp = m[0][h];
                    m[0][h] = m[0][a];
                    m[0][a] = temp;
                }
            }
        }
        for(int q=0; q<m.length; q++){
            for(int w=0; w<m[0].length; w++){
                System.out.println(m[q][w]);
            }
        }
    }
}
