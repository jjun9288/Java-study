package 파일;

public class _03_주민등록번호_검사 {

	public static void main(String[] args) {
	
	String id = "950819-1020016";
	// 문제 1) 나이 출력
	// 정답 1) 26세
	String strAge = id.substring(0,2);
	int intAge = Integer.parseInt(strAge);  //string age 를 int age 로 바꾼다!
	int age = 2020 - (1900 + intAge) + 1;
	System.out.println(age);
	
	// 문제 2) 성별 출력
	// 정답 2) 남성
	String strSex = id.substring(7,8);
	int intSex = Integer.parseInt(strSex);
	if(intSex == 1) {
		System.out.println("남성");
		}
	else if(intSex == 2) {
		System.out.println("여성");
		}
	}
}
