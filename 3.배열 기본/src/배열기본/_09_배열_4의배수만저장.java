package �迭�⺻;

public class _09_�迭_4�ǹ�������� {

	public static void main(String[] args) {
		int[] arr = {44, 11, 29, 24, 76};
		//ex01) 4�� ����� ����
		for(int i=0; i<5; i++) {
			if(arr[i]%4==0) System.out.println(arr[i]);
			else System.out.println("0");
		}
		//ex02) 4�� ����� ��� temp �迭�� ����
		int[] temp= null;
		int cnt = 0;
		for(int j=0; j<5; j++) {
			if(arr[j]%4==0) cnt+=1;	
		}
		temp = new int[cnt];
		
		int k = 0;
		for(int j=0; j<5; j++) {
			if(arr[j]%4==0) {
				temp[k] = arr[j];
				k+=1;
			}
		}
		for(int j=0; j<cnt; j++) {
			System.out.println(temp[j]);
		}
	}

}
