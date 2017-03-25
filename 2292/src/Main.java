import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자 n을 입력받는다.
         * 정수형 변수 route를 만든다.
         * 만약 n이 1이라면 route는 1이다.
         * n이 2이상일 경우, route를 찾는 규칙을 구한다.
         * route를 찾을때까지 반복하면서 
         * n이 규칙에 부합한다면 route값을 부여한다.
         * route값을 출력한다.
		 */	
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int route = 0;
        
        if(n == 1)
            route = 1;
        else {
        	for(int i = 0; ; i++) {
        		if(n>= 3*(i*(i-1))+2 && n<=3*((i-1)*(i+2))+7) {
        			route = i+1;
        			break;
        		}
        	}
        }
        System.out.print(route);
	}
}