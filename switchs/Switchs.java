package com.masterclass.switchs;

public class Switchs {
    public static void main(String[] args) {
        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        }else if (value == 2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 5;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
                // shortcut case
            case 3: case 4: case 5: // group module case test
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        String mouth = "JANUARY";
        switch (mouth.toLowerCase()){
            // .toLowerCase() this is a method = change string from upper or upper first to lower
            case "january":
                System.out.println("JAN");
                break;
            default:
                System.out.println("Not sure!");
                break;
        }

    }
}
