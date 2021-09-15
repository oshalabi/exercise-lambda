package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListMaker {

    private Predicate<Person> isAdult = (person -> person.getIsAdult(person));
    private Predicate<Person> isMale = (person -> person.isOfGender(Gender.MALE));
    private Predicate<Person> isFemale =(person -> person.isOfGender(Gender.FEMALE));

    /**
     * Create a {@link List} containing only the Persons that are both male and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both male and adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {

        return makeAdultList(allPersons, isMale);
    }

    /**
     * Create a {@link List} containing only the Persons that are both female and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both female and adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {

        return makeAdultList(allPersons, isFemale);
    }

    @NotNull
    private List<Person> makeAdultList(List<Person> allPersons, Predicate<Person> isBijGender) {
        if (allPersons == null) {

            return new ArrayList<>();
         }
        return allPersons.stream().filter(isAdult).filter(isBijGender).collect(Collectors.toList());
    }

}
