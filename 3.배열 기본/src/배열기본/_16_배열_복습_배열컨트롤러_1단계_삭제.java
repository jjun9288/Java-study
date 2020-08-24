package 배열기본;

import java.util.Scanner;

public class _16_배열_복습_배열컨트롤러_1단계_삭제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		boolean run = true;
		while(run) {
			System.out.println("[2]삭제");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				int index = 0;
				for(int i=0; i<cnt; i++) {
					if(data == arr[i]) {
						index = i;
					}
				}
				if(index == 0) System.out.println("배열에 없는 값입니다.");
				else {
					for(int i=index; i<cnt-1; i++) {
						arr[i] = arr[i+1];
					}
					cnt -= 1;
				}
				for(int i=0; i<cnt; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}	
		}
	}
}