package com.suresh.inheritance;

public class Program {
    public static void main(String[] args) {
        SeniorDeveloper anish = new SeniorDeveloper("iOS", "anish", 9, 600000, 6);
          anish.display();
          System.out.println();

        JuniorDeveloper aasis = new JuniorDeveloper("android", "aasis", "binay", 8, 90000, "bijay", "2029/9/6", "amir");
        aasis.display();
        System.out.println();
        Developer d = new Developer("hello", "bye", 23);
      //  d.getDevelopername();
        d.display();
    }
    
}
