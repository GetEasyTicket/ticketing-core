package com.learning.ticketingcore.controller;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class FetchTicketDataTest {

    @Autowired
    private FetchTicketData fetchTicketData;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test_allEvents() {
        Assertions.assertNotNull(fetchTicketData.getAllEventTypes());
        try {
            mockMvc.perform(get("/find/allEvents")).andExpect(status().isOk());
        }
        catch(Exception ex)
        {
            fail("Controller failed in initialization"+ ExceptionUtils.readStackTrace(ex));
        }
    }
}