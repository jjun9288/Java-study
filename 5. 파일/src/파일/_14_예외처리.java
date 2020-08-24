package 파일;

public class _14_예외처리 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		// System.out.println(x / y);
		// 0으로 나누는게 불가해서 에러가 난다. java.lang.ArithmeticException: / by zero
		
		if(y != 0) {
			System.out.println(x / y);
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		//--------------------------------------------------
		
		try {
			// 에러발생여지가 있는 코드
			System.out.println(x / y);
		}catch(Exception e) {
			// try영역에서 에러가 발생하면, 보여줄 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}
		

	}

}
