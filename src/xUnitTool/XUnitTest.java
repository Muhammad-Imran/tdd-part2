package xUnitTool;

public class XUnitTest {

	public static void main(String[] args) {
		try {
			new TestCaseTest("testRunning").run();
			new TestCaseTest("testSetUp").run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
