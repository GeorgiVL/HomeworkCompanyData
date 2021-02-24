package com.company;

public class CompanyET extends Company implements CompanyState {
    private String bossName;
    private double firstBudget;
    private double actualBudget;
    private double compCosts;


    public String getBossName() {
        return bossName;
    }

    public double getFirstBudget() {
        return firstBudget;
    }

    public double getActualBudget() {
        return actualBudget;
    }

    public double getCompCosts() {
        return compCosts;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public void setFirstBudget(double firstBudget) {
        this.firstBudget = firstBudget;
    }

    public void setActualBudget(double actualBudget) {
        this.actualBudget = actualBudget;
    }

    public void setCompCosts(double costs) {
        this.compCosts = costs;
    }


    @Override
    public void changeFirstBudged(double differentFirstBudged) {
        firstBudget += differentFirstBudged;
    }

    @Override
    public void increaseActualBudged(double increment) {
        actualBudget += increment;
    }

    @Override
    public void reduceCosts(double reducment) {
        compCosts -= reducment;
    }

    @Override
    public void companyInfo() {
        setCompanyName("TRUMP CASINO");
        setDataOfCreatingTheFirm("1996");
        try {
            setBulsat("TRU697985");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Company Name " + getCompanyName() + " date of creating the firm " + getDataOfCreatingTheFirm() + " firm bulsat " + getBulsat());
    }

    @Override
    public double todaysRevenue() {
        return actualBudget - firstBudget - compCosts;
    }

    public void printStatesAfterTwoYearsOfWork() {
        System.out.println("Change the first budged " + firstBudget + " Actual budged after the second year " + actualBudget + " Actual costs after the second year " + compCosts);
    }
}
