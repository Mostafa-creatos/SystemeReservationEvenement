package com.ENSA.SystemeReservationEvenement.Repositories;

import com.ENSA.SystemeReservationEvenement.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
