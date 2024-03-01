package org.example;

public class Actor {
    //składniki klasy
    //POLA
    private String firstName;
    private String lastName;
    private int rating; //liczba od 1 -100
    private boolean isOscarPrized; //true/false

    //KONSTRUKTORY
    public Actor(String firstName, String lastName, int rating, boolean isOscarPrized) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.isOscarPrized = isOscarPrized;
    }

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(String firstName) {
        this.firstName = firstName;
    }

    //METODY
    public int calculateSalary(int count, int bonus) {
        return count * bonus;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public boolean isOscarPrized() {
        return isOscarPrized;
    }
    public void setOscarPrized(boolean oscarPrized) {
        isOscarPrized = oscarPrized;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rating=" + rating +
                ", isOscarPrized=" + isOscarPrized +
                '}';
    }




}