package org.sam;

import org.testng.annotations.Test;

public class B {
	@Test(dataProvider="Amazon Data",dataProviderClass=A.class)
	private void tc60(String data) {
		System.out.println(data);
	}
	
}
