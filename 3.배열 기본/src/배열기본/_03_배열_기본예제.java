package 배열기본;

public class _03_배열_기본예제 {

	public static void main(String[] args) {
		//ex01) 10,20,30,40,50  배열에 저장
		int[] temp = {10,20,30,40,50};
		for(int i=0; i<5; i++) {
			System.out.println(temp[i]);
		}
		//ex02) 4의 배수만 출력
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for(int j=0; j<5; j++) {
			if(arr[j]%4==0) {System.out.println(arr[j]);}
		}
		
		//ex03) 4의 배수의 합 출력
		int sum = 0;
		for(int k=0; k<5; k++) {
			if(arr[k]%4==0) {sum = sum + arr[k];
			}
		}
		System.out.println(sum);
		
		//ex04) 4의 배수의 갯수 출력
		int cnt = 0;
		for(int w=0; w<5; w++) {
			if(arr[w]%4==0) {cnt++;}
		}
		System.out.println(cnt);
		
		//ex05) 짝수의 갯수 출력
		int cnt2 = 0;
		for(int n=0; n<5; n++) {
			if(arr[n]%2==0) {cnt2++;}
		}
		System.out.println(cnt2);

	}

}
