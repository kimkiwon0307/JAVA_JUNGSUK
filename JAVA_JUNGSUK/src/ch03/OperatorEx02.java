package ch03;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		int i=5, j=0;
		
		j = i++;
		
		System.out.println("j = "+ j + " i = " + i ); //5
		
		i=5; 
		j=0;
		
		j = ++i;
		System.out.println("j = "+ j + " i = " + i);//6
		
		
	}

}
