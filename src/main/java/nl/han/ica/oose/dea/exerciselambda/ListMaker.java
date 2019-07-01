package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    public static final int ADULT_AGE = 18;

    /**
     * Create a {@link List} containing only the Persons that are both male and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both male and adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {

        List<Person> filteredMaleAdults = new ArrayList<>();

        if (allPersons != null) {
            for (Person person : allPersons) {
                if (person.isOfGender(Gender.MALE) && person.isAdult(ADULT_AGE)) {
                    filteredMaleAdults.add(person);
                }
            }
        }

        return filteredMaleAdults;
    }

    /**
     * Create a {@link List} containing only the Persons that are both female and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both female and adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {

        List<Person> filteredFemmaleAdults = new ArrayList<>();

        if (allPersons != null) {
            for (Person person : allPersons) {
                if (person.isOfGender(Gender.FEMALE) && person.isAdult(ADULT_AGE)) {

                    filteredFemmaleAdults.add(person);
                }
            }
        }

        return filteredFemmaleAdults;
    }
}
