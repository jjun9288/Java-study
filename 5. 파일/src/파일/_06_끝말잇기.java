package 파일;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */
public class _06_끝말잇기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		
		while(true) {
		int size = start.length();
		System.out.println("제시어 : " + start);
		System.out.print("입력 : ");
		String me = scan.next();
		
		if(start.charAt(size-1) == me.charAt(0)) {
			start = me;
			}
		else break;
		}
	}
}
