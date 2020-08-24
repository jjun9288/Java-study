package basic;

import java.util.Scanner;

/*
 * # 로그인
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */

//string 으로 풀었는데, 이건 추후 클래스를 배우면서 익힐 수 있다.
public class Day02_04_Log_in {

	public static void main(String[] args) {
		
		String dbID = "jjun8177";
		String dbPW = "yoon9288";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ID를 입력하세요 : ");
		String myID = scan.next();
		System.out.println("비밀번호를 입력하세요 : ");
		String myPW = scan.next();
		

		if(myID.equals(dbID) && myPW.equals(dbPW)) { System.out.println("로그인 성공");}
		else System.out.println("다시 시도하세요");
	}
}
