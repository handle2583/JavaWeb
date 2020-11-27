package com.example.lessonweb;

import com.example.lessonweb.web.WebController;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class WebControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }


    @Test
    public void getUser() throws Exception {
        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/getUser"))
                .andReturn()
                .getResponse()
                .getContentAsString();
        System.out.println("result:" + responseString);

    }

    @Test
    public void getUsers() throws Exception {
        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/getUsers"))
                .andReturn()
                .getResponse()
                .getContentAsString();
        System.out.println("result:" + responseString);

    }

    @Test
    public void saveUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                .param("name", "")
                .param("age", "666")
                .param("pass", "test"))

        ;

    }


}
