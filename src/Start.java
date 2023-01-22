import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        System.out.println("Days to end of this month: " + ((todayDate.getDayOfMonth()) - (todayDate.lengthOfMonth())));
        System.out.println("Days to end of this year: " + ((todayDate.getDayOfYear()) - (todayDate.lengthOfYear())));
    }
}
