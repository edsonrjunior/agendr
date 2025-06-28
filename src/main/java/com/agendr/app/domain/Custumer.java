package com.agendr.app.domain;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
public class Custumer {

    private UUID id;
    private String name;
    private Contact contact;

}
