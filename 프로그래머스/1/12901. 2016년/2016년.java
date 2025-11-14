import java.time.*;

class Solution {
    private static final String[] SHORT_DAYS = {
        "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"
    };

    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek day = date.getDayOfWeek();
        return SHORT_DAYS[day.getValue() - 1];
    }
}