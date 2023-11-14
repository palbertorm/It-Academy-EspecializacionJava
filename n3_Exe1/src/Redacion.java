import java.util.ArrayList;

public class Redacion {
    ArrayList<Redactor> redactores;

    public Redacion(ArrayList<Redactor> redactores) {
        this.redactores = redactores;
    }

    public ArrayList<Redactor> getRedactores() {
        return redactores;
    }

    public void setRedactores(ArrayList<Redactor> redactores) {
        this.redactores = redactores;
    }
}
