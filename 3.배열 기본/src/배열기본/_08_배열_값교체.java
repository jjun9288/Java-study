package 배열기본;

import java.util.Scanner;

public class _08_배열_값교체 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		//ex01) 인덱스 2개 입력받아 교체하기
		Scanner scan = new Scanner(System.in);
		System.out.println("인덱스 입력 : ");
		int num1 = scan.nextInt();
		System.out.println("인덱스 입력 : ");
		int num2 = scan.nextInt();
		int a = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = a;
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		//ex02) 값 2개 입력받아 교체하기
		System.out.println("값 입력 : ");
		int num3 = scan.nextInt();
		System.out.println("값 입력 : ");
		int num4 = scan.nextInt();
		int index1 = 0;
		int index2 = 0;
		for(int j=0; j<5; j++) {
			if(num3==arr[j]) index1 = j;
			if(num4==arr[j]) index2 = j;
		}
		int b = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = b;
		
		for(int j=0; j<5; j++) {System.out.println(arr[j]);}
	}
}
