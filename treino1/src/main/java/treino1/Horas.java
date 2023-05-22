/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino1;

import java.util.Scanner;

/**
 *
 * @author nanah
 */
public class Horas {

    private int hora, opc;

    Scanner entrada = new Scanner(System.in);

    public void SetHora() {
        System.out.println("Digite a hora atual");
        this.hora = entrada.nextInt();
    }

    public int GetHora() {
        return this.hora;

    }

    public void ExibirHora() {
        System.out.println("Horário " + hora);
    }

    public int GetOPC() {
        return this.opc;

    }
    
    public void SetOPC(){
        System.out.println("Digite a opção");
        
    }

    public void ExibirOPCInvalida() {
        System.out.println("Opção Inválida! ");

    }

    public void Sair() {
        System.out.println("Sistema Encerrado");
        System.exit(0);
    }
    
    public void ExibirMenu(){
        System.out.println("1  - Ver as Horas");
        System.out.println("0  - Sair");
    }
    
    

}
