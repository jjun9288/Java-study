package 배열기본;
/*학생성적관리프로그램
 * 1. 배열에 1~100 임의의 점수 5개 저장
 * 2. 5명 학생의 총점 및 평균 출력
 * 3. 성적이 60점 이상이면 합격이다. 합격자 수 출력
 */
import java.util.Random;

class _04_배열_학생성적관리프로그램_1단계 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		int total = 0;
		int avg = 0;
		int cnt = 0;
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
			System.out.println(arr[i]);
			total += arr[i];
			avg = total/5;
			if(arr[i]>=60) {cnt++;}
		}
		System.out.println("총함 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("합격자 수 : " + cnt);
	}
		
}
