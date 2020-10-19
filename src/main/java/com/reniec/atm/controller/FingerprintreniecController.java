package com.reniec.atm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reniec.atm.model.dto.FingerPrintRequest;
import com.reniec.atm.model.dto.ReniecResponse;
import com.reniec.atm.repository.service.FingerPrintReniecService;

import io.reactivex.Single;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "FingerPrin Reniec microservicio" )
@RestController
@RequestMapping("external")
public class FingerprintreniecController {

    @Autowired
    private FingerPrintReniecService fingerprintreniecService;


    @ApiOperation(value = "Obtener si la huella es correcta ", response = ReniecResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 404, message = "No se encontro huella")})
    @PostMapping("/reniec/validate/")
    public Single<ReniecResponse> GetFingerPrint(
    		@RequestBody FingerPrintRequest fingerprint
    ) throws Exception {
            return fingerprintreniecService.findByDocument(fingerprint.getDocument());
    }

}
