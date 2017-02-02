package com.livingprogress.mentorme.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * The state.
 */
@Getter
@Setter
@Entity
public class State extends LookupEntity {
    @JsonIgnore
    Long countryId;
}

