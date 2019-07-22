package com.tavisca.workshops.pratham;

public class HelloWorld {


   private static String getAgeWiseTitle(int age) {
        return(age < 18)? "Master" : "MR.";
    }

    static String getTitle(String gender, int age){
        if(gender.startsWith("M")){
            return getAgeWiseTitle(age);
        }else if(gender.startsWith("F")) {
            return "Miss";
        }
        return "";
    }

    private static String getCountryWiseGreetings(String country) {
        if(country.equals("India")){
            return "Namaste";
        }else if(country.equals("Spain")){
            return "Hola";
        }
        return "Hello";
    }


    static String WelcomeMessage(String name, String gender, int age, String country){
        return getCountryWiseGreetings(country) + " " + getTitle(gender, age) + " " + name;
    }



    public static void main(String[] args) {

        System.out.println(WelcomeMessage("Vishal Sharma", "M", 18, "India"));
    }
}
