package Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    /*
Задание 2
-----------
1) Есть перечень из 6-ти разных товаров.
Имя товара - ключ, цена - значение.
2) Диапазон цен от 1.05 до 3.15.
3) Произведите выборку товаров, цены которых
меньше и равны 2.00.
4) Вывод выборки реализуйте с нумерацией
элементов перечня.
*/

    public static void main(String[] args) {
        Map<Double, String> products = new HashMap<>();
        products.put(1.6, "Carpet");
        products.put(2.4, "Chair");
        products.put(1.09, "Table");
        products.put(1.2, "Lamp");
        products.put(2.0, "Oven");
        products.put(3.1, "Kettle");

        Map<Double, String> result = products.entrySet()
                .stream()
                .filter(map -> 2 >= map.getKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        int count = 0;

        for (Map.Entry<Double, String> m : result.entrySet()) {
            count++;
            System.out.println(count + ")" + m.getKey() + " " + m.getValue());
        }
    }
}