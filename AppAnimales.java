package AnimalesInterfaces;

import java.util.ArrayList;

public class AppAnimales {
    public static void main(String[] args) throws Exception {


        ArrayList<ISerVivo> seres = new ArrayList<>();
        seres.add(new Perro("verde"));
        seres.add(new Tortuga());
        seres.add(new Persona("Luis", 58));

        for (int i=0;i<seres.size();i++){
            seres.get(i).andar();
            seres.get(i).comer();
            seres.get(i).respirar();
            seres.get(i).comunicarse();
        }
    }
}