package org.techlab.labxpert.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="patients")
public class Patient extends Personne{

    public Patient() {

    }
}
