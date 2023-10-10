package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Moto extends Veiculos{

    boolean bau, antena;
    Scanner scanner = new Scanner(System.in);

    public Moto(String marca){
        super(marca);
    }

    public void cadastrarMoto(){

        System.out.println("/---------- Cadastrar Moto ----------/");
        System.out.println("Informe a marca:                ");
        super.setMarca(scanner.nextLine());
        System.out.println("Informe o modelo:               ");
        super.setModelo(scanner.nextLine());
        System.out.println("Informe a placa:                ");
        super.setPlaca(scanner.nextLine());
        System.out.println("Informe o ano:                  ");
        super.setAno(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe se a moto tem baú: [true - false]   ");
        bau = scanner.nextBoolean();
        System.out.println("Informe se a moto tem antena: [true - false]    ");
        antena = scanner.nextBoolean();
        System.out.println("/------------------------------------------------/");

    }

}
