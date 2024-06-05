import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.VacationServices;

public class VacationServicesTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testVacation.csv")
    public void testVacation(int income, int expenses, int threshold, int expected) {
        VacationServices months = new VacationServices();
        int actual = months.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
