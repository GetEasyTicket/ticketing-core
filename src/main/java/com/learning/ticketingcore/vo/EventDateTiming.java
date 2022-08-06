package com.learning.ticketingcore.vo;

import com.learning.ticketingcore.enums.PartOfDay;
import lombok.Data;
import java.sql.Date;
import java.sql.Time;

/**
 * This VO holds eventDateTiming object.
 */

@Data
public class EventDateTiming {
  private String eventId;
  private Date eventDate;
  private Time eventTime;
  private PartOfDay eventPartOfDay;
}
