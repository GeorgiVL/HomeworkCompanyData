package com.company;

public class Main {
    public static void main(String[] args) {

        CompanyET comET = new CompanyET();


        comET.companyInfo();
        comET.setBossName("Donald Trump");
        String theBoss = comET.getBossName();
        comET.setFirstBudget(500000);
        comET.setActualBudget(1255500);
        comET.setCompCosts(200000);


        System.out.println(theBoss);
        System.out.println(comET.getFirstBudget());
        System.out.println(comET.getActualBudget());
        System.out.println(comET.getCompCosts());
        System.out.println("Revenue after the first year " + comET.todaysRevenue() + "$");

        comET.changeFirstBudged(0);
        comET.increaseActualBudged(850000);
        comET.reduceCosts(50000);
        comET.printStatesAfterTwoYearsOfWork();

        System.out.println("Revenue after the second year " + comET.todaysRevenue() + "$");


    }


}
