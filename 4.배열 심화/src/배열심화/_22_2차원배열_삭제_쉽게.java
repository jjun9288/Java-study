package �迭��ȭ;

public class _22_2�����迭_����_���� {

	public static void main(String[] args) {
		
		String[][] arr = {
				{"����", "���"},	
				{"����", "�ɸ���"},		// <--- ����
				{"����", "�ݶ�"}
		};
		
		int count = 3;
		
		int delIdx = 1;  //{"����","������"}�� ����� ���� �ڵ�. 
		String[][] temp = arr;
		
		arr = new String[count - 1][2];
		
		int j = 0;
		for(int i=0; i<count; i++) {
			if(i != delIdx) {   //i=0, 2�� �� ����, j�� i=0, i=2 �迭 ������?
				arr[j] = temp[i];
				j = j + 1;
			}
		}
		
		count = count - 1;
		
		for(int i=0; i<count; i++) {
			System.out.println(arr[i][0] + " : " + arr[i][1]);
		}
			
	}

}
