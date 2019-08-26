package pl.sellions.appliance.domain;

import lombok.Data;

@Data
public class ParameterInput {

    private String name;
    private String description;
    private Long applianceId;
}
