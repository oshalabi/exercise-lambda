package nl.han.ica.oose.dea.exerciselambda.person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    final static int ADULT = 18;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isOfGender(Gender gender) {
        return gender.equals(getGender());
    }

    private boolean isAdult (Person person) {
        LocalDate now = LocalDate.now();
        Period age = Period.between(person.getBirthDate(), now);
        return age.getYears() >= ADULT;
    }
    public boolean getIsAdult(Person person){
        return isAdult(person);
    }
}
