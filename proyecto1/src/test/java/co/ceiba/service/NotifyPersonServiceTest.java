package co.ceiba.service;

import co.ceiba.domain.Person;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
	
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup(){
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notifyTest(){
		Person person = new PersonTestDataBuilder().build();
		String message = notifyPersonService.notify(person);
		Assert.assertNotNull(message);
	}

}
