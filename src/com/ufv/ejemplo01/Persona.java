package com.ufv.ejemplo01;

public class Persona {
        //Atributos
        private String nombre;
        private String apellidos;
        private int edad;
        private int dni;
        //Metodos
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public void setEdad(int _edad){
            if (_edad <= 18){
                System.out.println("Tas to joven bro");
            }else{
                System.out.println("Tas viejo bro");
            }
            this.edad = _edad;

        }
        public void setApellidos(String apellidos){
            this.apellidos=apellidos;
        }
        public void setDni(int dni){
            this.dni=dni;
        }

        public String getNombre(){
            return nombre;
        }
        public int getEdad(){
            return edad;
        }
        public String getApellidos(){
            return apellidos;
        }
        public int getDni(){
            return dni;
        }

        public void calcularDNI(){
            //Codigo para calcular DNI
        }
        public void verificarSexo(){
            //Codigo para verificar el sexo
        }

    }
