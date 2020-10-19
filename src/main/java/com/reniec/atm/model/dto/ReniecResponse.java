package com.reniec.atm.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ApiModel("ReniecResponse")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReniecResponse {

  private String entityName;
  private Boolean success;

}
