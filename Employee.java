public class Employee {
    /*name : Çalışanın adı ve soyadı
    salary : Çalışanın maaşı
    workHours : Haftalık çalışma saati
    hireYear : İşe başlangıç yılı*/
    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    double ikramiye;
    double zam;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    void tax(){
        System.out.println("=============================================");
        if (this.salary > 0 && this.salary < 3000) {
            this.vergi = this.salary * 0;
        } else {
            this.vergi = this.salary * 0.03;
        }

    }


    void bonus() {
        if (this.workHours > 40) {
            this.ikramiye = 30 * (this.workHours - 40);
        }
    }

    void maasartisi() {
        if (2021 - this.hireYear < 10) {
            this.zam = this.salary * 0.05;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            this.zam = this.salary * 0.10;
        } else {
            this.zam = this.salary * 0.15;
        }
    }

    void print(){
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + this.vergi);
        System.out.println("Bonus : " + this.ikramiye);
        System.out.println("Maas Artisi : " + this.zam);
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (this.salary + this.ikramiye - this.vergi));
        System.out.println("Toplam maas : " + ((this.salary + this.ikramiye - this.vergi) + this.zam));
    }

}
