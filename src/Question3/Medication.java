package Question3;

import java.util.ArrayList;
import java.util.List;

public class Medication {
    private final String name;
    public Medication(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    class Painkiller extends Medication {
        public Painkiller(String name) {
            super(name);
        }
    }

    class Antibiotic extends Medication {
        public Antibiotic(String name) {
            super(name);
        }
    }

    public static void printMedicationNames(List<? extends Medication> meds){
        meds.forEach(x->System.out.println(x.getName()));
    }

    public static void addPainkillers(List<? super Medication> meds, Painkiller painkiller){
        meds.add(painkiller);
    }

}
