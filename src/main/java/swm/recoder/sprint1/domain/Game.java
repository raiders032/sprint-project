package swm.recoder.sprint1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Game extends BaseEntity {

    @Id @GeneratedValue
    @Column(name="game_id")
    private Long id;

    private Long selectedRestaurantId;

    private String address;

    private int totalCount;

    private int count;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String weather;

    private double temperature;

    @Enumerated(EnumType.STRING)
    private GameStatus status;
}
