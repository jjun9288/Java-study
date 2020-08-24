package 파일;

import java.util.Scanner;

/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */
public class _13_단어검색_2단계 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		//Life is too short. 를 한 칸으로 보는 것이다. 예를 들어 too를 검색한다 하면 앞에서부터 Lif, ife, fe , ...
		//순서대로 검색해서 too 를 찾는 것  그래서 그냥 ort.를 입력해도 true 가 나온다.
		
		char[] arr = new char[text.length()];
		for(int i=0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();
		int check = -1;
		for(int i=0; i < arr.length-size+1; i++) {
			int count = 0;
			for(int j=0; j<size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					count += 1;
				}
			}
			if(count == size) {
				check = 1;
			}
		}
		
		if(check == 1) System.out.println("true");
		else if(check == -1) System.out.println("false");
	}
}
