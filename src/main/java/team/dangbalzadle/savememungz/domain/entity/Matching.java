package team.dangbalzadle.savememungz.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import team.dangbalzadle.savememungz.domain.common.BaseEntity;
import team.dangbalzadle.savememungz.domain.enums.matching.Neutered;
import team.dangbalzadle.savememungz.domain.enums.matching.Sex;
import team.dangbalzadle.savememungz.domain.enums.matching.Weight;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Matching extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //견종 무게
    @Enumerated(EnumType.STRING)
    private Weight weight;

    //견종 성별
    @Enumerated(EnumType.STRING)
    private Sex sex;

    //견종 중성화 여부
    @Enumerated(EnumType.STRING)
    private Neutered neutered;

//    //유저 아이디 매핑
//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;
}
