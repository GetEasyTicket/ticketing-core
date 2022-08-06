package com.learning.ticketingcore.service;

import com.learning.ticketingcore.vo.City;
import com.learning.ticketingcore.vo.Country;
import com.learning.ticketingcore.vo.EventDateTiming;
import com.learning.ticketingcore.vo.EventName;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementation to handle music tickets related bookings.
 */

@Service
public class MusicTicketsImpl implements EventTickets {
  @Override
  public List<Country> getCountries() {

    return null;
  }

  @Override
  public List<City> getCities() {
    return null;
  }

  @Override
  public List<EventName> getEventNames() {
    return null;
  }

  @Override
  public List<EventDateTiming> getEventDates() {
    return null;
  }
}
