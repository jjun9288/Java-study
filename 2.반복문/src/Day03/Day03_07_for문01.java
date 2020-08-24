package Day03;
/*
 * 반복문 for
 * 1. 조건 3가지 : 초기식, 조건식, 증감식
 * 2. 구조
 *    for(초기식;조건식;증감식) {
 *    		조건식 참일 동안 실행할 문장;
 *    }
 * 3. 실행 순서 : 초기식 - 조건식 - 실행문 - 증감식 - 조건식 - ...
 */
public class Day03_07_for문01 {

	public static void main(String[] args) {
		//ex01) 1~5 까지 출력
		for(int x = 1; x <= 5; x++) {System.out.println(x);}
		//ex02) 1~10까지 반복해 5~9까지 출력
		for(int y = 1; y <= 10; y++ ) {
			if(5<=y && y<=9) {System.out.println(y);}
		}
		//ex03) 10~1까지 반복해 6~3까지 출력
		for(int z = 10; z >= 1; z--) {
			if(3<=z && z<=6) {System.out.println(z);}
		}
		//ex04) 1~10까지 반복해 3미만 7이상 출력
		for(int w = 1; w <= 10; w++) {
			if(w<3 || w>=7) {System.out.println(w);}
		}
	}

}
