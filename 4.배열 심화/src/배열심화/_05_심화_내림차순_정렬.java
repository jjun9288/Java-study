package �迭��ȭ;
/*
 * # �����ϱ�
 * 1. �ε��� 0���� �������� �˻��Ѵ�.
 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
 * 3. �ε��� 1�����Ѵ�.
 * 4. [1~3]�� ������ �ݺ��Ѵ�.
 * ��)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */
public class _05_��ȭ_��������_���� {

	public static void main(String[] args) {
		int[] score = {10,50,30,40,80,7};
		for(int i=0; i<6; i++) {
			int max_num = score[i];
			int max_idx = i;
			for(int j=i; j<6; j++) {
				if(max_num < score[j]) {
					max_num = score[j];
					max_idx = j;
				}
			}
			int temp = score[i];
			score [i] = score[max_idx];
			score[max_idx] = temp;
		}
		for(int i=0; i<6; i++) System.out.print(score[i] + " ");
	}

}
