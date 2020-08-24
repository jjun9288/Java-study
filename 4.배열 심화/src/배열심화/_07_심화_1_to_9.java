package 배열심화;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[2단계] : 1 to 9
 * 1. arr배열에 1~9 사이의 숫자를 저장한다.
 * 2. shuffle을 통해 숫자를 섞는다.
 * 3. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 4. 정답을 맞추면 해당 값은 0으로 변경되어 모든 값이 0이되면 게임은 종료된다.
 */
public class _07_심화_1_to_9 {

	public static void main(String[] args) {
		int[] arr = new int[9];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//arr 에 1 to 9 저장
		for(int i=0; i<9; i++) {
			arr[i] = i+1;
		}
		//arr shuffle
		for(int i=0; i<9; i++) {
			int r = ran.nextInt(9);
			int temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
		}
		int num = 1;   //1부터 9까지 순서대로 입력, 1부터 입력해야 하므로 초깃값을 1로 둔다.
		while(true) {
		//arr 3행 3열로 만들기
		for(int i=0; i<9; i++) {
			System.out.print(arr[i] + " ");
			if(i%3 ==2) {
				System.out.println();
				}
		}
		System.out.print("입력 : ");
		int data = scan.nextInt();
		if(arr[data] == num) {
			arr[data] = 0;
			num += 1;
			}
		if(num == 10) break;
		}
	}	
}
