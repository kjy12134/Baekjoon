import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� a,b,c�� �޾ƿ´�. (1<=a,b,c<=100)
		 * �޾ƿ� ���� 3���� �迭�� ��� �����Ѵ�(��������)
		 * 2��° �迭���� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int tmp = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
			System.out.print(arr[1]);
	}
}