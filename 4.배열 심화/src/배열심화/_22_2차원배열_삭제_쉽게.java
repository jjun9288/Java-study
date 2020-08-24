package 배열심화;

public class _22_2차원배열_삭제_쉽게 {

	public static void main(String[] args) {
		
		String[][] arr = {
				{"과일", "사과"},	
				{"과자", "쪼리퐁"},		// <--- 삭제
				{"음료", "콜라"}
		};
		
		int count = 3;
		
		int delIdx = 1;  //{"과자","조리퐁"}을 지우기 위한 코드. 
		String[][] temp = arr;
		
		arr = new String[count - 1][2];
		
		int j = 0;
		for(int i=0; i<count; i++) {
			if(i != delIdx) {   //i=0, 2일 때 실행, j에 i=0, i=2 배열 들어가겠쥬?
				arr[j] = temp[i];
				j = j + 1;
			}
		}
		
		count = count - 1;
		
		for(int i=0; i<count; i++) {
			System.out.println(arr[i][0] + " : " + arr[i][1]);
		}
			
	}

}
