package team.dangbalzadle.savememungz;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import team.dangbalzadle.savememungz.socialLogin.config.AppProperties; // AppProperties 클래스 추가
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableJpaAuditing //엔티티 생성, 수정 시간 추적
@EnableConfigurationProperties(AppProperties.class) // AppProperties 활성화
public class SavememungzApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavememungzApplication.class, args);
	}
}