package team.dangbalzadle.savememungz.domain.entity;


import jakarta.persistence.*;
import lombok.*;
import team.dangbalzadle.savememungz.domain.common.BaseEntity;
import team.dangbalzadle.savememungz.domain.enums.shelter.ShelterTag;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Shelter extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40)
    private String name;

    @Column(length = 40)
    private String address;

    @Column(length = 20)
    private String tel;

    //태그
    @Enumerated(EnumType.STRING)
    private ShelterTag shelterTag;

    private Double lattitude;
    private Double longitude;

    @OneToMany(mappedBy = "shelter", cascade = CascadeType.ALL)     // 1:N 관계 매핑(양방향)
    private List<WalkingTrail> trails = new ArrayList<>();  // 산책로 목록
}
