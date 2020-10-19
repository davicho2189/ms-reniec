package com.reniec.atm.repository.service;

import com.reniec.atm.model.dto.ReniecResponse;
import io.reactivex.Single;

public interface IFingerPrintReniecService {

  public Single<ReniecResponse> findByDocument(String dni) throws Exception;
}
