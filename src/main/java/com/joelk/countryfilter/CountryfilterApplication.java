package com.joelk.countryfilter;

import com.joelk.countryfilter.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryfilterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CountryfilterApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.menu();
    }
}
