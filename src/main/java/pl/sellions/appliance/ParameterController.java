package pl.sellions.appliance;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sellions.appliance.domain.Appliance;
import pl.sellions.appliance.domain.Parameter;
import pl.sellions.appliance.domain.ParameterInput;
import pl.sellions.appliance.service.ParameterService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/parameter")
public class ParameterController {

    private ParameterService parameterService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Parameter getParameter (@RequestParam Long id){
        return parameterService.getParameter(id);
    }

    @RequestMapping(value = "/appliance/{applianceId}", method = RequestMethod.GET, produces = "application/json")
    public List<Parameter> getParametersForAppliance (@RequestParam Long id){
        return parameterService.getParametersForAppliance(id);
    }

    @RequestMapping(value = "/parameter", method = RequestMethod.POST, produces = "application/json")
    public Long postParameter(@RequestBody ParameterInput parameterInput){
        return parameterService.addParameter(parameterInput);
    }


}
