package �迭�⺻;

public class _13_�迭_����_ä��� {

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
				System.out.print(" ");   //1�࿡ ���� 2��, 2�࿡ ���� 1��, 3�࿡ ���� 0��
			}
			for(int j=0; j<=k; j++) {
				System.out.print("#");	//���� 2�� �� ���� ù �ڸ��� 0�̴ϱ� k=0=j ���� #�Ѱ�!! ����
			}
			System.out.println();
			k+=2;
		}
		
	}

}
