package �迭��ȭ;

import java.util.Random;

/*
* # ��÷���� 1��Ʈ
* 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
* 2. �������� 5���� ������ �����ϵ�,
*    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
*/
public class _20_��ȭ_��÷����_1��Ʈ {

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

			// ��÷������ ������ ��
			if (check == 1 && win == 0) {
				win = 1;
			}
			// ��÷������ ���Դµ� �� ������ ��
			else if (check == 1 && win == 1) {
				i = i - 1;
			}
			// ��÷������ �� ������ ��
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
