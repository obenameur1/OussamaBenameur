
public class TiposEnumerados {
	public enum Dias {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}; 

	public static void main (String[] args) {  

    Dias diaactual = Dias.Martes;
    Dias diasiguiente = Dias.Miercoles;
    Dias diadedespues = Dias.Jueves;
    System.out.println("Hoy es " + diaactual);
    System.out.println("Mañana es "+diasiguiente);
    System.out.println("Pasado mañana será " +diadedespues);
	}
}