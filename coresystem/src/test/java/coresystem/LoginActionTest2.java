package coresystem;


import org.junit.Test;


import framework.test.ActionTestCase;




public class LoginActionTest2 extends ActionTestCase {
	
	
	@Test
	public void loginTest() throws Exception
	{
		testAction("/coresystem/Login-coresystem.dto.UserInfo.action","login.xls");
	}
	@Test
	public void roleSaveTest() throws Exception
	{
		testActions("/framework/Save-%s.action","rolesave.xls");
	}
	
}