import java.util.*;
class diagonalmatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("enter the number of rows and columns");
        a=sc.nextInt();
        b=sc.nextInt();
        int arr1[][]=new int[a][b];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j]=sc.nextInt();
        }
        }
        boolean flag = false;
      for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[i].length;j++){
          if((i==j && arr1[i][j] == 0) || (i!=j && arr1[i][j] != 0)){
            flag = true;
            break;
          }
        }
        if(flag) break;
      }
      if(flag)
        System.out.println("No");
      else
        System.out.println("Yes");

    }
}