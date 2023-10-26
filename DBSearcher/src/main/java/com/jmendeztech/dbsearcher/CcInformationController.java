package com.jmendeztech.dbsearcher;

 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jmendeztech.dbsearcher.model.CcInformation;
import com.jmendeztech.dbsearcher.service.CcInformationService;

@RestController
@RequestMapping("/api/cc-information")
public class CcInformationController {

    private final CcInformationService ccInformationService;

    @Autowired
    public CcInformationController(CcInformationService ccInformationService) {
        this.ccInformationService = ccInformationService;
    }

    @GetMapping
    public ResponseEntity<List<CcInformation>> getAllCcInformation() {
    	
    	System.out.println("SEARCHING FOR DATA!!");
    	
        List<CcInformation> ccInformationList = ccInformationService.getAllCcInformation();
        return ResponseEntity.ok(ccInformationList);
    }
}
