package ch02;

public class VarEx1 {
	public static void main(String[] args) {
		
		int year = 0; // int는 변수타입 ,  year는 변수명, 대입연산자 '=' 를 통해 0으로 초기화 
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
	}
}
