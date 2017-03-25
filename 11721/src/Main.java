import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문자를 받아온다. (1~100자)
		 * 받아온 문자열의 길이를 10으로 나눈 몫값을 저장한다.
		 * 목값을 반복하며 10자씩 출력을 반복한다.
		 * 처음 10자 출력 후 +10을 더해 다음 10자를 출력한다.
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
			System.out.println("Error: 단어는 1자이상 100자이하여야 합니다.");
		}
}