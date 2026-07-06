import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        int arr[] = {4,8,3,1,7};
        int k = 4; 
        int n = arr.length;
        int max = 0;
        for(int i=0;i<k;i++){
            max+=arr[i];
        }
        // System.out.println(max);
        int tempSum = 0;
        for(int i=1;i<=n-k;i++){ // [4,8,3,1,7]
            for(int j:Arrays.copyOfRange(arr,i, k+i)){
                tempSum += j;
            }
            if(tempSum > max) {
                max = tempSum;
            }
            tempSum = 0;
        }
        System.out.println(max);
    }
}