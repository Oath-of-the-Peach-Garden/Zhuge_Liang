package level2.day210717;

public class Solution {
	// ������ ǥ��
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
    	return wayCnt + 1; //������ �ڱ� �ڽ�
    }
    
    public static void main(String[] args) {
    	System.out.println(Solution.expressNum(15));
    	
	}
    
}