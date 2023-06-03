package com.step;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;

public class RegistrationStep {

	@Given("^User on registration page$")
	public void user_on_registration_page() {

		// open chrome..
		// url
	}

	@When("^user fill reg form fname \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_fill_reg_form_fname(String arg1, String arg2, String arg3) {

	}

	@When("^user fill mb  \"([^\"]*)\"  \"([^\"]*)\"$")
	public void user_fill_mb(String arg1, String arg2) {

	}

	// Data Table

	@When("^user fill reg form$")
	public void user_fill_reg_form(DataTable data) {
		
		List<Map<String, String>> map1 =data.asMaps(String.class, String.class);
	
		for(Map<String, String> map :map1)
		{
			Set<Entry<String, String>> entry =map.entrySet();
			for(Entry<String, String> e :entry)
			{
				String value = e.getValue();
				System.out.println("Values :" +value);
			}
			
			
			
			
			/*String fname_str = map.get("fname");
			System.out.println("map :" +fname_str);
			
			String email_str = map.get("email");
			System.out.println("email_str :" +email_str);*/
			
			
		}
		
		
		
		
		
		/*List< List<String> > datalist =data.raw();
		for(List<String> listdata  :datalist )
		{
			for(String value : listdata)
			{
				System.out.println( "value is : "+value);
			}
		}*/
		
		
	}

}
