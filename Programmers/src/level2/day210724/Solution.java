package level2.day210724;

import java.util.Arrays;

public class Solution {
	//n개의 최소공배수
    static int nLCM(int[] arr) {
        int answer = 0;
        //1. 가장 큰 수 기준으로 배수 조회
        Arrays.sort(arr);
        int maxValue = arr[arr.length - 1];
        boolean isDouble = false;
        int var = 2;
        while(!isDouble) {
	        for(int i = 0; i < arr.length - 1; i++) {
	        	if(maxValue % arr[i] == 0) {
	        		isDouble = true;
	        		answer = maxValue;
	        	} else {
	        		isDouble = false;
	        		break;
	        	}
	        }
	        maxValue = arr[arr.length - 1] * var; //2. 가장 큰 수 배수 처리
	        var++;
        }
        return answer;
    }
    
    //JadenCase 문자열 만들기
    static String createJadenCase(String str) {
    	StringBuilder sb = new StringBuilder();
    	char[] strArr = str.toCharArray();
    	char beforeChar = ' ';
    	for(char c : strArr) {
    		if(beforeChar == ' ') {
    			sb.append(Character.toUpperCase(c));
    		} else {
    			sb.append(Character.toLowerCase(c));
    		}
    		beforeChar = c;
    	}
    	
    	return sb.toString();
    }
    
    
    static int[][] multipleArr(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i = 0; i < arr1.length; i++) {
        	//첫번째 2차 행렬 값 조회
        	for(int j = 0; j < arr1[i].length; j++) {
        		//두번째 행렬 세로 값 조회
        		for(int k = 0 ; k < arr2[0].length; k++) {
        			int plusTarget = arr1[i][j] * arr2[j][k];
        			answer[i][k] += plusTarget;
        		}
        	}
        }
        
        return answer;
    }
    
    
    public static void main(String[] args) {
//    	int[] arr = {1,2,3};
//    	System.out.println(Solution.nLCM(arr));
//    	System.out.println(createJadenCase("3people unFollowed me"));
    	int arr1[][] = {{1, 4}, {3, 2}, {4, 1}};
    	int arr2[][] = {{3, 3}, {3, 3}};
    	multipleArr(arr1, arr2);
	}
    
    
}