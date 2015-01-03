package xUnitTool;

public class XUnitTest {

	public static void main(String[] args){
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun());
		try{
			test.run();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println(test.wasRun());
	}
}
