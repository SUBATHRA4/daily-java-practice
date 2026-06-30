
public class removevowels {
    public static void main(String[] args) {
      String s1 = "hello all";
      String vowels="aAeEiIoOuU";
      int n = vowels.length();
      for(int i=0;i<n;i++){
        char c = vowels.charAt(i);
        if(s1.contains(c+"")){
          s1 = s1.replace(c+"", "");
        }
      }
      System.out.println(s1);
    }
}
