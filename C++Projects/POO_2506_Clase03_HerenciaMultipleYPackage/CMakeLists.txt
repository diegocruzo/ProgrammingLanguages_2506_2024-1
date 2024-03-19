cmake_minimum_required(VERSION 3.26)
project(POO_2506_Clase03_HerenciaMultipleYPackage)

set(CMAKE_CXX_STANDARD 20)

add_executable(POO_2506_Clase03_HerenciaMultipleYPackage main.cpp
        Animals/Gato.h
        Animals/Perro.h
        ParentClasses/Mamifero.h
        ParentClasses/Animal.h
        ParentClasses/Animal.cpp
        ParentClasses/Mamifero.cpp
        Animals/Perro.cpp
        Animals/Gato.cpp)
