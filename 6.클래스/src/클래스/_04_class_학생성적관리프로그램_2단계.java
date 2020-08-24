package 클래스;

import java.util.Random;
import java.util.Scanner;

class Ex04{
	int[] student_number = {1001,1002,1003,1004,1005};
	int[] scores = new int[5];
}

public class _04_class_학생성적관리프로그램_2단계 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		Ex04 e = new Ex04();
		
		//1. score 배열에 1~100점 사이의 정수 5개 저장
		for(int i=0; i<e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100)+1;
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();
		
		//2. 전교생의 총점과 평균 출력
		int total = 0;
		int avg = 0;
		for(int i=0; i<e.scores.length; i++) {
			total = total + e.scores[i];
		}
		avg = total /e.scores.length;
		System.out.println("total = " + total);
		System.out.println("average = " + avg);
		
		//3. 성적이 60점 이상이면 합격, 합격자 수 출력
		int count=0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] >= 60) {count += 1;}
		}
		System.out.println("합격자 수 = " + count);
		
		//4. 인덱스 입력받아 성적 출력
		System.out.println("인덱스 입력 : ");
		int a = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(i == a) System.out.println(e.scores[i]);
		}
		
		//5. 성적 입력받아 인덱스 출력
		System.out.println("성적 입력 : ");
		int b = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(b == e.scores[i]) System.out.println(i);
		}
		
		//6. 학번 입력받아 성적 출력
		System.out.println("학번 입력 : ");
		int c = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			for(int j=0; j<e.student_number.length; j++) {
				if(c == e.student_number[j]) {
					if(j == i) System.out.println(e.scores[i]);
				}
			}
		}
		
		//7. 1등 학생 학번, 성적 출력
		int max_id = 0;
		int max_score = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(max_score < e.scores[i]) {
				max_id = e.student_number[i];
				max_score = e.scores[i];
			}
		}
		System.out.println("1등 학생의 학번 : " + max_id);
		System.out.println("1등 학생의 성적 : " + max_score);
	}

}
