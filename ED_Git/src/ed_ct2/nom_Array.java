package ed_ct2;
public class nom_Array {
	String[] Nombre = {"Harry", "Emilia", "Yolanda", "Amanda"};
	String[] Apellidos = {"Price", "Clarke", "Collins", "Barber"};
	public void mostrarNombreC() {
		for (int i = 0; i<4; i++) {
			System.out.println("El nombre del usuario es: " + Nombre[i] + ".\n"
					+ "Y el apellido de dicho usuario es: " + Apellidos[i]);
		}
	}
}
