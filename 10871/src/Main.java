import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� n�� ���� x�� �޾ƿ´�. (n�� ������ ����, x�� ���� ����)
		 * n���� �̷���� ���� a�� �޾ƿͼ� �迭�� �����Ѵ�.
		 * �ݺ����� ���� x���� ���� ���� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < x)
				System.out.print(arr[i] + " ");
		}
	}
}