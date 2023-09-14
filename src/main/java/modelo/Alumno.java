package modelo;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Alumno {

	@NotNull
	@NotBlank(message = "El nombre no puede estar vacío ni contener sólo espacios en blanco")
	@Size(min = 2, message = "El nombre debe tener mínimo 2 caracteres")
	private String nombre;

	@NotNull
	@NotBlank(message = "El apellido no puede estar vacío ni contener sólo espacios en blanco")
	@Size(min = 3, message = "El apellido debe tener mínimo 3 caracteres")
	private String apellido;

	@Min(value = 18, message = "La edad mínima es de 18 años")
	@Max(value = 100, message = "La edad máxima es de 100 años")
	private int edad;

	@NotNull
	@NotBlank(message = "El email no puede estar vacío ni contener sólo espacios en blanco")
	@Email(message = "El correo electrónico no es válido")
	private String email;

	private String materia;
	private String ciudad;

	@Pattern(regexp = "[0-9]{4}", message = "Debe ser de 4 valores numéricos")
	private String codigoPostal;
	private String idioma;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
