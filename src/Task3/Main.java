package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
Задание 3
-----------
1) На протяжении понедельник-воскресенье
ежедневно замерялась температура воздуха.+
2) Диапазон температур составил
от +8 до +15 градусов, включительно.+
3) Произведите выборку ежедневных показаний
температуры, которые были в диапазоне
от +10 до +13 градусов, включительно.+
4) Вывод выборки реализуйте с нумерацией
элементов перечня.*/
    public static void main(String[] args) {
        getOutData(getTemp());
    }

    public static List<Integer> getTemp() {
        List<Integer> templist = new ArrayList<>();
        templist.add(9);
        templist.add(10);
        templist.add(13);
        templist.add(15);
        templist.add(10);
        templist.add(14);
        templist.add(8);
        return templist;
    }


    private static void getOutData(List<Integer> templist) {
        int count = 0;
        List<Integer> evenNumbers = templist.stream()
                .filter(n -> n >= 10)
                .filter(s -> s <= 13).toList();

        for (Integer num: evenNumbers){
            count++;
            System.out.println(count + ")" + num);
        }

        }
    }


