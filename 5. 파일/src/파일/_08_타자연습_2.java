package 파일;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[2단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
 * 예)
 * 문제 : mys*l
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : *sp
 * 입력 : jsp
 * ...
 */
public class _08_타자연습_2 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		for(int i=0; i<words.length; i++) {
			int k = ran.nextInt(words.length);
			String temp = words[i];
			words[i] = words[k];
			words[k] = temp;
		}
		
		int i = 0;
		while(i < words.length) {
			int size = words[i].length();
			int r = ran.nextInt(size);
			System.out.print("문제 : ");
			for(int j=0; j<size; j++) {
				if(r == j) {
					System.out.print("*");	
				}
				else {
					System.out.print(words[i].charAt(j));  //한 단어씩 출력 ex) java 이고 r=2라면
					                                       //                   j=0일 때 j 출력 후 ++
				}
			}
			System.out.println();
			
			System.out.print("입력 : ");
			String me = scan.next();
			if(words[i].equals(me)) {
				i += 1;
			}
		}
	}
}
