package Main;
import java.util.Scanner;

import br.unicap.ed1.TiposdeDados.*;
public class testelista {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LSE <Integer> lista  = new LSE ();
		LSESemRepetidos <Integer> lista2  = new LSESemRepetidos ();
		int op, num,v1,v2;
        do {
            menuOpcoes ();
            System.out.println("Informe a opção: ");
            op = input.nextInt();
            switch (op) {
                case 1: System.out.println("Informe o valor: ");
                        num = input.nextInt();
                        lista.inserirNo(num);
                        break;
                case 2: System.out.println("Informe o valor: ");
                        num = input.nextInt();
                        lista.inserirNoFinal(num);
                        break;
                case 3: lista.removerNoInicio();
                        break;
                case 4: lista.removerNoFinal();
                        break;
                case 5: System.out.println("Informe o valor antigo: ");
                        v1 = input.nextInt();
                        System.out.println("Informe o valor novo: ");
                        v2 = input.nextInt();     
                	    lista.alterarNo(v2,v1);
                	    break;
                case 6: lista.exibirTodos();
                        break;
                case 7: System.out.println("Informe o valor: ");
                        num = input.nextInt();
                        lista.inserirCrescenteComRepetidos(num);
                        break;
                case 0: System.out.println("Fim do programa!");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while (op != 0);   
    } 
    
    public static void menuOpcoes () {
        System.out.println("1 - Inserir valor no início da lista");
        System.out.println("2 - Inserir valor no final da lista");
        System.out.println("3 - Remover valor no início da lista");
        System.out.println("4 - Remover valor no final da lista");
        System.out.println("5 - Alterar valor na lista");
        System.out.println("6 - Exibir todos os valores da lista");
        System.out.println("7 - Inserir Crescente com Repetidos");
        System.out.println("0 - Sair do programa");
    }
}