package s10.CoreConcepts.StaticInner.outer;

//practicing static inner classes
public class Outer {
	private static int testVar = 6;
	
	public static void testOuterMethod() {
		System.out.println("Value of inner class variable: " + Inner.x);
		Inner.testingInnerMethod();
	}
	
	public static class Inner{
		public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("testing inner class");
			System.out.println("Test variable value: " + testVar); //the inner class can access
			//the out testVar because it is static
		}
	}
}
