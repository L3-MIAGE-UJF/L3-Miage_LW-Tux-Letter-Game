package management;

public class Chronometre {

    private long begin;
    private long end;
    private long current;
    private int limite;

    public Chronometre(int limite) {
        begin = 0;
        end = 0;
        current = 0;
        this.limite = limite;
    }

    public void start() {
        this.begin = System.currentTimeMillis();
    }

    public void stop() {
        this.end = System.currentTimeMillis();
    }

    public long getTime() {
        return System.currentTimeMillis();
    }

    public long getMilliseconds() {
        return end - begin;
    }

    public int getSeconds() {
        return (int) ((end - begin) / 1000.0) % 60;
    }
 
    public int getMinutes() {
        return (int) (getSeconds() / 60) % 60;
    }

    public int getHours() {
        return (int) getMinutes() / 60;
    }

    public int remainsTime() {
        current = getTime();
        int timeSpent;
        timeSpent = (int) ((begin + (limite*1000) - current)/1000.0);
        return timeSpent;
    }
}