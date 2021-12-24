package com.aidan.tutorweb.api;

import com.aidan.tutorweb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/Calendar/Student")
@RestController
public class StudentCalendarController {

    private final PersonService personService;

    @Autowired
    public StudentCalendarController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<int[][]> getStudentAvailableTimes() {
        return personService.getStudentAvailableTimes();
    }

}



