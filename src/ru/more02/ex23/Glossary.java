package ru.more02.ex23;

import java.util.*;

public class Glossary {

    public Glossary() {
        CreateMap();
    }
    public Map<String, String> CreateMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Abc", "abc");
        map.put("Ade", "cde");
        map.put("Aлc", "cde");
        map.put("Brk", "cde");
        map.put("Cfg", "efg");
        map.put("Cre", "cde");
        map.put("Сbc", "cde");
        map.put("Clg", "efg");

        Map<String, String> copiedMap = new HashMap<>();

        copiedMap.put("Abc", "abc");
        copiedMap.put("Ade", "cde");
        copiedMap.put("Aлc", "cde");
        copiedMap.put("Brk", "cde");
        copiedMap.put("Cfg", "efg");
        copiedMap.put("Cre", "cde");
        copiedMap.put("Сbc", "cde");
        copiedMap.put("Clg", "efg");


        for(Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key+" "+value);
        }

        for(Map.Entry<String, String> pair : map.entrySet()) {
            int k=0;
            String value = pair.getValue();
            for(Map.Entry<String, String> pair2 : map.entrySet()) {
                String key2 = pair2.getKey();
                String value2 = pair2.getValue();
                if (value==value2) k++;
                if ((k>1)&&(value==value2)) {
                    copiedMap.remove(key2);

                }
            }
        }

        System.out.println("После удаления");
        if (copiedMap.size()!=0) {
            for (Map.Entry<String, String> pair : copiedMap.entrySet()) {
                String key = pair.getKey();
                String value = pair.getValue();
                System.out.println(key + " " + value);
            }
        }
        return copiedMap;
    }

    public static void main(String[] args) {
        new Glossary();
    }
}

