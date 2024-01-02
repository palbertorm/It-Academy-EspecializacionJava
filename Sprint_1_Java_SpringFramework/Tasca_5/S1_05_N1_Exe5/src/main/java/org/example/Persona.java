package org.example;

import java.io.*;

public class Persona implements Serializable {
    private String name;
    private int edad;
    private int numeroTelefono;

    public Persona (String name, int edad, int numeroTelefono) {
        this.name = name;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void serObjecto(Persona persona){
        try (ObjectOutputStream objetoSer = new ObjectOutputStream(new FileOutputStream("../persona.ser"))){
            objetoSer.writeObject(persona);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void deserObject(){
        ObjectInputStream objetoInpSer = null;
        try{
            objetoInpSer=new ObjectInputStream(new FileInputStream("../persona.ser"));
            Persona persona = (Persona) objetoInpSer.readObject();
            objetoInpSer.close();
            System.out.println(persona);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }
}
