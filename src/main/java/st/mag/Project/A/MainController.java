package st.mag.Project.A;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

	@GetMapping("/")
    public String redirectToMainPage() {
        return "main";
    }
}
