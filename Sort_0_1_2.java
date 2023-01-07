public class Sort_0_1_2 {
    public static void main(String[] args) {
        int[] arry={0,1,2,0,1,2};
        Dutch(arry);


    }
    static int[] Dutch(int[] arry){
        int n= arry.length;
        int low=0;
        int mid=0;
        int high=n-1;
        for (int i = 0; i < n ; i++) {
            if (arry[mid] == 0) {
                int temp = arry[low];
                arry[low] = arry[mid];
                arry[mid] = arry[low];
                mid = mid + 1;
                low = low + 1;
            } else if (arry[mid]==1) {
                mid=mid+1;
            } else if (arry[mid]==2) {
                int temp=arry[mid];
                arry[mid]=arry[high];
                arry[high]=arry[mid];
                high=high-1;
            }
        }
        int[] ans=new int[n];
        for (int j = 0; j < n; j++) {
            ans[j]=arry[j];
        }
        return ans;
    }
}
