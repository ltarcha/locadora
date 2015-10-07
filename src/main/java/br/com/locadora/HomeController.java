package br.com.locadora;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "cadastro-veiculo";
	}
	
	@RequestMapping(value = "/cadastro-cliente", method = RequestMethod.GET)
	public String cadastrotemp(Locale locale, Model model) {
		
		return "cadastro-cliente";
	}
	
}
