package 배열심화;

public class _21_중복안된숫자세거 {

	public static void main(String[] args) {
				
		int test[] = {1,3,4,4,2};
		// 위 배열에서 중복안된숫자를 제거하시요 	
		// 2) {4,4}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				if(test[j] == test[i]) {
					
				}
			}
		}
	}
}
