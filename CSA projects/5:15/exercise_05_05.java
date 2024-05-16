public class exercise_05_05 {
    public static void main(String[] arg){
        System.out.println("Celcius Fahrenheit | Fahrenheit Celcius");
            for(int i=0, j=20; i<=100 && j<= 270; i++, j++){
                System.out.println(i+"      "+(i*(1.8)+32)+"    |    "+j+"      "+((j-32)*0.56565656565656));
                System.out.println();
            }
    }
}
