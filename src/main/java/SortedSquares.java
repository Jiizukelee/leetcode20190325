
public class SortedSquares {
    public int[] sortedSquares(int[] arr) {
        int[] arrSquare = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrSquare[i] = arr[i]*arr[i];
        }
        return sort(arrSquare);
    }

    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
