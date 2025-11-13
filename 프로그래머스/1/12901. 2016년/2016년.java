import java.time.*;

class Solution {
    public enum WeekDay {
        SUNDAY("SUN"),
        MONDAY("MON"),
        TUESDAY("TUE"),
        WEDNESDAY("WED"),
        THURSDAY("THU"),
        FRIDAY("FRI"),
        SATURDAY("SAT");

        private final String shortName;

        WeekDay(String shortName) {
            this.shortName = shortName;
        }

        public String getShortName() {
            return shortName;
        }
    }
    
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return WeekDay.valueOf(dayOfWeek.name()).getShortName();
    }
}