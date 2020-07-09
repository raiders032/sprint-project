package swm.recoder.sprint1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter @Setter
public class RestaurantPhoto extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "retaurant_id")
    private Restaurant restaurant;

    private String filename;

    private String path;
}
