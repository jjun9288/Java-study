package 배열심화;
/*
 * # 문자열[정렬]
 * 1. compareTo() 메서드
 * 2. 2개의 문자열을 비교해 int형 값을 반환하는 메서드
 * 3. A.compareTo(B)
 * 4. 결과
 * 		A와 B가 같으면						0
 *      A가 B보다 사전적으로 순서가 앞이면		음수
 *      A보다 B가 사전적으로 순서가 앞이면		양수
 *      
 */
public class _19_심화_문자열_정렬 {

	public static void main(String[] args) {
		
		String str1 = "가";
		String str2 = "나";
		String str3 = "다";
		
		int a = str1.compareTo(str2);
		System.out.println(a);
		
		int c = str2.compareTo(str1);
		System.out.println(c);
		
		//문제) 사전 순으로 이름 변경 : 
		
		String[] name = {"김세진", "윤준영", "조수빈", "정은아", "이영상", "임태경", "오상진"};
		for(int i=0; i<name.length; i++) {
			String min_name = name[i];
			int min_idx = i;
			for(int j=i; j<name.length; j++) {
				if(min_name.compareTo(name[j]) > 0) {
					min_name = name[j];
					min_idx = j;
				}
			}
			String temp = name[i];
			name[i] = name[min_idx];
			name[min_idx] = temp;
		}
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + " ");
		}
	}
}
