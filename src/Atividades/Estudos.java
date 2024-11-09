package Atividades;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Estudos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String filePath = "atividades/estudos/anotacoes.txt";

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Fazer uma anotação");
        System.out.println("2 - Ver anotações já feitas");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1){
            System.out.println("Faça suas anotações: ");
            String anotacao = scanner.nextLine();

            try (FileWriter writer = new FileWriter(filePath, true)){
                writer.write(anotacao + "n");
                System.out.println("Anotação salva!");
            } catch (IOException e) {
                System.out.println("Erro ao salvar a anotação: " + e.getMessage());
            }
        } else if (opcao == 2) {
            System.out.println("Anotações salvas: ");

        }
    }
}

