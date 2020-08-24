package 배열기본;

public class _11_배열_구구단 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("====" + i + "단====");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}

	}

}

//이게 왜 배열에 있는지...