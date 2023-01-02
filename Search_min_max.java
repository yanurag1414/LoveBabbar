public class Search_min_max {
    public static void main(String[] args) {
        int[] array={2,4,5,7,6,8};
        Max_Min(array);

    }
    static void Max_Min(int[] arry){
        int n=arry.length;                 //n is a length of array.
        for (int i = 0; i < n-1; i++) {     //using cycle sort.
            for (int j = i+1; j <n-1 ; j++) {
                if(arry[j]<arry[j-1]){
                    int tem=arry[j-1];
                    arry[j-1]=arry[j];
                    arry[j]=tem;
                }else{                  //if the group is already sorted then it should not be considered.
                    break;
                }
            }
        }
        System.out.println("Maximum number:"+arry[n-1]);
        System.out.println("Minimum number:"+arry[0]);
    }
}
