package com.agendr.app.facade;

import com.agendr.app.db.DataBaseService;
import com.agendr.app.domain.Contact;
import com.agendr.app.domain.Custumer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class CustumerFacade {

    private final DataBaseService dataBaseService;

    public UUID save(final Custumer custumerRequest) {

        //TODO IMPLEMENT MAPSTRUCT

        final Custumer custumer = Custumer.builder()
                .id(custumerRequest.getId())
                .contact(Contact.builder()
                        .cellPhoneNumer(custumerRequest.getContact().getCellPhoneNumer())
                        .phoneNumber(custumerRequest.getContact().getPhoneNumber())
                        .email(custumerRequest.getContact().getEmail())
                        .build())
                .name(custumerRequest.getName())
                .build();

        dataBaseService.save(custumer);

        return UUID.fromString(custumerRequest.getId().toString());
    }

}
