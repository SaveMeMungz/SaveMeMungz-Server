package team.dangbalzadle.savememungz.domain.enums.trail;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Difficulty {
    VERY_EASY("매우 쉬움"),
    EASY("쉬움"),
    NORMAL("보통"),
    HARD("어려움"),
    VERY_HARD("매우 어려움");

    private final String korean;

    public static Difficulty krToEn(String korean) {
        return Arrays.stream(Difficulty.values())
                .filter(difficulty -> difficulty.getKorean().equals(korean))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 난이도입니다: " + korean));
    }
}
