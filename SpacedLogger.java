package week5;

public class SpacedLogger implements Logger{

	@Override
	
	public void Log(String str1) {
		System.out.println("");
		for( int i=0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i) + " ");
		}
		
	}

	@Override
	public void Error(String str2) {
		System.out.println("");
		System.out.print("ERROR: ");
		for( int i=0; i < str2.length(); i++) {
			System.out.print(str2.charAt(i) + " ");
		}		
		
	}

}
