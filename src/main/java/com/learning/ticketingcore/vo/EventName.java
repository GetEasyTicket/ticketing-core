package com.learning.ticketingcore.vo;

import lombok.Data;
import java.time.ZonedDateTime;

/**
 * This VO holds eventName object.
 */

@Data
public class EventName {

  private String eventId; // eventId must be concatenation of name+dateInYYYYMMDD+timeInHH24MISS
  private Integer countryId;
  private Long cityId;
  private String eventName;
  private ZonedDateTime eventDateTime;
}
