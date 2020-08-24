package 클래스;

class Ex03{
	int[] arr = {87,100,11,72,92};
}

public class _03_class_학생성적관리프로그램_1단계 {

	public static void main(String[] args) {

		Ex03 e = new Ex03();
		
		//1. 전체 합 출력
		int total = 0;
		for(int i=0; i<e.arr.length; i++) {
			total = total + e.arr[i];
		}
		System.out.println(total);
		System.out.println();
		
		//2. 4의 배수 출력
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {System.out.println(e.arr[i]);}
		}
		System.out.println();
		
		//3. 짝수 갯수 출력
		int count = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {count += 1;}
		}
		System.out.println(count);
	}

}
