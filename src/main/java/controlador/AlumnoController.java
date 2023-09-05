package controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.Alumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@GetMapping("/formulario")
	public String formulario(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		return "formularioRegistroAlumno";
	}

	@PostMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute("alumno") Alumno alumno) {
		return "formularioAlumnoProcesado";
	}

}
