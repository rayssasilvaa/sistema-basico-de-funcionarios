package main;

import model.*;

public class ImpresaTest {
    public static void main(String[] args){
        Funcionario[] funcionarios = {
                new Gerente("Júnior", 7380, Cargo.MANAGER),
                new Dev("Mark", 2399, Cargo.DEV_JUNIOR),
                new Dev("Paula", 5800, Cargo.DEV_PLENO)
        };

        for (Funcionario f : funcionarios){
            f.printData();
        }
    }
}
