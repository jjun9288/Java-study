package 파일;

import java.util.Scanner;

/*
 * # 문자열 비교
 * . equals() 메서드 사용없이 문자의 일치여부 비교
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */
public class _09_문자열_비교 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			String name = "코끼리";
			System.out.println(name);
			
			System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
			String myName = scan.next();
			int check = -1;
			if(name.length() == myName.length()) {
				check = 1;
				for(int i=0; i<name.length(); i++) {
					if(name.charAt(i) != myName.charAt(i)) {
						check = -1;
					}
				}
			}
			
			if(check == 1) System.out.println("true");
			else if(check == -1) System.out.println("false");
	}
}
