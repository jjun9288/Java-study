package 배열심화;

import java.util.Scanner;

/*
 * # 문자열 [입력받기]
 * . 숫자나 영어단어 입력 시 커서를 옮길 필요가 없다.
 * . 단, 한글 입력 시 반드시 커서를 끝으로 옮긴 후 작성해야 한다.
 */
public class _17_심화_문자열_입력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.println(name);  //한글 입력 시 이상하게 입력되더라!!

	}

}
