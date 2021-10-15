package AnimalesInterfaces;

public class Tortuga extends Animal{

    public Tortuga() {
        super(4, "Verde", "Tortuga", new Vegetal());
    }

    @Override
    public String consumir() {
        return "Una tortuguita no es comida";
    }

    @Override
    public void comer() {
        System.out.println("La tortugita come lentamente "+getComida().consumir());     
    }

    @Override
    public void comunicarse() {
        System.out.println("Grrrrrrr");
    }    
}
