package level2.day210731;

import java.util.ArrayList;

public class Solution {
    
	/**
	 * 난이도2 - 기능 개발 
	 * @param progresses 작업의 진도가 적힌 정수 배열
	 * @param speeds 작업의 개발 속도가 적힌 정수 배열
	 * @return 배포된 기능의 갯수
	 */
    static int[] devFunc(int[] progresses, int[] speeds) {
    	ArrayList<Integer> answerList = new ArrayList<>();

    	int cnt = 1;
    	
    	int firstPubday = (int)Math.ceil((double)(100 - progresses[0]) / speeds[0]);
    	answerList.add(cnt);
    	
    	int idx =  0;
    	for(int i = 1; i < speeds.length; i++) {
    		//100% - 작업 진도율 = 잔여 진도율
    		//잔여 진도율 / speed = 예상 소요 일자
    		int day = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]) + 1;
    		//첫번째 배포일보다 다음 statck 에 존재하는 작업일이 짧으면 첫번째 배포일에 포함하여 같이 배포한다.
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
    			//초기화
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