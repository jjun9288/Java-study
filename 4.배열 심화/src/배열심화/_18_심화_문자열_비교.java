package 배열심화;

import java.util.Scanner;

/*
 * # 문자열 [비교]
 * . 문자열 비교는 equals() 메서드를 통해 확인할 수 있다.
 */
public class _18_심화_문자열_비교 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "윤준영";
		
		System.out.println("이름 입력 : ");
		String my_name = scan.next();
		
		if(name == my_name) System.out.println("일치");
		else System.out.println("불일치");
		
		if(name.equals(my_name)) System.out.println("일치");
		else System.out.println("불일치");
	}

}
