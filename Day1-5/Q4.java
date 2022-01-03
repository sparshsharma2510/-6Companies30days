import java.util.*;

public class Q4{
  public static void main(String[] args) {
    
  }
  String encode(String s)
  {
    //Your code here
    
    StringBuilder sb = new StringBuilder();
    char ch = s.charAt(0);
    int n = s.length();
    int i = 0; 
    
    while(i < n){
        int count = 0;
        while(i < n && ch == s.charAt(i)){
            i++;
            count++;
        }
        sb.append(ch);
        sb.append(count);
        if(i < n)
          ch = s.charAt(i);
    }
    
    return sb.toString();
  }
}