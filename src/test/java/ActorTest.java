import org.example.Actor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.assertj.core.api.Assertions.assertThat;

public class ActorTest {

    @Test
    public void shouldCalculateSalaryCorrectly() {
        int expectedSalary = 300;
        int actualSalary;
        Actor actor1 = new Actor("John", "Doe", 3, true);
        actualSalary = actor1.calculateSalary(3, 100);
        assertThat(expectedSalary).isEqualTo(actualSalary);
        System.out.println("Koniec");
}

    @ParameterizedTest
    public void testnowy() {
    }
}