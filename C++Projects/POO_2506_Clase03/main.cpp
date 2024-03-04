#include <iostream>
using namespace std;

class Mamifero{
    // Encapsulamiento
private:
    // Aquí se listan tanto propiedades como métodos propios
    // de la clase
    string nombre;

public:
    // Constructor de la clase
    Mamifero(string nombre){
        this->nombre = nombre;
    }
    // Constructor de la clase: sobrecarga de métodos
    Mamifero(){
        this->nombre = "Por definir";
    }

    // Setter y Getter
    const string &getNombre() const {
        return nombre;
    }

    void setNombre(const string &nombre) {
        Mamifero::nombre = nombre;
    }
};

// Herencia: Persona hereda de Mamifero
class Persona: public Mamifero{
private:
    string fechaNacimiento, tipoId, sexoBiologico;
    int numId;
    string setMes(int numMes); // Señalo que creo el método y será privado
public:
    // Constructor
    Persona(const string &nombre, const string &tipoId, int numId) : Mamifero(nombre), tipoId(tipoId), numId(numId) {}
    // Constructor por sobrecarga de métodos
    Persona(const string &tipoId, const int &numId) : Mamifero(), tipoId(tipoId), numId(numId) {}

                                                                     // Setter y Getter
    const string &getFechaNacimiento() const {
        return fechaNacimiento;
    }

    void setFechaNacimiento(const string &day, const int &month, const string &year) {
        Persona::fechaNacimiento = day + " de " + setMes(month) + " de " + year;
    }

    const string &getTipoId() const {
        return tipoId;
    }

    void setTipoId(const string &tipoId) {
        Persona::tipoId = tipoId;
    }

    const string &getSexoBiologico() const {
        return sexoBiologico;
    }

    void setSexoBiologico(const char &sexo) {
        if (sexo == 'm' || sexo == 'M'){
            Persona::sexoBiologico = "Masculino";
        }
        else if (sexo == 'f' || sexo == 'F'){
            Persona::sexoBiologico = "Femenino";
        }
        else {
            Persona::sexoBiologico = "Sexo biológico definido incorrectamente.";
        }
    }

    int getNumId() const {
        return numId;
    }

    void setNumId(int numId) {
        Persona::numId = numId;
    }


};

// Crear el método setMes fuera de la clase Persona
string Persona::setMes(int numMes) {
    string mes;
    switch (numMes) {
        case 1:
            mes = "enero";
            break;
        case 2:
            mes = "febrero";
            break;
        case 3:
            mes = "marzo";
            break;
        case 4:
            mes = "abril";
            break;
        case 5:
            mes = "mayo";
            break;
        case 6:
            mes = "junio";
            break;
        case 7:
            mes = "julio";
            break;
        case 8:
            mes = "agosto";
            break;
        case 9:
            mes = "septiembre";
            break;
        case 10:
            mes = "octubre";
            break;
        case 11:
            mes = "noviembre";
            break;
        case 12:
            mes = "diciembre";
            break;
        default:
            mes = "mes sin definir.";
    }
    return mes;
}

// Ejecutar el programa principal
int main() {
    string  nombre = "Diego";
    char letra = 'a';

    cout << "¡Hola, " << nombre;
    cout << "!" << endl;

    // Crear la intancia de la clase Persona
    Persona juan("cc", 123456789);

    juan.setFechaNacimiento("4",3,"2024");
    juan.setSexoBiologico('m');

    cout << "Persona: " << juan.getNombre() << endl;
    cout << "Fecha de nacimiento: " << juan.getFechaNacimiento() << endl;
    cout << "Sexo: " << juan.getSexoBiologico() << endl;
    return 0;
}
