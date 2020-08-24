package 클래스;

class Ex01{
	int x;
	int y;
}

public class _01_class {

	public static void main(String[] args) {
		int a;
		String b;
		int[] arr;
		
		a = 10;
		b = "hello";
		arr = new int[3];
		
		Ex01 e  = new Ex01();  //클래스 : 개발자가 직접 만든다.
		e.x = 10;
		e.y = 20;
		
		System.out.println(e);

	}

}
