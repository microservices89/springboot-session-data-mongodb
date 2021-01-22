package org.springframework.session.mongodb.examples.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for sending the user to the login view.
 *
 *
 */
@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
