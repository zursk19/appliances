package pl.sellions.appliance.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sellions.appliance.domain.Appliance;

public interface ApplianceRepository extends JpaRepository<Appliance, String> {
}
