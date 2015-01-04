package xUnitTool;

public class TestCaseTest extends TestCase {
	
	private WasRun test;
	
	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}
	
	@Override
	public void setUp() {
		
	}
	
	public void testTemplateMethod() throws Exception {
		test = new WasRun("testMethod");
		test.run();
		assert test.log().equals("setUp testMethod tearDown ");
	}
	
	public void testResult() throws Exception {
		test = new WasRun("testMethod");
		test.run();
		assert result.summary().equals("1 run, 0 failed");
	}
	
	public void testFailedResult() throws Exception {
		test = new WasRun("testBrokenMethod");
		test.run();
		assert result.summary().equals("1 run, 1 failed");
	}
	
	public void testFailedResultFormatting() {
		result = new TestResult();
		result.testStarted();
		result.testFailed();
		assert result.summary().equals("1 run, 1 failed");
	}
}