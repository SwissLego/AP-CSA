import java.lang.*;
import java.util.*;
public class exercise_06_18 {
    public static void checkPass(){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pass = i.nextLine();
        if(pass.length()<10){
            System.out.println("Password is too short");
        }
        int total=0;
        for(int j=0; j<pass.length(); j++){
            if(Character.isDigit(pass.charAt(j))){
                total++;
            }
        }
        if(total>=3){
            System.out.println("The password is long enough and has the right amount of digit");
        }
    }
}
