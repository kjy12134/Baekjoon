import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					break;
				}
			}
			if(count==1) {
				System.out.println(str.charAt(i));
				break;
			}
			
		}
		

	}
}
