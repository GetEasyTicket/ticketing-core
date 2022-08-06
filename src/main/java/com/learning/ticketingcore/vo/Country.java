package com.learning.ticketingcore.vo;

import lombok.Data;

/**
 * VO to hold values related to Country object.
 */

@Data
public class Country {
  private String countryName;
  private String countryShtName;
  private Integer isoCode;
  private Integer isoCurrCd;
}
