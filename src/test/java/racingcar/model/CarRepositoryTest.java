package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarRepositoryTest {

    CarRepository carRepository;

    @BeforeEach
    void setUp() {
        carRepository = new CarRepository();
        Car car1 = new Car("pobi");
        Car car2 = new Car("woni");
        Car car3 = new Car("jun");

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);
    }

    @DisplayName("Car 저장 기능 테스트")
    @Test
    void testSave() {
        int expected = 4;
        Car car4 = new Car("hani");

        carRepository.save(car4);

        assertEquals(expected, carRepository.getCars().size());
    }

    @DisplayName("Car 저장 중 이름 중복 검사 기능 테스트")
    @Test
    void testSaveValidateDuplicateName() {
        Car car4 = new Car("pobi");

        assertThrows(IllegalArgumentException.class, () -> carRepository.save(car4));
    }

    @DisplayName("winner 찾는 기능 테스트")
    @Test
    void testGetWinner() {
        List<String> expected = List.of("pobi", "woni", "jun");

        List<String> winner = carRepository.getWinner();

        assertEquals(expected, winner);
    }
}
