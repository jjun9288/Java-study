package basic;

import java.util.Scanner;

/*
 * # �α���
 * 1. Id�� Pw�� �Է¹޴´�.
 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */

//string ���� Ǯ���µ�, �̰� ���� Ŭ������ ���鼭 ���� �� �ִ�.
public class Day02_04_Log_in {

	public static void main(String[] args) {
		
		String dbID = "jjun8177";
		String dbPW = "yoon9288";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ID�� �Է��ϼ��� : ");
		String myID = scan.next();
		System.out.println("��й�ȣ�� �Է��ϼ��� : ");
		String myPW = scan.next();
		

		if(myID.equals(dbID) && myPW.equals(dbPW)) { System.out.println("�α��� ����");}
		else System.out.println("�ٽ� �õ��ϼ���");
	}
}
