package comunicacion;

public class Alfabeto extends Pictograma {
	
	private String letras [];
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	@Override
	public String toString() {
		String r = "";
		for (int i = 0; i < letras.length; i++) {
			r += letras[i];
			if (i < (letras.length-1)) {
				r+= ", ";
			}
		}
		return r;
	}
}