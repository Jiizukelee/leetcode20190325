
public class TwoSum {

    public int[] twoSum(int[] givenNums,int traget) {
        int[] result = new int[2];
        int size = givenNums.length;
        boolean exit = false;
        for (int i = 0; i < size; i++) {
            if (exit){
                break;
            }
            for (int j = i+1; j < size; j++) {
                if (traget == (givenNums[i] + givenNums[j])) {
                    result[0] = i;
                    result[1] = j;
                    exit = true;
                    break;
                }
            }
        }
        if ((result[0] == 0) && ((result[1] == 0))){
            System.out.println("不成立");
        }
        else {
            for (int num : result) {
                System.out.print(num + "\t");
            }
        }
        return result;

    }
}
