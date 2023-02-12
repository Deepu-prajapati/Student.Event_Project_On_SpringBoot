package com.example.student.Student.service;


import com.example.student.Student.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EventService {

    static List<Event> events = new ArrayList<>();

    static int eventId = 0;
    static {
        events.add(new Event(++eventId,"2k19","Indore",
                "24/01/2019","4:00PM","11:00PM"));
        events.add(new Event(++eventId,"2k20","Jabalpur",
                "i4/01/2019","4:00PM","11:00PM"));
        events.add(new Event(++eventId,"2k21","Gwalior",
                "04/01/2019","4:00PM","11:00PM"));
        events.add(new Event(++eventId,"2k22","Jhansi",
                "11/01/2019","4:00PM","11:00PM"));
        events.add(new Event(++eventId,"2k23","Bhopal",
                "31/01/2019","4:00PM","11:00PM"));
    }

    public List<Event> getEvents() {
        return events;
    }


    public void addEvent(Event event){
        events.add(event);
    }
    public void deleteEvent(int id){
        events.removeIf(StudentInfo -> StudentInfo.getEventId() == id);
    }
    public void updateEvents(int eventId, Event newEvent){
        Event events = getEvents(eventId);

        events.setEventId(newEvent.getEventId());
        events.setEventName(newEvent.getEventName());
        events.setLocationOfEvent(newEvent.getLocationOfEvent());
        events.setDate(newEvent.getDate());
        events.setStartTime(newEvent.getStartTime());
        events.setEndTime(newEvent.getEndTime());
    }

    public Event getEvents(int eventId) {
        for(Event event:events){
            if(event.getEventId() == eventId){
                return event;
            }
        }
        return null;
    }
}
