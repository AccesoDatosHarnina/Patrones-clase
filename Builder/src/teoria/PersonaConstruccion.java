package teoria;

public class PersonaConstruccion {
	private int id;
	private String nombre;
	private String appellidos;
	// optionals
	private String phone;
	private String color;

	private PersonaConstruccion(Builder builder) {
		this.id=builder.id;
		this.nombre=builder.nombre;
		this.appellidos=builder.appellidos;
		this.phone=builder.phone;
		this.color=builder.color;
	}

	public static class Builder{
		private int id;
		private String nombre;
		private String appellidos;
		// optionals
		private String phone="";
		private String color="";
		
		public Builder(int id, String nombre, String appellidos) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.appellidos = appellidos;
		}

		public Builder phone(String phone) {
			this.phone=phone;
			return this;
		}
		
		public Builder color(String color) {
			this.color=color;
			return this;
		}
		
		public PersonaConstruccion build() {
			return new PersonaConstruccion(this);
		}
	}
	
	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getAppellidos() {
		return appellidos;
	}

	private void setAppellidos(String appellidos) {
		this.appellidos = appellidos;
	}

	private String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}
}
