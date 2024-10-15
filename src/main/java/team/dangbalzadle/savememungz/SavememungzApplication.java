package team.dangbalzadle.savememungz;

import team.dangbalzadle.savememungz.socialLogin.config.AppProperties; // AppProperties 클래스 추가
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class) // AppProperties 활성화
public class SavememungzApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavememungzApplication.class, args);
	}
}