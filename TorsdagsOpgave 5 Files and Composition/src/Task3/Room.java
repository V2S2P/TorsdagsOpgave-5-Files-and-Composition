package Task3;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfWindows, int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
