package 배열기본;

import java.util.Scanner;

/*
*int[] arr = {87, 11, 45, 98, 23}
*문제1) 인덱스를 입력받아 성적 출력
*정답1) 인덱스 입력 : 1	성적 : 11점
*문제2) 성적을 입력받아 인덱스 출력
*정답2) 성적 입력 : 11		인덱스 : 1
*int[] hakbuns = {1001, 1002, 1003, 1004, 1005}
*int[] scores  = {  87,   11,   45,   98,   23};	
*문제3) 학번을 입력받아 성적 출력
*정답3) 학번 입력 : 1003	성적 : 45점
*/
public class _05_배열_학생성적관리프로그램_2단계 {  //**

	public static void main(String[] args) {
		int[] arr = {87,11,45,98,23};
		Scanner scan = new Scanner(System.in);
		//문제1)
		System.out.println("인덱스 입력 : ");
		int index = scan.nextInt();
		System.out.println(arr[index] + "점");
		//문제2)
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(score == arr[i]) {System.out.println(i + "번");}
		}
		//문제3)
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		System.out.println("학번 입력 : ");
		int 학번 = scan.nextInt();
		for(int j=0;j<5;j++) {
				if(학번 == hakbuns[j]) {System.out.println(arr[j] + "점");}
			}
			
	}

}
