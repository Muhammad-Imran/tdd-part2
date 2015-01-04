package xUnitTool;

public class TestCaseTest extends TestCase {
	
	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}
	
	public void testRunning() throws Exception {
		WasRun test = new WasRun("testMethod");
		assert !test.wasRun();
		test.run();
		assert test.wasRun();
	}
	
	public void testSetUp() throws Exception {
		WasRun test = new WasRun("testMethod");
		test.run();
		assert test.wasSetUp();
	}
}
