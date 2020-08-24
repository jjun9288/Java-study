package 배열기본;

import java.util.Scanner;

public class _17_배열_복습_배열컨트롤러_1단계_삽입 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			System.out.println("[3]삽입");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 3) {
				
				if(cnt == 5) System.out.println("더이상 입력할 수 없습니다.");
				
				System.out.print("삽입할 위치 입력 : ");
				int idx = scan.nextInt();
				if(cnt < idx || idx < 0) {
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
				}
				
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				
				for(int i=cnt; i>idx; i--) {
					arr[i] = arr[i-1];     //20을 2번째 인덱스로 안전하게 미룬 후
				}
				arr[idx] = data;           //20이 있던 자리에 data 삽입
				cnt+=1;
				for(int i=0; i<cnt; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}	
		}
	}
}
