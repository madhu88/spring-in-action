package com.taco.cloud;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.taco.cloud.controller.HomeController;

//@SpringBootTest
@WebMvcTest(HomeController.class)
class TacoCloudApplicationTests {
	
	@Autowired
	private MockMvc mockMVC;

	/*
	 * @Test void contextLoads() { }
	 */
	
	@Test
	public void testHomePage() {
		try {
			mockMVC.perform(get("/home"))
			.andExpect(status().isOk())
			.andExpect(view().name("home"))
			.andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
