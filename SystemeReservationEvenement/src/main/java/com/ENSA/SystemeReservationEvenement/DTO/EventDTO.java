package com.ENSA.SystemeReservationEvenement.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDate date;
    private String location;
}
