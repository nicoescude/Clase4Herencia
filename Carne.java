package AnimalesInterfaces;

public class Carne implements IConsumible{
    private String def = "Carne";

    @Override
    public String consumir() {
        return def;
    }
}
