package br.com.nlw.events.service;

import br.com.nlw.events.model.Event;
import br.com.nlw.events.repo.EventRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepo eventRepo;

    public Event addNewEvent(Event event) {
        event.setPrettyName(event.getTitle().toLowerCase().replace(" ", "-"));
        return eventRepo.save(event);
    }

    public List<Event> getAllEvents() {
        return (List<Event>) eventRepo.findAll();
    }

    public Event getByPrettyName(String prettyName) {
        return eventRepo.findByPrettyName(prettyName);
    }
}
