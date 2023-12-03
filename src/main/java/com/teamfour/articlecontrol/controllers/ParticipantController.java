package com.teamfour.articlecontrol.controllers;


import com.teamfour.articlecontrol.Services.ParticipantService;
import com.teamfour.articlecontrol.models.Participant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/user")
@RestController
public class ParticipantController {

    private ParticipantService participantService;

    @PostMapping("/subscribe")
    public ResponseEntity<Participant> subscribe(@RequestBody Participant participant) {
        Participant subscribeParticipant = participantService.subscribe(participant);
        return new ResponseEntity<>(subscribeParticipant, HttpStatus.CREATED);
    }

}
