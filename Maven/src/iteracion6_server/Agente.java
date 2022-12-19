package Diseño;

/**
 * Clase agente que se contendrá los metodos para comunicarse con la base de datos
 */
public class Agente {

	private static Agente instancia;

	public static Agente getAgente() {
		// TODO - implement Agente.getAgente
		throw new UnsupportedOperationException();
	}

	/**
	 * devuelve true si se ha ejecutado sin errores.
	 * devuelve false si ha tenido errores.
	 * @param sql
	 */
	public boolean create(string sql) {
		// TODO - implement Agente.create
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public ArrayList<ArrayList<String>> read(string sql) {
		// TODO - implement Agente.read
		throw new UnsupportedOperationException();
	}

	/**
	 * devuelve true si se ha ejecutado sin errores.
	 * devuelve false si ha tenido errores.
	 * @param sql
	 */
	public boolean update(string sql) {
		// TODO - implement Agente.update
		throw new UnsupportedOperationException();
	}

	/**
	 * devuelve true si se ha ejecutado sin errores.
	 * devuelve false si ha tenido errores.
	 * @param sql
	 */
	public boolean delete(string sql) {
		// TODO - implement Agente.delete
		throw new UnsupportedOperationException();
	}

}