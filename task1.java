// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBooks = new HashMap<>();
        phoneBooks.put("Ivanov", List.of("495-17-12", "999-99-99"));
        phoneBooks.put("Petrov", List.of("495-56-99"));

        addPhoneNumber(phoneBooks);

        System.out.println(phoneBooks);

        findPhoneNumber("Ivanov", phoneBooks);

    }

    public static HashMap<String, List<String>> addPhoneNumber(HashMap<String, List<String>> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lastname:");
        String lN = scanner.nextLine();
        System.out.println("Enter number:");
        String number = scanner.nextLine();
        List<String> newList = new ArrayList<>();
        if (map.containsKey(lN)) {
            System.out.println("yes");
            newList.addAll(map.get(lN));
            newList.add(number);
        } else {
            System.out.println("No");
            newList.add(number);
        }
        map.put(lN, newList);
        scanner.close();
        return map;
    }

    public static void findPhoneNumber(String inputLastName, HashMap<String, List<String>> phoneBook) {
        System.out.printf("Lastname: %s: Number: %s", inputLastName, phoneBook.get(inputLastName));
    }
}
