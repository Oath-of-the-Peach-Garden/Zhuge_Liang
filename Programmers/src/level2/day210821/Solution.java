package level2.day210821;

public class Solution {

	
	/**
	 * 
	 * ū �� �����
	 * 
	 * number�� 1�ڸ� �̻�, 1,000,000�ڸ� ������ �����Դϴ�.
	 * k�� 1 �̻� number�� �ڸ��� �̸��� �ڿ����Դϴ�.
	 * 
	 * �ð� �ʰ� ��
	 * 
	 * @param number ū �� ���� ����
	 * @param k ������ ����
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
