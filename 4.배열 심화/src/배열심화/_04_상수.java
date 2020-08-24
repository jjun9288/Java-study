package 배열심화;
/*상수
 * -변할 수 없는 수
 * -자료형 앞에 final을 붙인다.
 * -일반 변수와의 구분을 위해 변수 명을 대문자로 쓴다. ex) final int SIZE
 */
public class _04_상수 {

	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		MAX_SIZE = 15;  //오류 발생
	}

}
