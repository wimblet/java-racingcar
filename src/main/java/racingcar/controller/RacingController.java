package racingcar.controller;

import java.util.List;

import racingcar.behavior.RandomMovingStrategy;
import racingcar.domain.Car;
import racingcar.domain.RacingCars;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingController {
    public static void main(String[] args) {
        int numOfCar = InputView.inputNumOfCar();
        int loopCount = InputView.inputLoopCount();

        RacingCars racingCars = RacingCars.of(numOfCar, new RandomMovingStrategy());
        ResultView.printResultMessage();
        for (int i = 0; i < loopCount; i++) {
            racingCars.run();
            List<Car> cars = racingCars.getCars();
            ResultView.printResult(cars);
        }
    }
}