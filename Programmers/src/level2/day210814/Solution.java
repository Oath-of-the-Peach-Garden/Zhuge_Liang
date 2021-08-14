package level2.day210814;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution {

	
	   /**
     * ����
     * 
     * �����̰� ���� �ǻ���� ��� 2���� �迭 clothes�� �־��� �� ���� �ٸ� ���� ������ ���� return
     * 
     * @param clothes �����̰� ���� �ǻ���� ��� 2���� �迭
     * @return ���� �ٸ� ���� ������ ���� return
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
        	int clotheSize = map.get(keySet.next()).size() ; // ������ ���� �� ���� ����
        	System.out.println("list size : " + clotheSize);
        	answer += (clotheSize * answer); //�� ���� ���� * ���� �������� ��(��Ī ���� ���ϱ�)
        	System.out.println("------------------------------");
        }
        
        return answer - 1; //-1 �ϴ� ������ ������ 0�� ���� �ʱ����� answer�� �ʱⰪ�� 1�� ����
    }
	

}
