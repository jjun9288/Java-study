package 배열심화;

public class _09_심화_배열_주소개념 {

	public static void main(String[] args) {
		int[] arr = {87,100,24,11,79};
		
		int[] temp = arr;
		temp[1] = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}

// int[] arr = new int[5] 가 생략되어 있다는걸 잊지 말자.
// 주소는 stack에, 값은 heap에 저장 되고,
// temp[] 에 arr 주소값이 들어간 상황이고,
// temp[1] 을 0 으로 바꾼다는건 값이 0으로 바뀐는 것 뿐만 아니라 arr 또한 그 값을 써서 둘 다 0이 나오는 것이다.