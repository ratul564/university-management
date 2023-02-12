package com.example.universitymanagement.controller;

import com.example.universitymanagement.model.Event;
import com.example.universitymanagement.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/event-app")
public class EventController {

    @Autowired
    private IEventService eventService;

    @GetMapping("find-all")
    public List<Event> findAll(){
        return eventService.findAll();
    }

    @GetMapping("find/event_id/{event_id}")
    public Event findById(@PathVariable int event_id){
        return eventService.findById(event_id);
    }

    @PostMapping("add-event")
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }

    @PutMapping("update/event_id/{event_id}")
    public void updateEvent(@PathVariable int event_id,@RequestBody Event event){
        eventService.updateEvent(event_id,event);
    }

    @DeleteMapping("delete/event_id/{event_id}")
    public void deleteEvent(@PathVariable int event_id){
       eventService.deleteEvent(event_id);
    }
}