package com.example.universitymanagement.service;

import com.example.universitymanagement.model.Event;
import com.example.universitymanagement.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements IEventService {

    @Autowired
    private EventRepository eventRepository;

    private static List<Event> events = new ArrayList<>();
    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }
    @Override
    public Event findById(int event_id) {
        return eventRepository.findById(event_id).get();
    }
    @Override
    public void addEvent(Event event) {
        eventRepository.save(event);
    }
    @Override
    public void updateEvent(int event_id, Event newEvent) {
        Event event = eventRepository.findById(event_id).get();

        event.setEvent_id(newEvent.getEvent_id());
        event.setEvent_name(newEvent.getEvent_name());
        event.setLocation_event(newEvent.getLocation_event());
        event.setDate_day(newEvent.getDate_day());
        event.setStart_time(newEvent.getStart_time());
        event.setImage_url(newEvent.getImage_url());

        eventRepository.save(event);

    }
    @Override
    public void deleteEvent(int event_id) {
        eventRepository.deleteById(event_id);
    }
}