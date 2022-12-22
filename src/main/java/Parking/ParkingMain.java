package Parking;

import java.util.stream.IntStream;

public class ParkingMain {
    public static void main(String[] args) {

        Car toyota=new Car("12345hjk", "black", "car");
        System.out.println(toyota);


        int [] floor1 = IntStream.range(1, 41).toArray();
        int [] floor2 = IntStream.range(41, 81).toArray();
        int [] floor3 = IntStream.range(81, 121).toArray();
        int [] floor4 = IntStream.range(121, 161).toArray();
        int [] floor5 = IntStream.range(161, 201).toArray();
        int count = 0;
        int id=0;
        for(id=0; id<floor1.length-1; id++){
            if(floor1[id]+1 == floor1[id+1] ){
            count++;
            }
            else{
               count=0;
            }
            if(count == 5){
                break;
            }
   }System.out.println("Bus can park here");
 }

}

