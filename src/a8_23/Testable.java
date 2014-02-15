package a8_23;

import org.junit.Test;

public class Testable {
	public void execute() {
		System.out.println("Execute...");
	}

	@Test
	public void testExecute() {
		execute();
	}
	
//	public static void main(String[] args) {
//		Testable tesetTestable=new Testable();
//		tesetTestable.execute();
//	}
}
