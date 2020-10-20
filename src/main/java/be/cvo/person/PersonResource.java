package be.cvo.person;

import be.cvo.person.service.PersonDTO;
import be.cvo.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonResource {
    @Autowired
    private PersonService personService;

    @GetMapping("/person/{id}")
    public PersonDTO getPerson(@PathVariable Integer id) {
        return personService.getPersonById(id);
    }

    @PostMapping(path = "/add-person", consumes = "application/json")
    public void addRandomTask(@RequestBody PersonRequest personRequest) {
        personService.addPerson(personRequest.getName());
    }
}
