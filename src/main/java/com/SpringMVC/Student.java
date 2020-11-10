package com.SpringMVC;


import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String location;
    private LinkedHashMap<String,String> countryOptions;
    private LinkedHashMap<String,String> jobLocation;
    private String[] operatingSystem;
    public Student() {
        countryOptions = new LinkedHashMap<>();
        jobLocation = new LinkedHashMap<>();
        countryOptions.put("IND","India");
        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","France");
        countryOptions.put("GER","Germany");
        jobLocation.put("Seattle","seattle");
        jobLocation.put("Blr", "Banglore");
        jobLocation.put("hyd","Hyderabad");
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getLocation() {
        return location;
    }

    public LinkedHashMap<String,String> getJobLocation() {
        return jobLocation;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }
}
