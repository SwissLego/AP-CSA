public class exercise_05_15 {
    public static void main(String[] args) {
        int s = '!';
        int e = '`';

        for(int i=s, j=1; i<=e; i++, j++){
            if(j%10==0){
                System.out.println();
            }
            System.out.print((char)i);
        }
    }
}
