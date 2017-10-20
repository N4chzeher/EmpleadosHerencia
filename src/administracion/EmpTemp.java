package administracion;
import java.util.Date;

/**
 * Created by NACHZEHER on 18/10/2017.
 */
public class EmpTemp extends Empleado {

    private Date dateIni;
    private Date dateFin;

    public EmpTemp (String nombre, int edad, String departamento, Date dateIni, Date dateFin){
        super(nombre,edad,departamento);
        this.dateIni=dateIni;
        this.dateFin=dateFin;
    }

    public Date getDateIni() {
        return dateIni;
    }

    public Date getDateFin() {
        return dateFin;
    }

    @Override
    public float CalcSueldo() {
        float sueldo = 1349.27f;
        return sueldo;
    }

    @Override
    public String toString() {
        return "EmpTemp{" +
                "dateIni=" + dateIni +
                ", dateFin=" + dateFin +
                "} " + super.toString();
    }
}
