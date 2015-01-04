package xUnitTool;

public class XUnitTest {

	public static void main(String[] args) {
		try {
			new TestCaseTest("testTemplateMethod").run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
