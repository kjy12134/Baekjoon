import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=1 && num <= 9) {
		for(int i = 1; i <= 9; i++) {
			int multiple = num*i;
			System.out.println(num + " * " + i + " = " + multiple);
		}
		}
		else
			System.out.println("Error: 1~9사이의 수를 입력하세요.");
	}
}