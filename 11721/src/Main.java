import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���ڸ� �޾ƿ´�. (1~100��)
		 * �޾ƿ� ���ڿ��� ���̸� 10���� ���� ���� �����Ѵ�.
		 * ���� �ݺ��ϸ� 10�ھ� ����� �ݺ��Ѵ�.
		 * ó�� 10�� ��� �� +10�� ���� ���� 10�ڸ� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = str.length();
		int index = 0;
		int line;
		
		if(length%10 == 0)
			line = length/10;
		else
			line = (length/10)+1;
		
		if(length >= 1 && length <= 100) {
			
			for(int i=0; i<line; i++,index+=10) {
					for(int j=index; j<index+10 && j<length; j++) {
						System.out.print(str.charAt(j));
					}
				System.out.println();
				}
			}
		
		else
			System.out.println("Error: �ܾ�� 1���̻� 100�����Ͽ��� �մϴ�.");
		}
}