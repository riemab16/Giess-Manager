package BL;

import java.time.LocalDateTime;

public class GießManager {

    private LocalDateTime datetime;
    private double temp;
    private double lastTime;

    public GießManager(LocalDateTime datetime, double temp, double lastTime) {
        this.datetime = datetime;
        this.temp = temp;
        this.lastTime = lastTime;
    }
    
    public LocalDateTime getDatetime() {
        return datetime;
    }

    public double getTemp() {
        return temp;
    }

    public double getLastTime() {
        return lastTime;
    }
    
}
