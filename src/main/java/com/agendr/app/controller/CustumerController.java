package com.agendr.app.controller;

import com.agendr.app.domain.Custumer;
import com.agendr.app.facade.CustumerFacade;
import com.agendr.app.response.CustumerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = {"/v1/custumer"})
public class CustumerController {

    private final CustumerFacade custumerFacade;

    @PostMapping(value = {"/save"})
    public ResponseEntity<UUID> saveCustumer(@RequestBody final Custumer custumer) {
        return ResponseEntity.status(HttpStatus.CREATED).body(custumerFacade.save(custumer));
    }

    //TODO getById

    //TODO updateById

    //TODO delete

    //TODO search

}
