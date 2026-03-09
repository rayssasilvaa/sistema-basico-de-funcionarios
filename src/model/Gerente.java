package model;

public class Gerente extends Funcionario{
    public Gerente(String name, double salary, Cargo cargo) {
        super(name, salary, cargo);
    }

    @Override
    public double calculateBonus(){
        if (salary < 3000){
            return salary * 0.10;
        } return 0;
    }
}
