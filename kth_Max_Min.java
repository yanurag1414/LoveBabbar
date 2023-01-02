public class kth_Max_Min {
    public static void main(String[] args) {                   //Cycle sort is used only when the numbers are in order.
        int[] array={2,4,5,7,6,8};   //just for example.
        int k=3;
        Max_Min(array,k);

    }
    static void Max_Min(int[] arry,int k) {
        int n = arry.length;                 //n is a length of array.
        for (int i = 0; i < n - 1; i++) {     //using cycle sort.
            for (int j = i + 1; j < n ; j++) {
                if (arry[j] < arry[j - 1]) {
                    int tem = arry[j - 1];
                    arry[j - 1] = arry[j];
                    arry[j] = tem;
                } else {                  //if the group is already sorted then it should not be considered.
                    break;
                }
            }
        }
        System.out.println("Maximum number at"+k+"th position is:" + arry[n-k]);
        System.out.println("Minimum number at" +k+"th position is:" + arry[k-1]);
    }
}
