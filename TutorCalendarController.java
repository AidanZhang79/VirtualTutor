package com.aidan.tutorweb.api;

import com.aidan.tutorweb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/Calendar/Tutor")
@RestController
public class TutorCalendarController {

    private final PersonService personService;

    @Autowired
    public TutorCalendarController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<int[][]> getTutorAvailableTimes() {
        return personService.getTutorAvailableTimes();
    }

}



