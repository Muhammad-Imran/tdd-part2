package xUnitTool;

public class XUnitTest {

	public static void main(String[] args){
		try{
			new TestCaseTest("testRunning").run();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
