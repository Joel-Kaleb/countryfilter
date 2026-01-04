package com.joelk.countryfilter.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CountryData(
        NameData name,
        @JsonAlias("currencies") Map<String, CurrencyData> currencies
        ) { }
