package stage3.CarRacing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRacingTest {

    @Test
    @DisplayName("자동차 전진 또는 멈춤")
    public void forwardOrStop() {

        /* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다. */
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("랜덤 값 " + randomNumber);

        System.out.println("랜덤 값 구한 후 자동차 전진 여부 : ");
        System.out.println(randomNumber >= 4 ? "_" : "");

        if (randomNumber >= 4) {
            assertThat(randomNumber).isLessThan(10);
        }
        if (randomNumber <= 3) {
            assertThat(randomNumber).isGreaterThan(-1);
        }
    }
}
