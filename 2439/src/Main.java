import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=1 && num <= 100) {
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >=i+1; j--)
				System.out.print(" ");
			for(int k = 1;k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		}
		else
			System.out.println("Error: 1~100사이의 수를 입력하세요.");
	}
}