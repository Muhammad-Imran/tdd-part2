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
}