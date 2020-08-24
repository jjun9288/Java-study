package 파일;

public class _05_문자열_2차원 {

	public static void main(String[] args) {
		// 문제1) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
				
		String[] name = new String[3];
		int[] score = new int[3];
				
		String[] temp = str.split(",");  //현재 temp 는 [김철수/87],[이만수/42],[이영희/95]
		for(int i=0; i<temp.length; i++) {		//[김철수][87] 돌리고 [이만수][42] 돌리고... 
			String[] each = temp[i].split("/"); 
			name[i] = each[0];
			score[i] = Integer.parseInt(each[1]);
		}
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		// 문제2) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"

		String[] name2 = {"김철수", "이만수", "이영희"};
		int[] score2 = {87, 42, 95};
		
		String str2 = "";
		for(int i=0; i<3; i++) {
			str2 += name2[i];
			str2 += "/";
			str2 += score2[i] + "";
			if(i != name2.length-1) {
				str2 += ",";
			}
		}
		System.out.println(str2);
	}
}
