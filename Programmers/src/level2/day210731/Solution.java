package level2.day210731;

import java.util.ArrayList;

public class Solution {
    
	/**
	 * ���̵�2 - ��� ���� 
	 * @param progresses �۾��� ������ ���� ���� �迭
	 * @param speeds �۾��� ���� �ӵ��� ���� ���� �迭
	 * @return ������ ����� ����
	 */
    static int[] devFunc(int[] progresses, int[] speeds) {
    	ArrayList<Integer> answerList = new ArrayList<>();

    	int cnt = 1;
    	
    	int firstPubday = (int)Math.ceil((double)(100 - progresses[0]) / speeds[0]);
    	answerList.add(cnt);
    	
    	int idx =  0;
    	for(int i = 1; i < speeds.length; i++) {
    		//100% - �۾� ������ = �ܿ� ������
    		//�ܿ� ������ / speed = ���� �ҿ� ����
    		int day = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]) + 1;
    		//ù��° �����Ϻ��� ���� statck �� �����ϴ� �۾����� ª���� ù��° �����Ͽ� �����Ͽ� ���� �����Ѵ�.
    		if(day <= firstPubday) {  
    			cnt++;
    			if(idx < answerList.size()) {
    				answerList.set(idx, cnt);
    			} else {
    				answerList.add(cnt);
    			}
    		} else {
    			cnt = 1;
    			answerList.add(cnt);
    			//�ʱ�ȭ
    			firstPubday = day;
    			idx++;
    		}
    	}
    	
    	int[] answer = new int[answerList.size()];
        
    	for(int i = 0 ; i < answerList.size(); i++) {
    		answer[i] = answerList.get(i);
    	}
    	
        return answer;
    }
    


	public static void main(String[] args) {
//    	int[] progresses = {93, 30, 55};
//    	int[] speeds = {1, 30, 5};
//    	int[] progresses = {95, 90, 99, 99, 80, 99};
//    	int[] speeds = {1, 1, 1, 1, 1, 1};
//    	int[] progresses = {0,0,0,0};
//    	int[] speeds = {100,50,34,25};
//    	int[] progresses = {95, 95, 95, 95};
//    	int[] speeds = {4, 3, 2, 1};
//    	int[] progresses = {70};
//    	int[] speeds = {20};
//    	System.out.println(Solution.devFunc(progresses, speeds));
    	
	}
    
    
}