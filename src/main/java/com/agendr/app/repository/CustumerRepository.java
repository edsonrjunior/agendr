package com.agendr.app.repository;

import com.agendr.app.domain.Custumer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustumerRepository extends CrudRepository<Custumer, Long> {

    List<Custumer> findByContact (final String contact);
}
