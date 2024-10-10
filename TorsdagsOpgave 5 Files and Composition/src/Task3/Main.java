package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room0 = new Room(20, 45);
        Room room1 = new Room(5, 7);
        Room room2 = new Room(50, 12);

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(room0);
        rooms.add(room1);
        rooms.add(room2);

        Building building = new Building(rooms, 4);
        System.out.println("Total number of lamps in the building: " + countLampsInBuilding(building) +
                          "\nTotal number of windows in the building: " + countWindowsInBuilding(building) +
                           "\nTotal number of rooms in the building: " + countRoomsInBuilding(building));

        System.out.println("Does the building have more floors than it does number of rooms? " + isNormal(building));
    }
    public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        for (Room room: building.getRooms()){
           totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }
    public static int countWindowsInBuilding(Building building){
        int totalWindows = 0;
        for (Room room: building.getRooms()){
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }
    public static int countRoomsInBuilding(Building building){
        return building.getRooms().size();
    }
    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() >= countRoomsInBuilding(building);
    }
}
