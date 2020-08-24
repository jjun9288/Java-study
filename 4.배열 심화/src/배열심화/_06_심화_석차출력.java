package 배열심화;
//석차 순으로 이름 출력
public class _06_심화_석차출력 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score =   {87, 42, 100, 11, 98};
		
		for(int i=0; i<5; i++ ) {
			int max_num = score[i];
			int max_idx = i;
			for(int j=i; j<5; j++) {
				if(max_num < score[j]) {
					max_num = score[j];
					max_idx = j;
				}
				int score_temp = score[i];
				score[i] = score[max_idx];
				score[max_idx] = score_temp;
				
				String name_temp = name[i];
				name[i] = name[max_idx];
				name[max_idx] = name_temp;
			}
		}
		for (int i=0; i<5; i++) System.out.print(name[i] + " " + score[i] + " ");
	}

}
