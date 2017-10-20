package administracion;

/**
 * Created by NACHZEHER on 21/10/2017.
 */
public class Main {
    public static void main(String[] args) {

        Empleado Juan = new EmpFijo("Juan", 30, "Contabilidad", 2013 );

        float sueldo = Juan.CalcSueldo();

        System.out.println(Juan.toString() + " Suldo: "+ sueldo + "$");


    }
}
