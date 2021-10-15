package AnimalesInterfaces;

public abstract class Animal implements IConsumible, ISerVivo{
    private int     patas;
    private String  color;
    private String  nombre;
    private IConsumible comida;

    public Animal(int patas, String color,String nombre,IConsumible comida){
        this.patas = patas;
        this.color = color;
        this.nombre = nombre;
        this.comida = comida;
    }

    public void respirar(){
        System.out.println("Hola soy "+nombre+" y estoy respirando");
    };

    public void andar(){
        System.out.println("Hola soy "+nombre+" y estoy andando");
    };

    public IConsumible getComida() {
        return comida;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPatas() {
        return patas;
    }

}
