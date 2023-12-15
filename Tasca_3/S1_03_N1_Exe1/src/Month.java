import java.util.Objects;

public class Month  implements java.lang.Comparable<Month> {
    private String name;


    public Month(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int compareTo(Month month) {
        return this.getName().compareTo(month.getName());
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Month month = (Month) obj;
//        return Objects.equals(name, month.name);
//    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
