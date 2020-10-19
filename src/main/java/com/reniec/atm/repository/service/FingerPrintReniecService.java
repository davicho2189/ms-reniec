package com.reniec.atm.repository.service;


import com.reniec.atm.model.dto.ReniecResponse;
import com.reniec.atm.model.entity.FingerPrint;
import com.reniec.atm.model.exception.BusinessException;
import com.reniec.atm.repository.dao.FingerPrintReniecDao;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class FingerPrintReniecService implements IFingerPrintReniecService {

    @Autowired
    private FingerPrintReniecDao fingerPrintDao;

    @Override
    public Single<ReniecResponse> findByDocument(String dni) throws Exception {

           FingerPrint fingerPrint = fingerPrintDao.findByDocument(dni);
          if(fingerPrint!=null)
             return Single.just(new ReniecResponse("Reniec",true)).subscribeOn(Schedulers.io());
          else
           throw new BusinessException();
    }


}
