package be.cvo.person.service;

import be.cvo.person.domain.Person;
import be.cvo.person.domain.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PersonMapper personMapper;

    public PersonDTO getPersonById(Integer id) {
        Person person = personRepository.getOne(id);

        return personMapper.map(person);
    }

    public void addPerson(String name) {
        personRepository.save(Person.builder().name(name).build());
    }

}
