package 파일;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */
public class _10_문자열_속_숫자검사 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		char[] chNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int cnt = 0;
		for(int i=0; i<chNum.length; i++) {
			for(int j=0; j<text.length(); j++) {
				if(chNum[i] == text.charAt(j)) {
					cnt += 1;
				}
			}
		}
		
		if(cnt == text.length()) {
			System.out.println("숫자만 있다.");
		}
		else if(cnt == 0) {
			System.out.println("문자만 있다.");
		}
		else System.out.println("문자와 숫자가 섞여있다.");
	}
}
