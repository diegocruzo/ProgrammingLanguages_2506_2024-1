//
// Created by Diego Cruz on 19/03/2024.
//

#include "Mamifero.h"

// Constructor de la clase
Mamifero::Mamifero(){
    this->nombre = "Por definir";
}

// Setter y Getter
string Mamifero::getNombre(){
    return nombre;
}
void Mamifero::setNombre(string nombre){
    this->nombre = nombre;
}

void Mamifero::setExpresion(string expresion){
    this->expresion = expresion;
}

string Mamifero::getExpresion(){
    return expresion;
}
