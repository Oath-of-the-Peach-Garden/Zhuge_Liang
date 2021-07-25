package level2.day210724;

import java.util.Arrays;

public class Solution {
	//n���� �ּҰ����
    static int nLCM(int[] arr) {
        int answer = 0;
        //1. ���� ū �� �������� ��� ��ȸ
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
	        maxValue = arr[arr.length - 1] * var; //2. ���� ū �� ��� ó��
	        var++;
        }
        return answer;
    }
    
    //JadenCase ���ڿ� �����
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
        	//ù��° 2�� ��� �� ��ȸ
        	for(int j = 0; j < arr1[i].length; j++) {
        		//�ι�° ��� ���� �� ��ȸ
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