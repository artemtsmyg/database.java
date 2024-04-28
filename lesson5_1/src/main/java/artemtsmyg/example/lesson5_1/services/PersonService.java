package artemtsmyg.example.lesson5_1.services;

import artemtsmyg.example.lesson5_1.aspects.TrackUserAction;
import artemtsmyg.example.lesson5_1.model.Person;
import artemtsmyg.example.lesson5_1.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    @TrackUserAction
    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }
    @TrackUserAction
    public Person getOne(int id) { return personRepository.getOne(id); }
    @TrackUserAction
    public void addPerson(Person person) {
        personRepository.save(person);
    }
    @TrackUserAction
    public void deletePersonById(int id) { personRepository.deleteById(id); }
    @TrackUserAction
    public Person updatePerson(Person person) { return personRepository.update(person); }
}