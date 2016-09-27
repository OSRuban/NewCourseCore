package module5.homeworkM5;

import java.util.Date;

public class GoogleAPI implements API {
    Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(112233, 250, 2, new Date(), "Ueno Park", "Tokio");
        Room room2 = new Room(112233, 350, 2, new Date(), "Golden temple", "Kyoto");
        Room room3 = new Room(112233, 450, 2, new Date(), "Umeda Sky", "Osaka");
        Room room4 = new Room(112233, 550, 2, new Date(), "Kasuga", "Nara");
        Room room5 = new Room(112233, 650, 2, new Date(), "Happiness", "Yokohama");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
