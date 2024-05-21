import java.util.*;
public class exercise_07_28 {
    public static void randomize(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int num1 = in.nextInt();
        System.out.println("Enter an int: ");
        int num2 = in.nextInt();
        System.out.println(("Enter an int: "));
        int num3 = in.nextInt();
        System.out.println("Enter an int: ");
        int num4 = in.nextInt();

        int[] nums = new int[4];
        nums[0]=(num1);
        nums[1]=(num2);
        nums[2]=(num3);
        nums[3]=(num4);

        for(int i=0; i<nums.length; i++){
            for (int j = 0; j < nums.length; j++) {
				if (i != j){
					System.out.println(nums[i] + " " + nums[j]+" ");
                }
			}

        }

    }
}

