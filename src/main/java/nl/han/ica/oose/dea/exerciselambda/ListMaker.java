package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    final int ADULT = 18;

    /**
     * Create a {@link List} containing only the Persons that are both male and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both male and adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons, Gender gender) {

        if(personsNotNull(allPersons)) {

            List<Person> filteredFemaleAdults = new ArrayList<>();

            checkGenderAndAdult(allPersons,
                    gender,
                    filteredFemaleAdults);

            return filteredFemaleAdults;
        }
        return new ArrayList<>();
    }

    /**
     * Create a {@link List} containing only the Persons that are both female and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both female and adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons, Gender gender) {

        if (personsNotNull(allPersons)) {

            List<Person> filteredFemaleAdults = new ArrayList<>();

            checkGenderAndAdult(allPersons,
                    gender,
                    filteredFemaleAdults);

            return filteredFemaleAdults;
        }
        return new ArrayList<>();
    }

    private void checkGenderAndAdult(List<Person> allPersons, Gender gender, List<Person> filteredGenderAdults ) {
        for (Person person : allPersons) {
            if (person.getGender().equals(gender)) {
                LocalDate now = LocalDate.now();
                Period age = Period.between(person.getBirthDate(), now);

                if (age.getYears() >= ADULT) {
                    filteredGenderAdults.add(person);
                }
            }
        }
    }
    private boolean personsNotNull(List<Person> allPersons){
        if (allPersons == null) {
            return false;
        }
        return true;
    }
}
