package com.reniec.atm.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

@ApiModel("ReniecResponse")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReniecResponse {

    private String entityName;
    private  Boolean success;

}
