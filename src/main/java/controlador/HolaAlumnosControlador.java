package controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HolaAlumnosControlador {

	@GetMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "holaAlumnosFormulario";
	}

	@PostMapping("/procesarFormulario")
	public String procesarFormulario(Model modelo, String nombre, String email) {
		modelo.addAttribute("nombre", nombre);
		modelo.addAttribute("email", email);
		return "holaAlumnosSpring";
	}
}
