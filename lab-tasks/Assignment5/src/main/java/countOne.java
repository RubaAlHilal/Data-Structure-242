
public class countOne {

    public int countOnes(int[] arr, int left, int right){
        if (arr[right] == 0){
            return 0;
        }
        if (arr[left] == 1) {
            return (right - left + 1);
        }
        int mid = (left + right) / 2;
        return countOnes(arr, left, mid) + countOnes(arr, mid + 1, right);
    }
}

