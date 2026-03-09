package model;

public abstract class Funcionario{
    protected String name;
    protected double salary;
    protected Cargo cargo;

    static {
        System.out.println("====|Tech Dev|====\n");
    }

    public Funcionario(String name, double salary, Cargo cargo) {
        this.name = name;
        this.salary = salary;
        this.cargo = cargo;
    }

    public abstract double calculateBonus();

    public void printData(){
        System.out.println("Position: " + cargo);
        System.out.println("Name: " + name);
        System.out.printf("Salary: R$%.2f\n", salary);
        System.out.printf("Bonus: R$%.2f\n", calculateBonus());
        System.out.println("=========================");
    }
}
