package 배열기본;

import java.util.Scanner;

public class _15_배열_복습_배열컨트롤러_1단계_추가 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		boolean run = true;
		while(run) {

			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			
			System.out.println("[1]추가");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("추가할 값 입력 : ");
				int data = scan.nextInt();
				arr[cnt] = data;
				cnt += 1;
				if(cnt == 5) {
					System.out.println("더 이상 추가할 수 없습니다.");
					break;
				}	
			}
		}		
	}
}
