package 클래스;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

class Ex05{
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};	
}
public class _05_class_학생성적관리프로그램_3단계 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "메가IT";
		
		while(true) {
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				for(int i=0; i<mega.arHakbun.length; i++) {
					System.out.println("학번:" + mega.arHakbun[i] + "," + "점수:" + mega.arScore[i]);
				}
			}
			
			else if(choice == 2) {
				int max_score = 0;
				int max_id = 0;
				for(int i=0; i<mega.arHakbun.length; i++) {
					if(max_score < mega.arScore[i])
						max_score = mega.arScore[i];
						max_id = mega.arHakbun[i];
				}
				System.out.println("1등 학생:" + max_id + "점수:" + max_score);
			}
			else if(choice == 3) {
				int min_score = mega.arScore[0];
				int min_id = 0;
				for(int i=0; i<mega.arHakbun.length; i++) {
					if(min_score > mega.arScore[i]) 
						min_score = mega.arScore[i];
						min_id = mega.arHakbun[i];
				}
				System.out.println("꼴등 학생:" + min_id + "점수:" + min_score);
			}
			else if(choice == 4) {
				
			}
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
