package com.reniec.atm.model.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@ApiModel("FingerPrint")
@Data
@NoArgsConstructor
@Entity
@Table(name="fingerprint")
public class FingerPrint implements Serializable {

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    private String document;
}
