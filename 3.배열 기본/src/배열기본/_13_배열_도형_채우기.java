package 배열기본;

public class _13_배열_도형_채우기 {

	public static void main(String[] args) {
		
/*1.
 * ###
 * ###
 * ###
 */
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i%3==2) {System.out.println();}
		}
System.out.println();
/*2.
 * #
 * ##
 * ###
 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
System.out.println();
/*3.
 * ###
 * ##
 * #
 */
		for(int i=2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
System.out.println();
/*4.
 * @##
 * @@#
 * @@@
 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}
			for(int j=2; j>i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
System.out.println();
/*5.
 *   #
 *  ###
 * #####
 */
		int k=0;
		for(int i=0; i<3; i++) {
			for(int j=2; j>i; j--) {
				System.out.print(" ");   //1행에 공백 2개, 2행에 공백 1개, 3행에 공백 0개
			}
			for(int j=0; j<=k; j++) {
				System.out.print("#");	//공백 2개 후 오는 첫 자리가 0이니까 k=0=j 에서 #한개!! 아항
			}
			System.out.println();
			k+=2;
		}
		
	}

}
