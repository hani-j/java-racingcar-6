package racingcar.view;

import java.util.List;
import racingcar.model.CarDto;

public class OutputView {
    private final static String MOVEMENT = "-";

    public void requestCarNamesMessage() {
        System.out.println(OutputMessage.REQUEST_CAR_NAMES.getMessage());
    }

    public void requestNumberOfTryMessage() {
        System.out.println(OutputMessage.REQUEST_NUMBER_OF_TRY.getMessage());
    }

    public void raceResultMessage() {
        System.out.println(OutputMessage.RACE_RESULT.getMessage());
    }

    public void raceResultByOrderMessage(List<CarDto> cars) {
        for(CarDto car : cars) {
            System.out.println(car.getName() + " : " + MOVEMENT.repeat(car.getPosition()));
        }
    }

    public void raceWinnerMessage(List<String> cars) {
        System.out.println(OutputMessage.WINNER_IS.getMessage() + String.join(", ", cars));
    }
}
