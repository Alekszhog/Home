package com.company.lesson10.phonebook;

public class PhoneBook {
    private Map<String, List<String>> phoneMap = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        List<String> phonelist = phoneMap.get(surname);
        if (phonelist == null) {
            ArrayList<String> newPhoneList = new ArrayList<>();
            newPhoneList.add(phoneNumber);

            phoneMap.put(surname, newPhoneList);
        } else {
            phonelist.add(phoneNumber);
        }
    }

    public List<String> get(String surname) {
        return phoneMap.get(surname);
    }
}
