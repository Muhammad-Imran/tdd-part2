package xUnitTool;

public class XUnitTest {

	public static void main(String[] args) {
		try {
			new TestCaseTest("testFailedResult").run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
