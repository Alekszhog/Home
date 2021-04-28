package com.company.lesson10.phonebook;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("man");
        words.add("man");
        words.add("woman");
        words.add("tag");
        words.add("tag");

        showUniqWithCountRepeat(words);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(surname: "a", phoneNumber: "123");
        phoneBook.add(surname: "a", phoneNumber: "1234");
        phoneBook.add(surname: "a", phoneNumber: "1235");
        phoneBook.add(surname: "b", phoneNumber: "1236");

        System.out.println(phoneBook.get("a"));
        System.out.println(phoneBook.get("b"));
    }
    private static void showUniqWithCountRepeat(List<String> words) {
        HashMap<String, Integer> countRepeatByWords = new HashMap<>();
        for (String word : words) {
            Integer countRepeat = countRepeatByWords.get(word);
            if (countRepeat == null) {
                countRepeatByWords.put(word, 1);
            } else countRepeatByWords.put(word.countRepeat + 1);
        }
    }
    Set<String> uniqWords = countRepeatByWords.keySet();
    System.out.println(countRepeatByWords);
    System.out.println(uniqWords);
}
