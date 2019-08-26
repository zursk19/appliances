package pl.sellions.appliance.service;

import pl.sellions.appliance.domain.Appliance;
import pl.sellions.appliance.domain.Parameter;
import pl.sellions.appliance.domain.ParameterInput;

public class ParamaterAssembler {

    public static Parameter toParameter(ParameterInput input, Appliance appliance){
        return Parameter.builder()
                .name(input.getName())
                .description(input.getDescription())
                .appliance(appliance)
                .build();
    }
}
