package com.ENSA.SystemeReservationEvenement.Service;



import com.ENSA.SystemeReservationEvenement.DTO.EventDTO;
import com.ENSA.SystemeReservationEvenement.Model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(EventDTO eventDTO);
    List<Event> getAllEvents();
    Event getEventById(Long id);
    Event updateEvent(Long id, EventDTO eventDTO);
    void deleteEvent(Long id);
}

