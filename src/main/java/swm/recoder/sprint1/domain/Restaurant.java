package swm.recoder.sprint1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Restaurant extends  BaseEntity{
    @Id @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Menu> menuList;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<RestaurantPhoto> photos;

    private double google_rating;

    private double naver_rating;

    private int naver_review_count ;

    private int google_review_count ;

    private String opening_hours;

    private String business_status;

    private int price_level;

    private String address;

    private float longitude;

    private float latitude;

    private String phone;

}
