package org.bezama.tutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.bezama.tutorial.dao.ContactRepository;
import org.bezama.tutorial.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAngularApplication implements CommandLineRunner {

	@Autowired
	private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		contactRepository.save(new Contact("Randriamifidy","Bezama Marolahy",df.parse("26-04-1984"),
				"marolahy@gmail.com","+261344628350",""));
		contactRepository.save(new Contact("Randriamifidy","Tahiry Ambinitsoa",df.parse("21-09-1979"),
				"tahiry@gmail.com","+261344628352",""));
		contactRepository.save(new Contact("Randriamifidy","Faly Ambinitsoa",df.parse("07-06-1978"),
				"faly@gmail.com","+261340300415",""));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getPrenom());
		});
		
	}
}
