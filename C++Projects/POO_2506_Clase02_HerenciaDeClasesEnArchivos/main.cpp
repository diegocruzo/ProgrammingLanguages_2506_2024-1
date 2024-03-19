#include "Persona.h"

// Función principal
int main() {
    // Crear instancia de la clase Persona
    Persona ana("cc", 43210987);
    // Hacer uso de la instancia con propiedades y métodos
    ana.setNombre("Ana");
    ana.setSexoBiologico('f');
    ana.setFechaNacimiento(29,02,1920);
    ana.setExpresion("¡Hola!");
    cout << "Usuario: " << ana.getNombre() << endl;
    cout << "Tipo de documento: " << ana.getTipoId() << endl;
    cout << "Número de documento: " << ana.getNumId() << endl;
    cout << "Fecha de nacimiento: " << ana.getFechaNacimiento() << endl;
    cout << "Sexo biológico: " << ana.getSexoBiologico() << endl;
    cout << ana.getNombre() << " saluda: " << ana.getExpresion() << endl;

    return 0;
}
