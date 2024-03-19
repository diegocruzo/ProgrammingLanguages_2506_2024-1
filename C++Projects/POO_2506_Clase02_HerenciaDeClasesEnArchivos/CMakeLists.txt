cmake_minimum_required(VERSION 3.26)
project(POO_2506_Clase02_HerenciaDeClasesEnArchivos)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(POO_2506_Clase02_HerenciaDeClasesEnArchivos
        Mamifero.cpp
        Mamifero.h
        Persona.cpp
        Persona.h
        main.cpp)
