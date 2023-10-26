package com.jmendeztech.dbsearcher.repository;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jmendeztech.dbsearcher.model.CcInformation;

@Repository
public interface CcInformationRepository extends JpaRepository<CcInformation, String> {
}
