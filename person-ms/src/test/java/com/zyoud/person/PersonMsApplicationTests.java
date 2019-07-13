package com.zyoud.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PersonMsApplication.class)
@TestPropertySource(value = "classpath:application.properties")
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class PersonMsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
