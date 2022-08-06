package com.learning.ticketingcore.service;

import com.learning.ticketingcore.vo.City;
import com.learning.ticketingcore.vo.Country;
import com.learning.ticketingcore.vo.EventDateTiming;
import com.learning.ticketingcore.vo.EventName;
import java.util.List;

/**
 * Interface for event related bookings.
 */
public interface EventTickets {

  public List<Country> getCountries();

  public List<City> getCities();

  public List<EventName> getEventNames();

  public List<EventDateTiming> getEventDates();


}
