import java.util.*;
public class perfect{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //A perfect number is a positive integer that equals the sum of its proper divisors, excluding the number itself
        
        // int sum=0;
        // for(int i=1;i<n;i++){
        //     if(n%i==0)
        //     {
        //         sum+=i;
        //         System.out.println(i);
        //     }
        // }
        // if(sum==n){
        //     System.out.println("Perfect number");
        // }
        // else{
        //     System.out.println("Not a perfect number");
        // }


        // Count the Number of Factors of a Given Number from 1 to number itself
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            {
    
                count++;
            }
        }
        System.out.println(count);
        
    }
}