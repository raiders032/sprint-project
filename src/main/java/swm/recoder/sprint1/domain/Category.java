package swm.recoder.sprint1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Category extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    private String name;

}
