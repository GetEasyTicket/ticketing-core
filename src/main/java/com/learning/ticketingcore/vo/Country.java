package com.learning.ticketingcore.vo;

import lombok.Data;

@Data
public class Country {
    private String countryName;
    private String countryShtName;
    private Integer isoCode;
    private Integer isoCurrCd;
}
