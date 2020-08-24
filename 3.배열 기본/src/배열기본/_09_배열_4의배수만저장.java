package 배열기본;

public class _09_배열_4의배수만저장 {

	public static void main(String[] args) {
		int[] arr = {44, 11, 29, 24, 76};
		//ex01) 4의 배수만 저장
		for(int i=0; i<5; i++) {
			if(arr[i]%4==0) System.out.println(arr[i]);
			else System.out.println("0");
		}
		//ex02) 4의 배수만 골라 temp 배열에 저장
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
