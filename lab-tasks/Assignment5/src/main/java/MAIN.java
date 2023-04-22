

public class MAIN {
    public static void main(String args[])
    {
        countOne count = new countOne();
        int arr1[] = {0, 0, 0, 0, 0, 1, 1};
        int arr2[] = {0, 0, 0, 1, 1, 1, 1};
        int arr3[] = {0, 0, 0, 0, 0, 0, 0};
        
        int one = arr1.length-1;
        int two = arr2.length-1;
        int three = arr3.length-1;
        
        System.out.println("Count of 1's in given array is " + count.countOnes(arr1, 0, one));
        System.out.println("Count of 1's in given array is " + count.countOnes(arr2, 0, two));
        System.out.println("Count of 1's in given array is " + count.countOnes(arr3, 0, three));
    }
}
