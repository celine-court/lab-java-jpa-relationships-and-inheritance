package com.ironhack.labweek8.eventManagement.demo;

import com.ironhack.labweek8.eventManagement.model.Guest;
import com.ironhack.labweek8.eventManagement.model.Conference;
import com.ironhack.labweek8.eventManagement.model.Event;
import com.ironhack.labweek8.eventManagement.model.Speaker;
import com.ironhack.labweek8.eventManagement.repository.EventRepository;
import com.ironhack.labweek8.eventManagement.repository.ConferenceRepository;
import com.ironhack.labweek8.eventManagement.repository.GuestRepository;
import com.ironhack.labweek8.eventManagement.repository.SpeakerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.Duration;

import java.time.LocalDateTime;
import java.util.List;

import static com.ironhack.labweek8.eventManagement.model.enums.StatusGuest.ATTENDING;
import static com.ironhack.labweek8.eventManagement.model.enums.StatusGuest.NOT_ATTENDING;
import static com.ironhack.labweek8.eventManagement.model.enums.StatusGuest.NO_RESPONSE;


@Component
@Profile("dev")
public class DataLoader implements CommandLineRunner {

    private final EventRepository eventRepository;
    private final ConferenceRepository conferenceRepository;
    private final SpeakerRepository speakerRepository;
    private final GuestRepository guestRepository;


    public DataLoader(EventRepository eventRepository, ConferenceRepository conferenceRepository, SpeakerRepository speakerRepository, GuestRepository guestRepository) {
        this.eventRepository = eventRepository;
        this.conferenceRepository = conferenceRepository;
        this.speakerRepository = speakerRepository;
        this.guestRepository = guestRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading data...");

        var guest1 = new Guest("Albert1", ATTENDING);
        var guest2 = new Guest("Albert2", ATTENDING);
        var guest3 = new Guest("Albert3", NOT_ATTENDING);

        guestRepository.saveAll(List.of(guest1, guest2, guest3));

        var event1 = new Event("Greatest 80's event", Duration.ofHours(120),"location1" ,LocalDateTime.of(2025, 6, 18, 0, 0),List.of(guest1, guest2, guest3));

        eventRepository.saveAll(List.of(event1));


        var speaker1 = new Speaker("John", 60);
        var speaker2 = new Speaker("Nono", 90);
        var speaker3 = new Speaker("Juan", 140);
        var speaker4 = new Speaker("lulu", 15);
        var speaker5 = new Speaker("Holly", 120);
        var speaker6 = new Speaker("David", 60);
        var speaker7 = new Speaker("Laeti", 60);

        speakerRepository.saveAll(List.of(speaker1, speaker2, speaker3, speaker4, speaker5));


        var conference1 = new Conference(List.of(speaker1, speaker2), event1);
        var conference2 = new Conference(List.of(speaker2, speaker3), event1);

        conferenceRepository.saveAll(List.of(conference1, conference2));

        eventRepository.save(event1);

        guestRepository.save(guest1);
        guestRepository.save(guest2);
        guestRepository.save(guest3);


        conferenceRepository.save(conference1);
        conferenceRepository.save(conference2);

        speakerRepository.save(speaker1);
        speakerRepository.save(speaker2);
        speakerRepository.save(speaker3);
        speakerRepository.save(speaker4);
        speakerRepository.save(speaker5);
        speakerRepository.save(speaker6);
        speakerRepository.save(speaker7);


        System.out.println("Loading data complete.");

    }


}
