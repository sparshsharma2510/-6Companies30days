import java.util.*;

public class Q3{
	public static void main(String[] args) {
		
	}
	
	public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        if(k == 1)
            return 0;

        int i = 0, j = 0;
        long curr = 1;
        int ans = 0;
        
        while(i < n){
            curr *= a[i];
            i++;
            if(curr >= k){  //minimise window
                while(j < i && curr >= k){
                    ans += i-j-1;
                    curr /= a[j];
                    j++;
                }
            }
        }
        while(j < n){
            ans += n-j;
            j++;
        }
        
        return ans;
    }
}