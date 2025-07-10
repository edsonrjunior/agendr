package com.agendr.app.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("custumers")
public record Custumer(@Id Long id, String name, String contact) {

}