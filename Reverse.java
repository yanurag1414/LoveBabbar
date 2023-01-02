public class Reverse {
    public static void main(String[] args) {
        int[] arry={1,2,3,4,5};
        re_verse(arry);

    }
    static void re_verse(int[] arry){
        int n= arry.length;
        int[] a=new int[n];
        int j=n;
        for (int i = 0; i<n; i++) {
            a[j-1]=arry[i];
            j=j-1;

        }
        for (int k = 0; k < n; k++) {
            System.out.print(a[k]+" ");

        }
    }
}
