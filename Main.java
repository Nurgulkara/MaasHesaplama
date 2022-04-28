public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Emre", 6250, 45, 2016);
        e1.tax();
        e1.bonus();
        e1.maasartisi();
        e1.print();

        Employee e2 = new Employee("Kemal", 4250, 45, 1985);
        e2.tax();
        e2.bonus();
        e2.maasartisi();
        e2.print();
    }
}
