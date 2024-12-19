public class Main {
    public static void main(String[] args) {
        // Примеры использования методов класса Calculator
        System.out.println("Sum: " + Calculator.sum(5, 3.2));
        System.out.println("Multiply: " + Calculator.multiply(5, 3.2));
        System.out.println("Divide: " + Calculator.divide(5, 3.2));
        System.out.println("Subtract: " + Calculator.subtract(5, 3.2));

        // Примеры использования метода compareArrays
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {4, 5, 6};
        System.out.println("Arrays are equal: " + ArrayUtils.compareArrays(array1, array2));
        System.out.println("Arrays are equal: " + ArrayUtils.compareArrays(array1, array3));

        // Примеры использования класса Pair
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
        System.out.println("Pair: " + pair);
    }
}
