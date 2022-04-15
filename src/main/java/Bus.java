public class Bus {
    public int stop = 0;
    public int stops;
    // i got on the ncssm waitlist
    public Bus(int stps) {
        stops = stps-1;
    }
    public int getCurrentStop() {
        return Math.abs(stop)+1;
    }
    public void move() {
        if((++stop)>=stops)stop*=-1;
    }
}