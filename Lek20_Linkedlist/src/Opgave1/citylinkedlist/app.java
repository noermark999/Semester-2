package Opgave1.citylinkedlist;

public class app {
    public static void main(String[] args) {
        City city1 = new City("Lemvig", 5312);
        City city2 = new City("Harboøre", 1423);
        CityList cityList = new CityList();
        cityList.addFirst(city1);
        cityList.addFirst(city2);
        System.out.println(cityList.numberInhabitants());
    }
}
