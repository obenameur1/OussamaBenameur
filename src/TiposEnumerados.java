
public class TiposEnumerados {
	public enum Dias {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}; 

	public static void main (String[] args) {  

    Dias diaactual = Dias.Martes;
    Dias diasiguiente = Dias.Miercoles;
    Dias diaanterior = Dias.Lunes;
    System.out.print("Hoy es: ");
    System.out.println(diaactual);
    System.out.println("Mañana es "+diasiguiente);
    System.out.println("Ayer era " +diaanterior);
	}
}