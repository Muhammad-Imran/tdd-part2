package xUnitTool;

public class XUnitTest {

	public static void main(String[] args) {
		try {
			TestSuite suite = new TestSuite();
			TestResult result = new TestResult();
			
			suite.add(new TestCaseTest("testTemplateMethod"));
			suite.add(new TestCaseTest("testResult"));
			suite.add(new TestCaseTest("testFailedResultFormatting"));
			suite.add(new TestCaseTest("testFailedResult"));
			suite.add(new TestCaseTest("testSuite"));
			
			suite.run(result);
			System.out.println(result.summary());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
