package s10.CoreConcepts.StaticInner;

import s10.CoreConcepts.StaticInner.outer.Outer;

public class App {
	public static void main(String[] args) {
		Outer.Inner.testingInnerMethod();
		new Outer().testOuterMethod();
	}
}
