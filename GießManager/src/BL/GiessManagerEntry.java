package BL;

import java.time.LocalDateTime;

public class GiessManagerEntry {

    private LocalDateTime datetime;
    private double temp;
    private double lastTime;

    public GiessManagerEntry(LocalDateTime datetime, double temp, double lastTime) {
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
