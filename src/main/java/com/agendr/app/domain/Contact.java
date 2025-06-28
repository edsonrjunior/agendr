package com.agendr.app.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Contact {

    private String phoneNumber;
    private String cellPhoneNumer;
    private String email;

}
