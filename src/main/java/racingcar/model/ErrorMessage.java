package racingcar.model;

public enum ErrorMessage {
    DUPLICATE_NAME("같은 이름의 자동차 이름이 존재합니다."),
    OVER_MAX_CAR_COUNT("저장할 수 있는 자동차의 개수를 초과했습니다."),
    NOT_VALID_CAR_NAME("자동차 이름의 길이가 한 글자 이상 다섯 글자 이하여야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
