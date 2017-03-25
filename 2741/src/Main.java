import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int a = sc.nextInt();
		if(a<=100000) {
			for(int i=1; i<=a; i++)
				System.out.println(i);
		}
        else
            System.out.print("Error: 100,000이하의 수여야 합니다.");
	}
}