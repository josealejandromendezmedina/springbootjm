package com.jmendeztech.dbsearcher.impl;

 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jmendeztech.dbsearcher.model.CcInformation;
import com.jmendeztech.dbsearcher.repository.CcInformationRepository;
import com.jmendeztech.dbsearcher.service.CcInformationService;

@Service
public class CcInformationServiceImpl implements CcInformationService {

    private final CcInformationRepository ccInformationRepository;

    @Autowired
    public CcInformationServiceImpl(CcInformationRepository ccInformationRepository) {
        this.ccInformationRepository = ccInformationRepository;
    }

    @Override
    public List<CcInformation> getAllCcInformation() {
        return ccInformationRepository.findAll();
    }
}

