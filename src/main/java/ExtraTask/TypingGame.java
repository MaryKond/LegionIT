package ExtraTask;

import lesson5.ArrayExamples;

import java.util.ArrayList;
import java.util.Arrays;


public class TypingGame {

    public static void main(String[] args) {
        String[] UserArray = {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] CorrectArray = {"cat", "blue", "sky", "umbrella", "paddy"};

       int[] result= new int[UserArray.length];
        for(int i=0; i<UserArray.length;i++){
            if (UserArray[i]==CorrectArray[i]){
                result[i]=1;
            }
            else{
                result[i]=-1;
            }
    }System.out.println(Arrays.toString(result));
}
}


