package �迭�⺻;
/*int[] hakbuns = {1001, 1002, 1003, 1004, 1005}
*int[] scores  = {  87,   11,   45,   98,   23};
*1�� �л��� �й�, ���� ���
*/
public class _06_�迭_�л������������α׷�_3�ܰ� { //***********************

	public static void main(String[] args) {
		int[] scores = {87, 11, 45, 98, 23};
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int max_score = 0;
		int max_index = 0;
		for(int i=0; i<5; i++) {
			if(max_score < scores[i]) {
				max_score = scores[i];
				max_index = i;  //87, 98 �� ���� ������ �ǹǷ� ���������� i=3���� ������
			}
		}
		System.out.println("���� : " + max_score + ", �й� : " + hakbuns[max_index]);
	}

}
