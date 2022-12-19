import java.util.*;

// 2. Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.

public class task2 {

    public static void main(String[] args) {
        String person = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков" +
                "Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова" +
                "Анна Владимирова Иван Мечников Петр Петин Иван Ежов ";
        String[] personSplit = person.split(" ");
        Map<String, Integer> firstName = new HashMap<>();
        for (int i = 0; i < personSplit.length; i += 2) {
            if (firstName.containsKey(personSplit[i])) {
                firstName.replace(personSplit[i], firstName.get(personSplit[i]) + 1);
            } else {
                firstName.put(personSplit[i], 1);
            }
        }
        System.out.println(firstName);

        Map<String, Integer> lastName = new HashMap<>();
        for (int i = 1; i < personSplit.length; i += 2) {
            if (lastName.containsKey(personSplit[i])) {
                lastName.replace(personSplit[i], lastName.get(personSplit[i]) + 1);
            } else {
                lastName.put(personSplit[i], 1);
            }
        }
        System.out.println(lastName);

    }

}
