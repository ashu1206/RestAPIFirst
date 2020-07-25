package stepDef;

import static org.hamcrest.Matchers.equalTo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseClass;

public class OptionsRequestSteps extends BaseClass {
	
TestContextAPI testContext;
	
	public OptionsRequestSteps(TestContextAPI testContext) {
		this.testContext = testContext;
	}
	
	@When("I hit the api with options request")
	public void i_hit_the_api_with_options_request() {
		testContext.resp = testContext.req_spec.when().options("/public-api/users/6199"); //hard coded user used for now
		testContext.scn.write("Response Put Request: " + testContext.resp.asString());
	}

	@Then("API should return the list of available methods")
	public void api_should_return_the_list_of_available_methods() {
		testContext.resp.then().assertThat().body("_meta.allow", equalTo("GET, PUT, PATCH, DELETE, HEAD, OPTIONS"));
	}

}
