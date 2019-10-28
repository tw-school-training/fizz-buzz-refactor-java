package com.thoughtworks.refactor;


public class FizzBuzz {


    public String sayIt(int input) {

        String result = "";
        String inputString = String.valueOf(input);
        if (inputString.contains("3")) {
            return "Fizz";
        }
        int flag = 0;
        flag += input % 3 == 0 ? 0b100 : 0;
        flag += input % 5 == 0 ? 0b010 : 0;
        flag += input % 7 == 0 ? 0b001 : 0;

        String[] flags = getBinaryString(flag).split("");
        String[] items = {"Fizz", "Buzz", "Whizz"};

        for (int i = 0; i < flags.length; i++) {
            if(flags[i].equals("1")){
                result += items[i];
            }
        }
        if (!"".equals(result)) {
            return result;
        }
        return String.valueOf(input);
    }

    private String getBinaryString(int flag) {
        String flagString = Integer.toBinaryString(flag);
        while (flagString.length() < 3) {
            flagString = "0"+flagString;
        }
        return flagString;
    }


    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 200; i++) {
            System.out.println(fizzBuzz.sayIt(i+1));
        }

    }
}
