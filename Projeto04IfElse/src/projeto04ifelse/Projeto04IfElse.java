/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto04ifelse;

/**
 *
 * @author aluno
 */
public class Projeto04IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        if(condicao booleana){
            //codigo
        }else{
            //codigo
        }
        
         */
        int idade = 30;

        if (idade < 18) {
            System.out.println("Menor idade!");
        } else {
            System.out.println("Maior Idade!");
        }

        //Operadores Logicos:
        //E && (conjuncao)
        //ou || (disjuncao)
        boolean amigoDoDono = true;

        if (idade < 18 && amigoDoDono == false) {
            System.out.println("Menor Idade. Entrada Proibida.");
        } else {
            System.out.println("Pode entrar.");
        }

        //operadores de Negacao (!)
        if (idade < 18 && !amigoDoDono) {
            System.out.println("Menor Idade. Entrada Proibida.");
        } else {
            System.out.println("Pode entrar.");
        }

        // operador de igualdade (==)
        int mes = 1;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            System.out.println("Tempo de trabalhar");
        }

    }
}
