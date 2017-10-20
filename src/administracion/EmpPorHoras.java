package administracion;

import java.util.Date;

/**
 * Created by NACHZEHER on 20/10/2017.
 */
public class EmpPorHoras extends Empleado{

    private static float valHora = 9.39f;
    private int horasPorMes;

    public EmpPorHoras(String nombre, int edad, String departamento, int horasPorMes) {
        super(nombre, edad, departamento);
        this.horasPorMes = horasPorMes;
    }

    public static float getValHora() {
        return valHora;
    }

    public int getHorasPorMes() {
        return horasPorMes;
    }

    @Override
    public float CalcSueldo() {
        float sueldo = valHora * horasPorMes;
        return sueldo;
    }

    @Override
    public String toString() {
        return "EmpPorHoras{" +
                "horasPorMes=" + horasPorMes +
                "} " + super.toString();
    }
}
