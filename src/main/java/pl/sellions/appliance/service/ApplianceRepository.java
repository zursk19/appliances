package pl.sellions.appliance.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sellions.appliance.domain.Appliance;

import java.util.List;

public interface ApplianceRepository extends JpaRepository<Appliance, Long> {
    List<Appliance> findByStatus(Boolean status);
}
