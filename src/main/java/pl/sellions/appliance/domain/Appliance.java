package pl.sellions.appliance.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sellions.appliance.enums.ApplianceCategory;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "appliance")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appliance {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private ApplianceCategory category;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private boolean status;
}
