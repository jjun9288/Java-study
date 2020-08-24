package Day03;

public class Day03_02_반복문02 {

	public static void main(String[] args) {
		/*//practice01) 1~5까지 합 출력
		int a = 1;
		int sum = 0;
		while(a <= 5) {
			sum=sum+a;
			a+=1;
		} 
		System.out.println(sum);*/
		
		//practice02) 1~10까지 출력해 3미만 7이상만 출력
		int b = 1;
		while(b <= 10) {
			if(b<3 || b>=7) {System.out.println(b);}	// && , || 헷갈리지 말자!
			b+=1;
		}
		
		//practice03) 2번 문제 결과의 합 출력 **
		int c = 1;
		int add = 0;
		while(c <= 10) {
			if(c<3 || c>=7) { add = add+c; }
			c+=1;
		}
		System.out.println(add);
		//practice04) 2번 문제 결과의 갯수 출력
		int d = 1;
		int cnt = 0;
		while(d <= 10) {
			if(d<3 || d>= 7) { cnt++;}
			d+=1;
		}
		System.out.println(cnt);

	}

}
