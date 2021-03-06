package com.reniec.atm.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No se encuentra dni")
public class BusinessException extends Exception {

  /**
   * serialVersionUID.
   */
  private static final long serialVersionUID = 1L;

  public BusinessException() {}

}