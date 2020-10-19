package com.reniec.atm.repository.dao;

import com.reniec.atm.model.entity.FingerPrint;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FingerPrintReniecDao extends JpaRepository<FingerPrint, Long> {

  FingerPrint findByDocument(String dni);
}
