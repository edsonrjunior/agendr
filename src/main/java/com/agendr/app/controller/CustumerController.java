package com.agendr.app.controller;

import com.agendr.app.domain.Custumer;
import com.agendr.app.facade.CustumerFacade;
import com.agendr.app.repository.CustumerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/custumers")
public class CustumerController {

    private final CustumerFacade custumerFacade;
    private final CustumerRepository custumerRepository;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Custumer create(@RequestBody Custumer custumer) {
        return custumerRepository.save(custumer);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Custumer> list() {
        return custumerRepository.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Custumer> findById(@PathVariable final Long id) {
        return custumerRepository.findById(id);
    }


    //TODO updateById

    //TODO delete

    //TODO search

}
