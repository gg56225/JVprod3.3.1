import java.util.ArrayList;
import java.util.List;

public class DatabaseManager<T> implements DatabaseOperations<T> {
    private List<T> database = new ArrayList<>();

    @Override
    public void save(T item) {
        database.add(item);
        System.out.println("Item saved: " + item);
    }

    @Override
    public void delete(T item) {
        database.remove(item);
        System.out.println("Item deleted: " + item);
    }

    @Override
    public T get(int id) {
        if (id >= 0 && id < database.size()) {
            return database.get(id);
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(database);
    }
}
