package com.joelk.countryfilter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record NameData(
        String common,
        String official
) { }
