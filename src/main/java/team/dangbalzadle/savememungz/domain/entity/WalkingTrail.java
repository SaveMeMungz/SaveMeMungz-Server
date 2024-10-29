package team.dangbalzadle.savememungz.domain.entity;


import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;
import team.dangbalzadle.savememungz.domain.enums.trail.Difficulty;

import java.sql.Time;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class WalkingTrail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40)
    private String name;

    @Column(length = 40)
    private String type;

    @Column(length = 40)
    private String city;

    @Column(length = 20)
    private String duration;

    @Column(length = 40)
    private String address;

    //난이도
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @Column(columnDefinition = "TEXT", length = 1000)
    private String description;

    private Double length;
    private Double lattitude;
    private Double longitude;

    //보호소 id 외래키 매핑
    @ManyToOne(fetch = FetchType.LAZY)  // 지연로딩
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;

}
