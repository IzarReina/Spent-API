package com.grupo.spent.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.grupo.spent.entities.Event;
import com.grupo.spent.entities.Sport;
import com.grupo.spent.entities.User;

public interface EventService {
    Event createEvent (String title, LocalDate data, LocalTime startTime, LocalTime endTime, Integer numParticipants, 
        String address, Sport sport, User user);
    List<Event> getAllEvents();
    Event getEventById(Integer id);
    void deleteEvent(Integer id);
    Event editEvent (Integer id, String title, LocalDate date, LocalTime startTime, LocalTime endTime, Integer numParticipants, String address);
    Event joinEvent(Event event, User user);
    Event withdrawEvent(Event event, User user);
}
