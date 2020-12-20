package com.dreamteam.loader;

import com.dreamteam.bean.Person;
import com.dreamteam.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BootstrapLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private PersonRepository personRepository;

    Person person;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        for(int i = 0; i < 20; i++){
            person = new Person();
            person.setName(String.format("Person %d", i));
            person.setEmail(String.format("Email %d", i));
            person.setSurname(String.format("Surname %d", i));
            person.setPassword(String.format("Password %d", i));
            person.setUserlevel(i < 5 ? Person.UserLevel.Admin : Person.UserLevel.User);
            personRepository.save(person);
        }

    }
}
