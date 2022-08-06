package com.learning.ticketingcore.service;

import com.learning.ticketingcore.vo.City;
import com.learning.ticketingcore.vo.Country;
import com.learning.ticketingcore.vo.EventDateTiming;
import com.learning.ticketingcore.vo.EventName;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieTicketImpl implements EventTickets{
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
