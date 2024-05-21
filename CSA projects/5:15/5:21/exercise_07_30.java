public class exercise_07_30 {
    public static boolean isConsecutiveFourTimes(int[] values){
        int count = 1; 
		
		for (int i = 0; i < values.length - 1; i++){
			if (values[i] == values[i + 1]){
				count++;
            }
			if (count >= 4){ 
				return true;
            }
			if (values[i] != values[i + 1]){
				count = 1;	
            }
		}
		return false;
    }
}
