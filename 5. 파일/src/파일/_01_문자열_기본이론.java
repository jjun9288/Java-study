package 파일;
/*
 * 문자열은 문자의 배열의 줄임말
 * 0부터 숫자가 부여(index)
 * 
 */
public class _01_문자열_기본이론 {

	public static void main(String[] args) {
		String name = "junyoung";
		System.out.println(name);
		
		//1. 문자의 길이 : .length()
		int size = name.length();
		System.out.println(size);
		
		//2. 문자 한 개 추출(인덱싱) : .charAt(index)
		char ch = name.charAt(0);
		System.out.println(ch);
		ch = name.charAt(size - 1); //그 전 문자 출력! 하지만 ch는 0 이였으니 맨 끝인 7이 출력되겠지?
		System.out.println(ch);
		
		//3. 문자 여러 개 출력(슬라이싱) : 
			//(1) substring(index1, index2) (index1 부터 index2 - 1 까지)
		String str1 = name.substring(3,5);
		System.out.println(str1);
			//(2) substring(index) (index 부터 끝까지)
		String str2 = name.substring(4);
		System.out.println(str2);
		
		//4. 구분자로 잘라내기
		name = "yoon,jun,young";
		String[] ar = name.split(",");	//, 를 기준으로 출력! n 을 넣으면 n 기준으로 되겠지??
		System.out.println(ar.length);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}
