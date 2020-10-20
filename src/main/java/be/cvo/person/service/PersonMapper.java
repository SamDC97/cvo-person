package be.cvo.person.service;

import be.cvo.person.domain.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public PersonDTO map(Person person) {
        return new PersonDTO(person.getId(), person.getName());
    }
}
