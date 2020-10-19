package com.reniec.atm.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

@ApiModel("FingerPrintRequest")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FingerPrintRequest {

    private String document;
}
