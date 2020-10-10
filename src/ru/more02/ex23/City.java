package ru.more02.ex23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    public class Maps {
        public Maps() {
            CreateMap2();
        }
        public void CreateMap2() {
            Map<String, ArrayList<String>> maps = new HashMap<>();
            City city1 = new City("Russia", "Moscow");
            City city2 = new City("Russia", "Vologda");
            City city3 = new City("Russia", "Kaliningrad");

            City city4 = new City("China", "Pekin");
            City city5 = new City("China", "Wuhan");
            ArrayList<String> cities = new ArrayList<String>();
            cities.add(city1.getCity());
            cities.add(city2.getCity());
            cities.add(city3.getCity());
            ArrayList<String> cities2 = new ArrayList<String>();
            cities.add(city4.getCity());
            cities.add(city5.getCity());
            maps.put(city1.getCountry(), cities);
            maps.put(city2.getCountry(), cities2);

        }

    }

}
