package AnimalesInterfaces;

public class Vegetal implements IConsumible{
    private String def = "Vegetal";

    @Override
    public String consumir() {
        return def;
    }
}
