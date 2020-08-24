package 배열기본;
/*int[] hakbuns = {1001, 1002, 1003, 1004, 1005}
*int[] scores  = {  87,   11,   45,   98,   23};
*1등 학생의 학번, 성적 출력
*/
public class _06_배열_학생성적관리프로그램_3단계 { //***********************

	public static void main(String[] args) {
		int[] scores = {87, 11, 45, 98, 23};
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int max_score = 0;
		int max_index = 0;
		for(int i=0; i<5; i++) {
			if(max_score < scores[i]) {
				max_score = scores[i];
				max_index = i;  //87, 98 일 때만 실행이 되므로 최종적으로 i=3에서 마무리
			}
		}
		System.out.println("성적 : " + max_score + ", 학번 : " + hakbuns[max_index]);
	}

}
