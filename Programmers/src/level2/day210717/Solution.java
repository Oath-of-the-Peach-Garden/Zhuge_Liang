package level2.day210717;

public class Solution {
	// 숫자의 표현
    static int expressNum(int n) {
    	int wayCnt = 0;
    	int sum = 0;
    	int init = 1;
    	while(true) {
	    	for(int i = init; i < n; i++) {
	    		sum += i;
	    		if(sum == n) {
	    			wayCnt++;
	    			break;
	    		} else if(sum > n) {
	    			break;
	    		}
	    	}
	    	if(init == n) {
	    		break;
	    	}
	    	sum = 0;
	    	init++;
    	}
    	return wayCnt + 1; //마지막 자기 자신
    }
    
    public static void main(String[] args) {
    	System.out.println(Solution.expressNum(15));
    	
	}
    
}