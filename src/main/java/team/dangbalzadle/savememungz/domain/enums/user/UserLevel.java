package team.dangbalzadle.savememungz.domain.enums.user;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserLevel {
    REGISTERED(0),
    ONBOARDED(1),
    ACTIVE(2);

    private int value;
}
