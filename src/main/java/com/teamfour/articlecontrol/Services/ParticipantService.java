package com.teamfour.articlecontrol.Services;

import com.teamfour.articlecontrol.Repositorys.ParticipantRepository;
import com.teamfour.articlecontrol.Repositorys.ProfileRepository;
import com.teamfour.articlecontrol.exception.BusinnessException;
import com.teamfour.articlecontrol.models.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;
    private ProfileRepository profileRepository;

    public Participant subscribe(Participant participant) {
        Optional<Participant> participantExists = participantRepository.findByEmail(participant.getEmail());

        if(participantExists.isPresent() && !participantExists.get().equals(participant)) {
            throw new BusinnessException(
                    String.format("Este participante já foi cadastrado com este email %s", participant.getEmail()));
        }
//        if (participant.isNew()) {
//            participant.setPassword(//todo criação de senha);
//        }


        return participantRepository.save(participant);
    }


}
