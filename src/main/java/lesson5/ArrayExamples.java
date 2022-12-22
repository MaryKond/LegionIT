package lesson5;

import java.util.*;

public class ArrayExamples {
    public void stringArray() {
        String[] buttons = {"OK", "Cancel", "Login", "Sign Up"};
        //buttons[2] = "Exit";
        int length = buttons.length;
//        System.out.println(buttons[2]);
//        System.out.println("length "+ length);

//        int i=0;
//        String arr="";
//        for (i=0; i<=buttons.length-1; i++){
//            System.out.println(buttons[i]);
//
//        }

        for (String button : buttons) {
            System.out.println(button);
        }
    }

    public void intArray() {
        int[] ids = {13, 6, 8, 13};
        System.out.println(ids[2]);
    }

    public void stringArrayWithSize() {
        String[] array = new String[5];
        array[0] = "Ok";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "Sign up";
        array[4] = "Exit";
        System.out.println("length " + array.length);
    }


    public void arrayListExample() {
        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("OK");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Sign Up");
        buttons.add("Exit");

        for (int i=0; i<buttons.size(); i++) {
//            System.out.println(buttons[i]);
            System.out.println(buttons.get(2));
        }

        /*for (String button : buttons) {
            System.out.println(button);
        }


        System.out.println("The size of the list " + buttons.size());
        buttons.add("sign in");
        for (String button : buttons) {
            System.out.println(button);
        }
        System.out.println();

        buttons.remove("Exit");
        for (String button : buttons) {
            System.out.println(button);
        }

        buttons.clear();
        System.out.println(buttons.size());


    }*/


    }
    public void arrayListSorting() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(34);
        arrayList.add(78);
        arrayList.add(456);
        arrayList.add(2);
        arrayList.add(876);
        Collections.sort(arrayList);
        for (Integer i: arrayList) {

            System.out.println(i);
        }
    }
    public  void hashMapExample(){
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("John", "Toronto");
        hashMap.put("Kate", "Orlando");
        hashMap.put("Peter", "Moskow");
        hashMap.put("Ola", "Dfre");
        System.out.println(hashMap);
        System.out.println(hashMap.get("Peter"));
       // hashMap.remove("John");
        System.out.println(hashMap.size());
    }
    public  void hashSetExample(){
        HashSet<String> hashSet = new HashSet<String>();
          hashSet.add("John");
          hashSet.add("Kate");
          hashSet.add("Peter");
          hashSet.add("Peter");
          hashSet.add("Peter");
          hashSet.add("Peter");
        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);


    }
}

