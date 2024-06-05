import ru.netology.services.VacationServices;

public class Main {
    public static void main(String[] args) {
        VacationServices myVacation = new VacationServices();
        System.out.println(myVacation.calculate(100_000, 60_000, 150_000));
    }
}
