import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void insertion(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0 ;j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
}