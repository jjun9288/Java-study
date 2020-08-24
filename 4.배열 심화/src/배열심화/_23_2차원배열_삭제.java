package 배열심화;

import java.util.Scanner;

/*
 * # 2차원배열[삭제]
 * . 이름과 번호를 입력받아 삭제하기
 * 예)
 * 입력 : 철수	1
 * 삭제 : 김밥
 * 
 * 입력 : 철수 2          //여기서 포인트는 {"철수","바나나"} 는 인덱스상 3번째, 입력상 2라는 것이다.
 * 삭제 : 바나나
 */
public class _23_2차원배열_삭제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] jang = {
				{"철수", "소고기"},
				{"철수", "김밥"},
				{"영희", "김치"},
				{"철수", "바나나"},
				{"철수", "새우깡"},
				{"영희", "오징어"},
				{"영희", "맛밤"}
			};
	
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		System.out.println();
		
		System.out.print("삭제할 이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("삭제할 인덱스를 입력하세요 : ");
		int index = scan.nextInt();
		
		System.out.println();
		
		//삭제 과정
		int delete_index = 0;
		int count = 0;		//{"철수","바나나"} 는 실제 인덱스는 3, 영희를 빼면 2이므로 두 개의 변수 생성
		
		for(int i=0; i<jang.length; i++) {
			if(name.equals(jang[i][0])){
				if(count == index) {
					delete_index = i;
				}
				count += 1;
			}
		}
		
		//삭제 후의 jang 배열
		String[][] temp = jang;
		jang = new String[temp.length-1][2];  //삭제를 하면 배열의 크기가 당연히 줄겠지?
		int j=0;
		for(int i=0; i<temp.length; i++) {
			if(i != delete_index) {
				jang[j] = temp[i];
				j += 1;
			}
		}
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}
}
