import java.util.*;

public class Q2{
	public static void main(String[] args) {
		
	}
	int doOverlap(int l1[], int r1[], int l2[], int r2[]) {
        //NOTE: 
        //For some reason in this question it is strictly assumed that
        //r2 will always be on the bottom right of l2 and same goes for r1 for l1
        
        //Step 1:
        //Check x-axis overlap
        //if l2/l1 start under a common interval
        if((l2[0] >= l1[0] && l2[0] <= r1[0]) || (l1[0] >= l2[0] && l1[0] <= r2[0])){
            //Step 2: Check y-axis overlap
            //Now if they have started, then check r2/r1 overlaps
            if((r2[1] <= l1[1] && r2[1] >= r1[1]) || (r1[1] <= l2[1] && r1[1] >= r2[1]))
                return 1;
            return 0;
        }
        return 0;
    }
}