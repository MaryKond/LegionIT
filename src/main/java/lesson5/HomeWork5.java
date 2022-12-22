package lesson5;

import java.lang.reflect.Array;
import java.util.*;

//Assignment 1

public class HomeWork5 {
    public static void main(String[] args) {

        HomeWork5 dayOfWeek = new HomeWork5();

        String dayday = dayOfWeek.getDay(5);  ////////Assignment 1


        Scanner scanner = new Scanner(System.in);////////Assignment 2
        System.out.print("Enter the Toy ID: ");////////Assignment 2
        int ID = Integer.parseInt(scanner.next());////////Assignment 2
        String theToyis1 = dayOfWeek.getToyByID(ID);////////Assignment 2


        dayOfWeek.removeDuplicates(); ////////Assignment 3
    }

    //Assignment 1
    public String getDay(int day) {
        String dayday = "";

        String[] arrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (day > 0 && day <= arrayWeek.length) {
            dayday = dayday + (Array.get(arrayWeek, day - 1));
            System.out.println(dayday);
        } else {
            dayday = "Please choose correct number of the weekday";
        }
        return dayday;
    }

    //Assignment 2
    public String getToyByID(int ID) {
        String theToyis = "";
        HashMap<Integer, String> mapToys = new HashMap<Integer, String>();
        mapToys.put(12, "Batmobile");
        mapToys.put(45, "Light Saber");
        mapToys.put(6, "Wonder Woman");
        mapToys.put(201, "Hello Kitty Bag");
        mapToys.put(56, "Junior QA Analyst Doll");

        if (mapToys.get(ID) == null) {
            System.out.println("no such toy");
        } else {
            System.out.println(mapToys.get(ID));
        }
        return mapToys.get(ID);
    }

    public void removeDuplicates() {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Steve", "Tim", "Lucy", "Steve", "Pat", "Angela", "Tom", "Tim", "Anna", "Lucy"));

        System.out.println(namesList);
        namesList = new ArrayList<String>(new LinkedHashSet<String>(namesList));//1 OPTION
        System.out.println(namesList);//1 OPTION

//        Set<String> list=new HashSet<>(namesList); //2 OPTION
//        System.out.println(list);//2 OPTION

//        List<String>removeDuplicates=namesList.stream().distinct().collect(Collectors.toList());//3 OPTION
//        System.out.println(removeDuplicates);//3 OPTION

    }
}


