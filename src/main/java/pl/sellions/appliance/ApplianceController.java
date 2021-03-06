package pl.sellions.appliance;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sellions.appliance.domain.Appliance;
import pl.sellions.appliance.service.ApplianceService;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/appliance")
public class ApplianceController {

    private ApplianceService applianceService;

    @RequestMapping(value = "/appliances", method = RequestMethod.GET, produces = "application/json")
    public List<Appliance> getApplianceList (){
        return applianceService.getAppliances();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Appliance getAppliance (@RequestParam Long id){
        return applianceService.getAppliance(id);
    }

    @RequestMapping(value = "/appliance", method = RequestMethod.POST, produces = "application/json")
    public Long createAppliance (@RequestBody Appliance appliance){
        return applianceService.createAppliance(appliance);
    }

    @RequestMapping(value = "/status/", method = RequestMethod.GET, produces = "application/json")
    public List<Appliance> getAppliancesByStatus(@RequestParam Boolean status){
        return applianceService.getApplianceByStatus(status);
    }
}
