package racingcar;

import java.util.Scanner;

public class RacingGameInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int takeNumberOfCars() {
        System.out.println("자동차 대수는 몇 대 인가요? ");
        return scanner.nextInt();
    }

    public static int takeNumberOfTimes() {
        System.out.println("시도할 회수는 몇 회 인가요? ");
        return scanner.nextInt();
    }
}