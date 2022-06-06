package week5;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String str1) {
		System.out.println("***" + str1 + "***");
		System.out.println("");
		
	}

	@Override
	public void Error(String str2) {
		System.out.println("********************");
		System.out.println("*** Error: " + str2 + "***");
		System.out.println("********************");
		
	}

}
