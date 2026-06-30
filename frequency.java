import java.util.*;
class frequency{
    public static void main(String[] args){
        String s;
        int count=0;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            
           for(int j=i+1;j<s.length();j++){
            
            if(s.charAt(i)==s.charAt(j)){
                count++;
            }
           }
           System.out.println(s.charAt(i)+":" +count);
           count=0;
        }

    }
}