package com.example.student.Student.controller;


import com.example.student.Student.model.Event;
import com.example.student.Student.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/event-information")
public class eventController {
    @Autowired
    private EventService eventService;

    @GetMapping("Get-Events")
    public List<Event> getAllEvent(){
        return eventService.getEvents();
    }
    @PostMapping("add-event")
    public void addEventsById(@RequestBody Event event){
        eventService.addEvent(event);
    }
    @DeleteMapping("delete-events/eventId/{eventid}")
    public void deleteEventById(@PathVariable int eventId){
        eventService.deleteEvent(eventId);
    }
    @PutMapping("update-events/eventId/{eventId}")
    public void updateEventById(@PathVariable int eventId,@RequestBody Event events){
        eventService.updateEvents(eventId,events);
    }
}
