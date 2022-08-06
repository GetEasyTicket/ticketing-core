package com.learning.ticketingcore.vo;

import lombok.Data;

/**
 * This VO holds city object.
 */

@Data
public class City {
  private Integer countryId;
  private Long cityId;
  private String cityName;
}
