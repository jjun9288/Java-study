package Day03;
/*
 * �ݺ��� for
 * 1. ���� 3���� : �ʱ��, ���ǽ�, ������
 * 2. ����
 *    for(�ʱ��;���ǽ�;������) {
 *    		���ǽ� ���� ���� ������ ����;
 *    }
 * 3. ���� ���� : �ʱ�� - ���ǽ� - ���๮ - ������ - ���ǽ� - ...
 */
public class Day03_07_for��01 {

	public static void main(String[] args) {
		//ex01) 1~5 ���� ���
		for(int x = 1; x <= 5; x++) {System.out.println(x);}
		//ex02) 1~10���� �ݺ��� 5~9���� ���
		for(int y = 1; y <= 10; y++ ) {
			if(5<=y && y<=9) {System.out.println(y);}
		}
		//ex03) 10~1���� �ݺ��� 6~3���� ���
		for(int z = 10; z >= 1; z--) {
			if(3<=z && z<=6) {System.out.println(z);}
		}
		//ex04) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		for(int w = 1; w <= 10; w++) {
			if(w<3 || w>=7) {System.out.println(w);}
		}
	}

}
