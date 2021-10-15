package AnimalesInterfaces;

import java.util.ArrayList;

public class Persona implements ISerVivo{

    private String nombre;
    private int edad;
    private ArrayList<IConsumible> comidas = new ArrayList<>();

    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;

        this.comidas.add(new Carne());
        this.comidas.add(new Vegetal());
        this.comidas.add(new Tortuga());
        this.comidas.add(new Perro("Azul"));
    }

    @Override
    public void comer() {
        System.out.print("Hola me llamo "+getNombre()+
        " y me gusta comer ");
        for (int i=0;i<comidas.size();i++){
            System.out.print(comidas.get(i).consumir() + " y ");
        }
        System.out.println();
    }

    @Override
    public void comunicarse() {
        System.out.println("Hola buenos dias");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando uuh");
    }

    @Override
    public void andar() {
        System.out.println("Andando aah");
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public IConsumible[] getComidas(){
        return (IConsumible[])comidas.toArray();
    }
}
