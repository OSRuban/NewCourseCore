package module5.homeworkM5;

import java.util.Date;

public class BookingComAPI implements API {
    Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room room1 = new Room(112233, 250, 2, new Date(), "Manhattan", "New York");
        Room room2 = new Room(112233, 350, 2, new Date(), "The capital", "Washington");
        Room room3 = new Room(112233, 450, 2, new Date(), "Disneyland", "Los Angeles");
        Room room4 = new Room(112233, 550, 2, new Date(), "Chicago bulls", "Chicago");
        Room room5 = new Room(112233, 650, 2, new Date(), "Madagascar", "San Diego");
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
