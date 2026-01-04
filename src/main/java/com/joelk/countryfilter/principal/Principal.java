package com.joelk.countryfilter.principal;

import com.joelk.countryfilter.model.CountryData;
import com.joelk.countryfilter.service.ConvertData;
import com.joelk.countryfilter.service.HttpClientService;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private final String URL = "https://restcountries.com/v3.1/all?fields=name,currencies";
    private HttpClientService client = new HttpClientService();
    private ConvertData convertData = new ConvertData();
    private Scanner userInpunt = new Scanner(System.in);
    private String rawData;

    public Principal(){
        rawData = client.getRawData(URL);
    }

    public void menu(){
        var data = convertData.getListData(rawData, CountryData.class);
        data.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Ingresa el nombre oficial del país para buscar su divisa:");
        var countryUser = userInpunt.nextLine();

        Optional<CountryData> findCountry = data.stream()
                .filter(c -> c.name().official().toLowerCase().contains(countryUser.toLowerCase()))
                .findFirst();

        if (findCountry.isPresent()){
            var country = findCountry.get();
            System.out.println("País encontrado: " + country.name().official());

            String currenciesInfo = country.currencies().values().stream()
                    .map(c -> c.name() + " [" + c.symbol() + "]")
                    .collect(Collectors.joining(", "));
            System.out.println("Divisas:" + currenciesInfo);
        }
        else {
            System.out.println("País no encontrado.");
        }
    }
}
