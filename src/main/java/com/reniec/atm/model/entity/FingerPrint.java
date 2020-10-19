package com.reniec.atm.model.entity;

import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("FingerPrint")
@Data
@NoArgsConstructor
@Entity
@Table(name = "fingerprint")
public class FingerPrint implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private Long id;
  private String document;
}
