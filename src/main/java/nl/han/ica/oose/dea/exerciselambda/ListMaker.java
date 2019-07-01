package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListMaker {

    private static final int ADULT_AGE = 18;
    private Predicate<Person> isAdult = (person) -> person.isAdult(ADULT_AGE);
    private Predicate<Person> isMale = (person) -> person.isOfGender(Gender.MALE);
    private Predicate<Person> isFemale = (person) -> person.isOfGender(Gender.FEMALE);

    /**
     * Create a {@link List} containing only the Persons that are both male and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both male and adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, isMale);
    }

    /**
     * Create a {@link List} containing only the Persons that are both female and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both female and adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, isFemale);
    }

    private List<Person> createAdultList(List<Person> allPersons, Predicate<Person> predicate) {

        if (allPersons == null) {
            return new ArrayList<>();
        }

        return allPersons.stream().filter(isAdult).filter(predicate).collect(Collectors.toList());
    }
}
