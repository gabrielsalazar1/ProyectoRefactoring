package proyectorefactoring;
import java.util.Date;

public class Usuario {
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private long dni;
    private Date fechaNac;
    private String universidad;
    private String contraseña;
    private long telefono;
    private String direccion;
    private String distrito;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nombreUsuario, long dni, Date fechaNac, String universidad, String contraseña, long telefono, String direccion, String distrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.universidad = universidad;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
        this.distrito = distrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    
        
    
    
}
