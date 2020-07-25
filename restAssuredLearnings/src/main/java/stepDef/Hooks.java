package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
TestContextAPI testContext;
	
	public Hooks(TestContextAPI testContext) {
		this.testContext = testContext;
	}

	@Before
	public void SetUp(Scenario s) {
		this.testContext.scn = s;
	}
	
	@After
	public void CleanUp() {
		testContext.req_spec=null;
		testContext.resp=null;
	}

}
