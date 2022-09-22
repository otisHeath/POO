package Labo01;

import java.time.LocalDate;

public class Person {
    public String firstName,lastName;
    public Date dateOfBirth;
    public Person(String firstName,String lastName,int day,int month,int year){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth= new Date(day,month,year);
    }
    public String toString(){
        return "Firstname : "+this.firstName+"\nLastname : "+this.lastName+"\nDate of birth : "+this.dateOfBirth.toString()+"\nAge  : "+getAge();
    }
    public int getAge(){
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();
        int dayP = this.dateOfBirth.day;
        int monthP = this.dateOfBirth.month;
        int yearP = this.dateOfBirth.year;
        int age = 0;
        if(month>=monthP){
            if(day>=dayP){
                age = year-yearP;
            }
            else{
                age = year-yearP-1;

            }
        }
        else {
            age = year-yearP-1;
        }
        return age;




    }
}
