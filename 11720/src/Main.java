import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int sum = 0;
		/*
		 * ������ ������ �޾ƿ´�. 1~100����
		 * ��° �ٿ� ���� n���� ������� �޾ƿ´�.
		 * n���� ���ڸ� ��� ���Ѵ�. 
		 */
		if(num>=1 && num <=100)
		{
			for(int i=0; i<str.length(); i++)
				sum+=str.charAt(i)-'0';
		}
		
		System.out.println(sum);
		}
}