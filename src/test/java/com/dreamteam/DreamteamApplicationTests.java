package com.dreamteam;

import com.dreamteam.controller.HomeController;
import com.dreamteam.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DreamteamApplicationTests {

    @Autowired
    private HomeController homeController;

    @Autowired
    private PersonRepository personRepository;

	@Test
	void contextLoads() {
	}

	@Test
    public void homeController(){
	    assert homeController != null;
    }

    @Test
    public void personRepository(){
	    assert personRepository != null;
    }

}
