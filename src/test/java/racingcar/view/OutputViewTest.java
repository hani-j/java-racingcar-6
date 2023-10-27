package racingcar.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.view.OutputView;

public class OutputViewTest {
    OutputView outputView;

    @BeforeEach
    public void setUp() {
        outputView = new OutputView();
    }

    @DisplayName("자동차 이름 입력 요청 메세지 출력 기능 테스트")
    @Test
    void testRequestCarNamesMessage() {
        String expected = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        outputView.requestCarNamesMessage();
        System.setOut(System.out);

        assertEquals(expected, outputStream.toString());
    }

    @DisplayName("시도할 회수 요청 메세지 출력 기능 테스트")
    @Test
    void testRequestNumberOfTryMessage() {
        String expected = "시도할 회수는 몇회인가요?\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        outputView.requestNumberOfTryMessage();
        System.setOut(System.out);

        assertEquals(expected, outputStream.toString());
    }

    @DisplayName("실행 결과 메세지 출력 기능 테스트")
    @Test
    void testRaceResultMessage() {
        String expected = "실행 결과\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        outputView.raceResultMessage();
        System.setOut(System.out);

        assertEquals(expected, outputStream.toString());
    }
}
