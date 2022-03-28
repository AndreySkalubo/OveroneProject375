package overone.randomize;

import overone.randomize.controller.StartController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private StartController startController;

    @Test
    public void test() throws Exception{
        assertThat(startController).isNotNull();
    }

    @Test
    public void testString() throws Exception{
            this.mockMvc.perform(post("/presentStudents"))
                    .andDo(print())
                    .andExpect(status().is3xxRedirection())
                    .andExpect(redirectedUrl("http://localhost:8090/start"));

    }
}
