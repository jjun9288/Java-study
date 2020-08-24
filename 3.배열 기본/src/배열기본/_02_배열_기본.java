`package 배열기본;

public class _02_배열_기본 {

	public static void main(String[] args) {
		//배열 사용법(1)
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		//배열 사용법(2) : 축약형
		int[] temp = {10, 20, 30};
		for(int j = 0; j < 3; j++) {
			System.out.println(temp[j]);
		}
		
	}

}
