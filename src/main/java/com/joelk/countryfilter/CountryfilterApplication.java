package com.joelk.countryfilter;

import com.joelk.countryfilter.service.HttpClientService;
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
        HttpClientService client = new HttpClientService();
        String data = client.getRawData("https://restcountries.com/v3.1/all?fields=name,currencies");
        System.out.println(data);
    }
}
