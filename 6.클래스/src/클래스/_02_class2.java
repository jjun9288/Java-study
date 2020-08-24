package 클래스;

class Student{
	String name;
	int score;
}

public class _02_class2 {

	public static void main(String[] args) {
		
		//같은 패키지 안의 클래스는 다른 클래스에서 사용 가능하다
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
		
		Student a = new Student();
		a.name = "Jun Yoon";
		a.score = 100;
		System.out.println(a);
	}

}
