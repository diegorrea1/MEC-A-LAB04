import java.util.Scanner;


public class AsignacionTurnos
{
    public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);

      System.out.print
      ("Ingrese el numero de personas a las que se asignan turnos: ");

    int numPersonas = sc.nextInt ();

    int numTurno = 1;

    for (int i = 0; i < numPersonas; i++)
      {

	System.out.println ("Persona " + (i + 1) + " asignada al turno "+numTurno);
	numTurno++;

      }
  }
}
