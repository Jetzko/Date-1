import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        System.out.println("Days to end of this month: " + ((todayDate.lengthOfMonth()) - (todayDate.getDayOfMonth())));
        System.out.println("Days to end of this year: " + ((todayDate.lengthOfYear()) - (todayDate.getDayOfYear())));
    }
}
