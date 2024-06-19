public class Agenda {
  private Contactos[] contactos = new Contactos[10];

  public void añadirContacto(Contactos contacto) {
    for (int i = 0; i < contactos.length; i++) {
      if (contactos[i] == null) {
        contactos[i] = contacto;
        return;
      }
    }
    System.out.println("Agenda llena, no se pueden añadir más contactos.");
  }

  public boolean existeContacto(String nombre) {
    for (Contactos contacto : contactos) {
      if (contacto != null && contacto.getNombre().equalsIgnoreCase(nombre)) {
        return true;
      }
    }
    return false;
  }

  public void listarContactos() {
    for (Contactos contacto : contactos) {
      if (contacto != null) {
        System.out.println(contacto);
      }
    }
  }

  public Contactos buscarContacto(String nombre) {
    for (Contactos contacto : contactos) {
      if (contacto != null && contacto.getNombre().equalsIgnoreCase(nombre)) {
        return contacto;
      }
    }
    return null;
  }

  public void eliminarContacto(String nombre) {
    for (int i = 0; i < contactos.length; i++) {
      if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
        contactos[i] = null;
        return;
      }
    }
    System.out.println("Contacto no existe.");
  }

  public boolean agendaLlena() {
    for (Contactos contacto : contactos) {
      if (contacto == null) {
        return false;
      }
    }
    return true;
  }

  public int espaciosLibres() {
    int count = 0;
    for (Contactos contacto : contactos) {
      if (contacto == null) {
        count++;
      }
    }
    return count;
  }





} //Cierre clase agenda



