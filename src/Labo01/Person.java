package Labo01;

import java.time.LocalDate;

public class Person {
    private String firstName,lastName;
    private Date dateOfBirth;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int day, int month, int year){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth= new Date(day,month,year);
    }
    public String toString(){
        return "Firstname : "+this.firstName+"\nLastname : "+this.lastName+"\nDate of birth : "+this.dateOfBirth.toString()+" | "+this.dateOfBirth.day()+"/"+this.dateOfBirth.month()+"/"+dateOfBirth.getYear()+"\nAge  : "+getAge();
    }
    public int getAge(){
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();
        int dayP = dateOfBirth.getDay();
        int monthP = dateOfBirth.getMonth();
        int yearP = dateOfBirth.getYear();
        int age ;
        if(month>= dateOfBirth.getMonth()){
            if(day>= dateOfBirth.getDay()){
                age = year- dateOfBirth.getYear();
            }
            else{
                age = year- dateOfBirth.getYear()-1;

            }
        }
        else {
            age = year- dateOfBirth.getYear()-1;
        }
        return age;




    }
}
