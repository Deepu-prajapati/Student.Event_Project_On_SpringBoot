package com.example.student.Student.service;

import com.example.student.Student.model.Event;

import java.util.List;

public interface IEventService {

    public List<Event> getEvents();

    public void addEvent(Event event);

    public void deleteEvent(int id);

    public void updateEvents(int eventId, Event newEvent);

    public Event getEvents(int eventId);
}
