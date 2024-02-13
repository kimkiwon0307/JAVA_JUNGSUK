package ch06;

class Data1 {
	int value;
}

class Data2 {
	int value;
	Data2(int x){  // 매개변수가 있는 생성자
		value = x;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2= new Data2(10); // 매개변수를 안넣어주면 컴파일 에러 발생.
		
		
		System.out.println(d1.value);
		System.out.println(d2.value);
		
	}
}
