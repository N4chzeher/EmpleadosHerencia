package administracion;
import java.util.Calendar;

/**
 * Created by NACHZEHER on 20/10/2017.
 */
public class EmpFijo extends Empleado {

    private int anioIni;

    public EmpFijo(String nombre, int edad, String departamento, int anioIni) {
        super(nombre, edad, departamento);
        this.anioIni = anioIni;
    }

    public int getAnioIni() {
        return anioIni;
    }

    public int calcAntig(){
        int actualYear = Calendar.getInstance().get(Calendar.YEAR);
        int iniYear =anioIni;
        int antig = actualYear -iniYear;
        return antig ;
    }

    @Override
    public float CalcSueldo() {
        float sueldo = 1091.13f + (anioIni * 192.85f);
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado Fijo" +
                "\nAño de contratacion: " + anioIni +
                "\n " + super.toString();
    }
}
