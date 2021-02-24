package com.company;

public abstract class Company {
    private String companyName;
    private String dataOfCreatingTheFirm;
    private String bulsat;

    public String getCompanyName() {
        return companyName;
    }

    public String getDataOfCreatingTheFirm() {
        return dataOfCreatingTheFirm;
    }

    public String getBulsat() {
        return bulsat;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDataOfCreatingTheFirm(String dataOfCreatingTheFirm) {
        this.dataOfCreatingTheFirm = dataOfCreatingTheFirm;
    }

    public void setBulsat(String bulsat) throws InterruptedException {
        if(bulsat.length() < 10) {
            this.bulsat = bulsat;
        } else {
            throw new InterruptedException("Bulsat does not match the conditions");
        }
    }
    public abstract double todaysRevenue();
}


