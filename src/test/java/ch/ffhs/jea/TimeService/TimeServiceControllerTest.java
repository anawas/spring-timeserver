/**
 * see https://spring.io/guides/gs/spring-boot
 */
package ch.ffhs.jea.TimeService;

import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest@AutoConfigureMockMvc
public class TimeServiceControllerTest {

   @Autowired
   private MockMvc mvc;

   @Test
   public void getCurrentTime() throws Exception {
      String date = LocalDate.now().toString();
      mvc.perform(MockMvcRequestBuilders
          .get("/date/current")
          .accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().string(equalTo(date)));
   }
}
