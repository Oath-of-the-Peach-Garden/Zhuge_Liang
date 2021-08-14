package level2.day210814;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution {

	
	   /**
     * 위장
     * 
     * 스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return
     * 
     * @param clothes 스파이가 가진 의상들이 담긴 2차원 배열
     * @return 서로 다른 옷의 조합의 수를 return
     */
    static int setClothes(String[][] clothes) {
        int answer = 1;
        
        // type, cloth
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(int i = 0 ; i < clothes.length; i++) {
        	String clothType = clothes[i][1];
        	
        	List<String> values = map.get(clothType);
        	if(values == null) {
        		values = new ArrayList<String>();
        	}
        	String clothName = clothes[i][0];
        	values.add(clothName);
        	map.put(clothType, values);
        }
        
        Iterator<String> keySet = map.keySet().iterator();
        while(keySet.hasNext()) {
        	System.out.println("answer : " + answer);
        	int clotheSize = map.get(keySet.next()).size() ; // 종류에 따른 옷 가지 갯수
        	System.out.println("list size : " + clotheSize);
        	answer += (clotheSize * answer); //옷 가지 갯수 * 이전 가지수의 곱(매칭 갯수 구하기)
        	System.out.println("------------------------------");
        }
        
        return answer - 1; //-1 하는 이유는 곱셈에 0가 되지 않기위해 answer에 초기값을 1로 세팅
    }
	

}
