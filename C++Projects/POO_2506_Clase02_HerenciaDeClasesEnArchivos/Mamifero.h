//
// Created by Diego Cruz on 19/03/2024.
//

#include <iostream>
using namespace std;

class Mamifero {
private: // Encapsulamiento
    string nombre, expresion;
public:
    Mamifero(); // Constructor
    string getNombre();
    void setNombre(string nombre);
    string getExpresion();
    void setExpresion(string expresion);
};
