package pl.sellions.appliance.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sellions.appliance.domain.Appliance;
import pl.sellions.appliance.domain.Parameter;
import pl.sellions.appliance.domain.ParameterInput;

import java.util.List;
import java.util.Optional;

import static java.util.Objects.isNull;


@Service
@AllArgsConstructor
@RequestMapping(value = "/parameter")
public class ParameterService {

    private ApplianceService applianceService;
    private ParameterRepository parameterRepository;

    public Parameter getParameter(Long id){
        Optional<Parameter> parameter = parameterRepository.findById(id);
        if(parameter.isPresent()){
            return parameter.get();
        }
        return null;
    }
    public List<Parameter> getParametersForAppliance(Long applianceId){
        return parameterRepository.findByAppliance(applianceId);
    }

    public Long addParameter(ParameterInput parameterInput){
        Appliance appliance = applianceService.getAppliance(parameterInput.getApplianceId());
        if(!isNull(appliance)){
            Parameter parameter = ParamaterAssembler.toParameter(parameterInput, appliance);
            parameterRepository.save(parameter);
            return parameter.getId();
        }
        return null;
    }
}
