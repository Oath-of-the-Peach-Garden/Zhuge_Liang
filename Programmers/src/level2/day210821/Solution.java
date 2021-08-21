package level2.day210821;

public class Solution {

	
	/**
	 * 
	 * 큰 수 만들기
	 * 
	 * number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
	 * k는 1 이상 number의 자릿수 미만인 자연수입니다.
	 * 
	 * 시간 초과 뜸
	 * 
	 * @param number 큰 수 만들 숫자
	 * @param k 제거할 숫자
	 * @return
	 */
	static String makeBigNum(String number, int k) {
		for(int i = 0 ; i < k; i++) {
			number = getBigNum(number);
		}
		return number;
	}

	private static String getBigNum(String number) {
		String tempBig = "";
		for(int i = 0 ; i < number.length(); i++) {
			char[] array = number.toCharArray();
			array[i] = ' ';
			String currentStr = String.valueOf(array).replaceAll(" ","");
			if(currentStr.compareTo(tempBig) > 0) {
				tempBig = currentStr;
			}
		}
		return tempBig;
	}
	

	public static void main(String[] args) {
		System.out.println(makeBigNum("1231234", 3));
	}
	

}
