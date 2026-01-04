package com.joelk.countryfilter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrencyData(
        String name,
        String symbol
) { }
