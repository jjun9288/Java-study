package 파일;

public class _04_문자열_1차원 {

	public static void main(String[] args) {
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		int sum = 0;
		String[] temp = str.split("/");
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(temp[i]);
			System.out.print(arr[i] + " ");
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i=0; i<3; i++) {
			text = text + scores[i];
			if(i != scores.length - 1) {
				text = text + "/";		//이 if문을 안 넣으면 11/100/89/ 이 된다. 마지막 /을 없애기 위한 if문!
				//점수 / 점수 / ... 형태로 넣는 것.
			}
		}
		System.out.print(text);
	}
}
