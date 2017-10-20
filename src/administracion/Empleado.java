package administracion;

/**
 * Created by NACHZEHER on 18/10/2017.
 */
public abstract class Empleado {

    protected String nombre;
    protected int edad;
    protected String departamento;

    public Empleado (String nombre, int edad, String departamento){
        this.nombre=nombre;
        this.edad=edad;
        this.departamento=departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public abstract float CalcSueldo();

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDepartamento: " + departamento;
    }
}
