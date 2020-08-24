package Day03;
/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */
public class Day03_06_반복문06_369_game {

	public static void main(String[] args) {
		int i = 1;
		while(i<=50) {
			int x = i/10;
			int y = i%10;
			if(x != 0 && x%3 == 0) {System.out.println("짝");}
			else if(y != 0 && y%3 == 0) {System.out.println("짝");}
			else System.out.println(i);
			i++;
			}
	}

}
