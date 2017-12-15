package io.dmfrey.pcfeurekatest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith( SpringRunner.class )
@WebMvcTest( EndpointController.class )
public class EndpointControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGet() throws Exception {

        this.mockMvc.perform(
                get( "/" )
                        .contentType( MediaType.APPLICATION_JSON )
                )
                .andExpect( status().isOk() )
                .andDo( print() );

    }

}
