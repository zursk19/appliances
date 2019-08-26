package pl.sellions.appliance.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Parameter {

    @Id
    @SequenceGenerator(name = "SEQ_PARAM", sequenceName = "SEQ_PARAM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PARAM")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "appliance", referencedColumnName = "id")
    private Appliance appliance;
}
