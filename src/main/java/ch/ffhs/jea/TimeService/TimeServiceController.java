package ch.ffhs.jea.TimeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TimeServiceController {
   @GetMapping("/date/current")
   public String getCurrentDate() {
      LocalDate current = LocalDate.now();
      return current.toString();
   }
}
