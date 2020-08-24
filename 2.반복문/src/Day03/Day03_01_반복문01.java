package Day03;
public class Day03_01_반복문01 {
	public static void main(String[] args) {
		//ex01) 1부터 5까지 출력
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		//ex02) 1~10 까지 반복해 5~9 출력
		int num1 = 1;
		while(num1<=10) {
			if(5<=num1 && num1<=9) {System.out.println(num1);}
			num1++;
		}
		//ex03) 10~1 반복해 6~3 거꾸로 출력
		int num2 = 10;
		while(num2>=1) {
			if(3<=num2 && num2<=6) {System.out.println(num2);}
			num2-=1;
		}
		//ex04) 1~10 까지 반복해 짝수만 출력
		int num3 = 1;
		while(num3<=10) {
			if(num3%2==0) {System.out.println(num3);}
			num3+=1;
		}
	}

}
