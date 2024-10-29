package team.dangbalzadle.savememungz.domain.enums.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Region {
    SUWON("수원시"),
    SEONGNAM("성남시"),
    GOYANG("고양시"),
    YONGIN("용인시"),
    BUCHEON("부천시"),
    ANSAN("안산시"),
    ANYANG("안양시"),
    NAMYANGJU("남양주시"),
    HWASEONG("화성시"),
    UIJEONGBU("의정부시"),
    SIHEUNG("시흥시"),
    PYEONGTAEK("평택시"),
    GWANGMYEONG("광명시"),
    PAJU("파주시"),
    GUNPO("군포시"),
    GWANGJU("광주시"),
    GIMPO("김포시"),
    ICHEON("이천시"),
    YANGJU("양주시"),
    GURI("구리시"),
    OSAN("오산시"),
    ANSEONG("안성시"),
    UIWANG("의왕시"),
    HANAM("하남시"),
    POCHEON("포천시"),
    DONGDUCHEON("동두천시");

    private final String korean;

    public static Region krToEn(String korean) {
        return Arrays.stream(Region.values())
                .filter(city -> city.getKorean().equals(korean))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 도시명입니다: " + korean));
    }
}
