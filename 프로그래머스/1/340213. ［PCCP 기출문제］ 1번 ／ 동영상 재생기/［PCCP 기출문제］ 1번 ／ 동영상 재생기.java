import java.time.Duration;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        Duration posDur = parseMinSec(pos);
        Duration startDur = parseMinSec(op_start);
        Duration endDur = parseMinSec(op_end);
        Duration lengthDur = parseMinSec(video_len);
        
        for(int i = 0; i < commands.length; i++) {
            if(posDur.compareTo(startDur) >= 0 && posDur.compareTo(endDur) <= 0) {
                posDur = endDur;
            }
            
            if(commands[i].equals("next")) {
                posDur = posDur.plusSeconds(10);
                if(posDur.compareTo(lengthDur) >= 0) {
                    posDur = lengthDur;
                }
            }
            
            if(commands[i].equals("prev")) {
                posDur = posDur.minusSeconds(10);
                if(posDur.isNegative()) {
                    posDur = Duration.ZERO;
                }
            }
            
            if(i + 1 == commands.length && posDur.compareTo(startDur) >= 0 && posDur.compareTo(endDur) <= 0) {
                posDur = endDur;
            }
        }
        
        return formatDuration(posDur) + answer;
    }
    
    private Duration parseMinSec(String str) {
        String[] time = str.split(":");
        int minutes = Integer.parseInt(time[0]);
        int seconds = Integer.parseInt(time[1]);
        return Duration.ofMinutes(minutes).plusSeconds(seconds);
    }
    
    private String formatDuration(Duration duration) {
        long totalSeconds = duration.getSeconds();
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}