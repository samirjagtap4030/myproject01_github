package com.sdet;// com.sdet
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sdet.App;

public class AppTest 
{
	@Test
    public void testlogin1()
    {
	App myapp=new App();
	Assert.assertEquals(0,myapp.userLogin("abc", "abc123"));//failed
    }

	@Test
	public void testlogin2()
	{
	App myapp=new App();
	Assert.assertEquals(1,myapp.userLogin("abc", "abc@123"));//pass
    }

}
