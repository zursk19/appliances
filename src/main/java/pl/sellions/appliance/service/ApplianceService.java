package pl.sellions.appliance.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sellions.appliance.domain.Appliance;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class ApplianceService {

    private ApplianceRepository applianceRepository;

    public List<Appliance> getAppliances(){
        return applianceRepository.findAll();
    }

    public Appliance getAppliance(String id) {
        Optional<Appliance> appliance = applianceRepository.findById(id);
        if(appliance.isPresent()){
            return appliance.get();
        }
            return null;
    }

    public String createAppliance (Appliance appliance){
        Appliance checkAppliance = getAppliance(appliance.getId());
        if(isNull(checkAppliance)) {
            applianceRepository.save(appliance);
        }
        return appliance.getId();
    }
}
