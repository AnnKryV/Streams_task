package Task1;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    /*Задание 1
------------
1) Создайте поток различных имен.+
2) Сделайте выборку имен, начинающихся
с определенной буквы (назначьте самостоятельно).+
3) Вывод выборки реализуйте с нумерацией
элементов перечня.+
*/

      public static void main(String[] args) {
          int count = 0;

          Stream<String> stream = Stream.of("Lucy", "Michella",
                  "Jason", "Roger", "Julia", "Teresa", "Jajabings");

          List<String> letter = stream.filter(str -> str.startsWith("J")).toList();

          for (String num: letter){
              count++;
              System.out.println(count + ")" + num);
          }
      }
    }

