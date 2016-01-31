package pt.adrz.designpatterns.others.validation;

import java.util.ArrayList;
import java.util.List;

public class TestDriveValidate {
	
	public static void main(String args[]) {
		
		List<RegistrationRule> rules = new ArrayList<RegistrationRule>();
		
		// add rules here ...
		rules.add(new EmailValidationRule());
		
		RegistrationData data = new RegistrationData();
		data.setName("bill");
		data.setEmail("bill@gmail.com");

		for (RegistrationRule rule: rules) {
			rule.validate(data);
		}
	}
}
