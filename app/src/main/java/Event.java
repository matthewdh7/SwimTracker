import java.lang.reflect.Array;

public class Event {
    public String name;
    public int[] pastTimes;
    public int bestTime;
    public int lastTime;
    public boolean improved;

    public Event (String name) {
        this.name = name;
    }
}
