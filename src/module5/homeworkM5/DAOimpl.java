package module5.homeworkM5;

public class DAOimpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println(room + "save");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room + "delete");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room + "update");
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }
}
