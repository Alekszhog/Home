package com.company.lesson10;

public class Main {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("aa");
        list.add("d");
        list.add("e");
        list.add("c");
        list.add("cc");
        list.add("f");
        Map<String, Integer> countWordsMap = new HashMap<>();
        Set<String> uniqWords = new HashSet<>(list);
        for (String word : list) {
            Integer val = countWordsMap.get(word);
            if (val == null) {
                countWordsMap.put(word, 1);
            } else {
                countWordsMap.put(word, val +1);
            }
        }

        System.out.println(uniqWords);

    }
}
