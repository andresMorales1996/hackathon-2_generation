public class Contactos {
  private String nombre;
  private String telefono;

  public Contactos(String nombre, String telefono){
    this.nombre = nombre;
    this.telefono = telefono;
  }

  //Getters
  public String getNombre() {
    return nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  //setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  //Ayuda a que se imprima correctamente el contenido del objeto
  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Teléfono: " + telefono;
  }
}
