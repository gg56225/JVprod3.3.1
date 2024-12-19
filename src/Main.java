import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseOperations<String> db = new DatabaseManager<>();

        // Сохранение данных
        db.save("Item 1");
        db.save("Item 2");

        // Получение данных
        System.out.println("Get item with ID 0: " + db.get(0));

        // Получение всех данных
        List<String> allItems = db.getAll();
        System.out.println("All items: " + allItems);

        // Удаление данных
        db.delete("Item 1");
        System.out.println("All items after deletion: " + db.getAll());
    }
}
