package xUnitTool;

public class TestCaseTest extends TestCase {
	
	private WasRun test;
	
	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}
	
	@Override
	public void setUp() {
		test = new WasRun("testMethod");
	}
	
	public void testRunning() throws Exception {
		test.run();
		assert test.wasRun();
	}
	
	public void testSetUp() throws Exception {
		test.run();
		assert test.wasSetUp();
	}
}