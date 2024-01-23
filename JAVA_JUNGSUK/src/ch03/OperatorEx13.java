package ch03;

public class OperatorEx13 {

	public static void main(String[] args) {
		
		char c1 = 'a';
		
	//	char c2 = c1+1;
		/**
		 * 
		 * 	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	        Type mismatch: cannot convert from int to char	

         	at JAVA_JUNGSUK/ch03.OperatorEx13.main(OperatorEx13.java:9)
		 * 
		 */
	
	 char c2 = 'a'+1;
	 System.out.println(c2);
		
	}

}
