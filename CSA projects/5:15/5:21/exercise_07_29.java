public class exercise_07_29 {
    public static void dice(){
        int d1 = (int)(Math.random()*6)+1;
        int d2 = (int)(Math.random()*6)+1;
        int d3 = (int)(Math.random()*6)+1;

        int sum=0;
        while(sum!=25){
            for(int i=0; i<=6; i++){
                for(int j=0; j<=6; j++){
                    for(int k=0; k<=6; k++){
                        if((d1+d2+d3)==9){
                            System.out.println(i +" "+ j+" "+k);
                            sum++;
                        }
                    }
                }
            }
        }
    }
}
