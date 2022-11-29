package Diseño;

public class Camino {
	private double _km;
	private String _estadoTerreno;
	private String _inicioCamino;
	private int _referencia;

	public Camino(double aKm, String aEstadoTerreno, String aInicioCamino) {
		throw new UnsupportedOperationException();
	}

	public static Camino getObjectByreferencia(int aRefencia) {
		throw new UnsupportedOperationException();
	}

	public String informacion(Camino aCamino) {
		throw new UnsupportedOperationException();
	}

	public double getKm() {
		return this._km;
	}

	public void setKm(double aKm) {
		this._km = aKm;
	}

	public String getEstadoTerreno() {
		return this._estadoTerreno;
	}

	public void setEstadoTerreno(String aEstadoTerreno) {
		this._estadoTerreno = aEstadoTerreno;
	}

	public String getInicioCamino() {
		return this._inicioCamino;
	}

	public void setInicioCamino(String aInicioCamino) {
		this._inicioCamino = aInicioCamino;
	}

	public int getReferencia() {
		return this._referencia;
	}

	public void setReferencia(int aReferencia) {
		this._referencia = aReferencia;
	}
}