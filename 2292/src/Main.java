import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� n�� �Է¹޴´�.
         * ������ ���� route�� �����.
         * ���� n�� 1�̶�� route�� 1�̴�.
         * n�� 2�̻��� ���, route�� ã�� ��Ģ�� ���Ѵ�.
         * route�� ã�������� �ݺ��ϸ鼭 
         * n�� ��Ģ�� �����Ѵٸ� route���� �ο��Ѵ�.
         * route���� ����Ѵ�.
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