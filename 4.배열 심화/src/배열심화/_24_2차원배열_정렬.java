package �迭��ȭ;
/*
 * # 2�����迭[����]
 * ���� : ��
 * ���� : ���
 * ���� : ���
 * ö�� : ���
 * ö�� : ���
 */
public class _24_2�����迭_���� {

	public static void main(String[] args) {
		
		int jangCount = 5;
		String[][] jang = {
			{"ö��", "���"},
			{"����", "��"},
			{"ö��", "���"},
			{"����", "���"},
			{"����", "���"}
		};
		//1�� ���� (ö��, ����)
		for(int i=0; i<jang.length; i++) {
			String max = jang[i][0];
			int max_index = i;
			for(int j=i; j<jang.length; j++) {
				if(max.compareTo(jang[j][0]) > 0) {
					max = jang[j][0];
					max_index = j;
				}
			}
			
			String[] temp = jang[i];
			jang[i] = jang[max_index];
			jang[max_index] = temp;
		}
		
		//2�� ����(���, ��, ���)
		for(int i=0; i<jang.length; i++) {
			String max = jang[i][1];
			int max_index = i;
			for(int j=i; j<jang.length; j++) {
				if(jang[i][0].equals(jang[j][0])) {
					if(max.compareTo(jang[j][1]) > 0) {
						max = jang[j][1];
						max_index = j;
					}
				}
			}
			String[] temp = jang[i];
			jang[i] = jang[max_index];
			jang[max_index] = temp;
		}
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}
}
