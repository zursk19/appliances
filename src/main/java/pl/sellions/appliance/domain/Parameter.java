package pl.sellions.appliance.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Parameter {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "appliance", referencedColumnName = "id")
    private Appliance appliance;
}
