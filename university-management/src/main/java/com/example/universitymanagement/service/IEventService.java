package com.example.universitymanagement.service;

import com.example.universitymanagement.model.Event;

import java.util.List;

public interface IEventService {
    public List<Event> findAll();
    public Event findById(int event_id);
    public void addEvent(Event event);
    public void updateEvent(int event_id,Event NewEvent);
    public void deleteEvent(int event_id);
}