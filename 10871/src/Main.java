import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수 n과 정수 x를 받아온다. (n은 정수의 개수, x는 기준 정수)
		 * n개로 이루어진 수열 a를 받아와서 배열에 저장한다.
		 * 반복문을 통해 x보다 작은 수는 출력한다.
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