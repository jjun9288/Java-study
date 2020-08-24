package 배열심화;
/*
 * 구구단
 * 2x1 3x1 ... 9x1
 * 2x2 3x2 ... 9x2
 *  .
 *  .
 *  .
 * 2x9 3x9 ... 9x9
 */
public class _29_대기업_입사문제 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print((j+2) + "x" + (i+1) + "=" + (j+2)*(i+1) + "\t");
			}
			System.out.println();
		}
	}

}
