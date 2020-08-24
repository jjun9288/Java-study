package 파일;

import javax.print.attribute.IntegerSyntax;

/*
 * 형변환 : 자료형을 바꾸는 것을 의미
 * (변환할 자료형)변수
 */
public class _02_형변환 {

	public static void main(String[] args) {
		//문자 -> 숫자
		char ch = 'c';
		int cNum = (int)ch;
		System.out.println(cNum);
		
		//숫자 -> 문자
		ch = (char)cNum;
		System.out.println(ch);
		ch = (char)(cNum+1);
		System.out.println(ch);
		
		//문자열 -> 숫자
		String strNum = "10";
		int num = Integer.parseInt(strNum);
		System.out.println(num);
		
		//숫자 -> 문자열
			//1. 정식 
		strNum = String.valueOf(num);
		System.out.println(strNum);
			
			//2. 꼼수
		strNum = num + "";
		System.out.println(strNum);
	}
}
