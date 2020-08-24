package 배열기본;
/*
 * # 배열(array)
 * 1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
 * 2. 사용법
 * 		int num = 10;
 * 		int[] arr = new int[방의 개수];
 * 		int arr[] = new int[방의 개수];   -> 
 * 3. 인덱스(index)
 * 		0부터 시작하는 방번호(index)가 부여된다.
 * 4. 주소 변수
 */
public class _01_배열_기본 {

	public static void main(String[] args) {
		int[] arr = null;
		arr = new int[3];
		System.out.println(arr[0]);	//0
		System.out.println(arr[1]);	//0
		System.out.println(arr[2]);	//0
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}			

	}
	
}
