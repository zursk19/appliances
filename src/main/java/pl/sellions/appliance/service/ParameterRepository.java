package pl.sellions.appliance.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.sellions.appliance.domain.Appliance;
import pl.sellions.appliance.domain.Parameter;

import java.util.List;

@Repository
public interface ParameterRepository extends JpaRepository<Parameter, Long> {

    @Query(value = "SELECT p from Parameter p " +
            "where p.appliance.id=:applianceId")
    List<Parameter> findByAppliance(@Param("applianceId") Long applianceId);
}
