//package team.dangbalzadle.savememungz.domain.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//import team.dangbalzadle.savememungz.domain.common.BaseEntity;
//import team.dangbalzadle.savememungz.domain.enums.user.Mbti;
//import team.dangbalzadle.savememungz.domain.enums.user.Region;
//import team.dangbalzadle.savememungz.domain.enums.user.UserLevel;
//
//@Entity
//@Getter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//public class User extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, length = 20, unique = true)
//    private String login_id;
//
//    @Column(nullable = false, length = 20)
//    private String password;
//
//    //온보딩 레벨
//    @Enumerated(EnumType.STRING)
//    private UserLevel user_level;
//
//    @Column(nullable = false, length = 20, unique = true)
//    private String nickname;
//
//    //유저 mbti
//    @Enumerated(EnumType.STRING)
//    private Mbti mbti;
//
//    //유저 거주지역
//    @Enumerated(EnumType.STRING)
//    private Region region;
//
//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL) //유저 삭제시 매칭정보도 삭제
//    private Matching matching;
//}