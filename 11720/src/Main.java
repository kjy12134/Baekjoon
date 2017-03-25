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
		 * 숫자의 개수를 받아온다. 1~100사이
		 * 둘째 줄에 숫자 n개를 공백없이 받아온다.
		 * n개의 숫자를 모두 더한다. 
		 */
		if(num>=1 && num <=100)
		{
			for(int i=0; i<str.length(); i++)
				sum+=str.charAt(i)-'0';
		}
		
		System.out.println(sum);
		}
}