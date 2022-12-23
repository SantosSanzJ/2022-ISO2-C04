package Diseño;

public class Local {

	private int ID;
	private int numHabitaciones;
	private int numHabitacionesOcupadas;
	private double costeNoche;
	private double[] Coordenadas;

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getNumHabitaciones() {
		return this.numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumHabitacionesOcupadas() {
		return this.numHabitacionesOcupadas;
	}

	public void setNumHabitacionesOcupadas(int numHabitacionesOcupadas) {
		this.numHabitacionesOcupadas = numHabitacionesOcupadas;
	}

	public double getCosteNoche() {
		return this.costeNoche;
	}

	public void setCosteNoche(double costeNoche) {
		this.costeNoche = costeNoche;
	}

	public double[] getCoordenadas() {
		return this.Coordenadas;
	}

	public void setCoordenadas(double[] Coordenadas) {
		this.Coordenadas = Coordenadas;
	}

	/**
	 * 
	 * @param ID
	 */
	public static Local getObjectByID(int ID) {
		// TODO - implement Local.getObjectByID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 * @param numHabitaciones
	 * @param numHabitacionesOcupadas
	 * @param costeNoche
	 * @param coordenadas
	 */
	public Local(int ID, int numHabitaciones, int numHabitacionesOcupadas, double costeNoche, double[] coordenadas) {
		// TODO - implement Local.Local
		throw new UnsupportedOperationException();
	}

}