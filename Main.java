import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         switch(n){
            case 2,3,4,5,6 :
                                {
                System.out.println("weekdays");
                break;
                }
                case 1,7 :
                                  {
                  System.out.println("weekend");
                  break;
                }
    
        
    }
    sc.close();
}
}