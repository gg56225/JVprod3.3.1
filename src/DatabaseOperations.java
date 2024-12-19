import java.util.List;

public interface DatabaseOperations<T> {
    void save(T item);
    void delete(T item);
    T get(int id);
    List<T> getAll();
}
