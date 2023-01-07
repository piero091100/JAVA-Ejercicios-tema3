import javax.print.attribute.standard.JobSheets;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Piero", "José", "Andres", "Pilar", "Sebastián"};

        for (int i = 0; i < nombres.length; i++){
            System.out.printf("%s ", nombres[i]);
        }
    }
}