package search.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search/main")
public class MainController {

	@RequestMapping("/page")
	public String getMain() {
		return "search/main";
	}
}
