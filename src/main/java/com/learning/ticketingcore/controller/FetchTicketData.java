package com.learning.ticketingcore.controller;

import com.learning.ticketingcore.enums.EventType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/find")
public class FetchTicketData {

    @GetMapping("/allEvents")
    public List<EventType> getAllEventTypes()
    {
        return new ArrayList<>(List.of(EventType.values()));
    }
}
