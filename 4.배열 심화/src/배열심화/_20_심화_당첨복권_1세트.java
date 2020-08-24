package 배열심화;

import java.util.Random;

/*
* # 당첨복권 1셋트
* 1. 3이 연속으로 3번 등장하면 당첨복권이다.
* 2. 랜덤으로 5개의 복권을 생성하되,
*    당첨복권은 한 개만 생성되도록 설정한다.
*/
public class _20_심화_당첨복권_1세트 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] lotto = new int[5][7];

		int win = 0;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 7; j++) {
				// int r = ran.nextInt(2);
				lotto[i][j] = ran.nextInt(9) + 1;
			}

			int check = -1;
			int count = 0;
			for (int j = 0; j < 7; j++) {
				if (lotto[i][j] == 3) {
					count += 1;
				}else {
					count = 0;
				}
				
				if (count == 3) {
					check = 1;
				}
			}

			// 당첨복권이 나왔을 때
			if (check == 1 && win == 0) {
				win = 1;
			}
			// 당첨복권이 나왔는데 또 나왔을 때
			else if (check == 1 && win == 1) {
				i = i - 1;
			}
			// 당첨복권이 안 나왔을 때
			else if (check == -1 && win == 0) {
				i = i - 1;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(lotto[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
