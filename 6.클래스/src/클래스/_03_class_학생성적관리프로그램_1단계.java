package Ŭ����;

class Ex03{
	int[] arr = {87,100,11,72,92};
}

public class _03_class_�л������������α׷�_1�ܰ� {

	public static void main(String[] args) {

		Ex03 e = new Ex03();
		
		//1. ��ü �� ���
		int total = 0;
		for(int i=0; i<e.arr.length; i++) {
			total = total + e.arr[i];
		}
		System.out.println(total);
		System.out.println();
		
		//2. 4�� ��� ���
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {System.out.println(e.arr[i]);}
		}
		System.out.println();
		
		//3. ¦�� ���� ���
		int count = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {count += 1;}
		}
		System.out.println(count);
	}

}
