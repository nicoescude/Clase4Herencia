package AnimalesInterfaces;

public class Perro extends Animal{

    public Perro(String color){
        super(4, color, "Perro",new Carne());
    }

    @Override
    public String consumir() {
        return "No comas al perrito";
    }

    @Override
    public void comer() {
        System.out.println("Hola soy un perro y estoy comiendo "+getComida().consumir());        
    }

    @Override
    public void comunicarse() {
        System.out.println("Guaaaau");
    }    
}
