package br.edu.univas;

import java.util.Scanner;

public class App {
    public static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        int op = 0;
        boolean arvoreCadastrada = false;
        do {

            System.out.println("Cadastro de ?rvores");
            System.out.println("1 - Cadastrar Produto (Raiz)");
            System.out.println("2 - Cadastrar Componentes (Sub-pe?as)");
            System.out.println("3 - Buscar um componente");
            System.out.println("4 - Exibir o valor total do produto");
            System.out.println("5 - Lista todos N?s cadastrados");
            System.out.println("6 - Lista de todos componentes/folhas");
            System.out.println("9 - Sair");
            op = l.nextInt();
            l.nextLine();
            if (op == 1) {
                if (arvoreCadastrada == false) {
                    System.out.println("Digite o nome do Produto (RAIZ): ");
                    arvore = new Arvore(l.nextLine());
                    System.out.println("Digite quantas sub-pe?as deseja cadastrar!");
                    int qt = l.nextInt();
                    l.nextLine();
                    cadastro(arvore, qt);
                } else {
                    continue;
                }
                arvoreCadastrada = true;
            } else if (op == 2) {
                cadastro(arvore);
            } else if (op == 3) {
                System.out.println("Digite o nome do n? que ser? buscado: ");
                No buscado = arvore.getRaiz().buscar(l.nextLine());
                if (buscado != null) {
                    System.out.println("N? que foi buscado: " + buscado.getNome() + "   - Valor: " + buscado.getValor()
                            + "  - Quantidade: " + buscado.getQuantidade());
                } else {
                    System.out.println("N?o Encontrado");
                }
            } else if (op == 4) {
                arvore.getRaiz().valorArvore();
                System.out.println("\n      VALOR TOTAL DO PRODUTO: " + No.soma);
            } else if (op == 5) {
                listarTodos(arvore);
            } else if (op == 6) {
                listarFolhas(arvore);
            } else if (op == 9) {
                System.out.println("Fim");
                break;
            } else {
                System.out.println("Op??o Inv?lida!");
            }
        } while (op != 9);
        l.close();
    }

    public static void cadastro(Arvore arvore) {
        System.out.println("Digite o nome do Pai do componente que ser? cadastrado: ");
        No no = arvore.getRaiz().buscar(l.nextLine());
        if (no != null) {
            System.out.println("Digite o nome desse componente: ");
            String nome = l.nextLine();
            System.out.println("Digite a quantidade desse componente: ");
            int qtd = l.nextInt();
            l.nextLine();
            System.out.println("Digite o valor desse componente: ");
            float valorNo = l.nextFloat();
            l.nextLine();
            No novo = new No(nome, valorNo, qtd);
            no.acrescentarFilho(novo);
        } else {
            System.out.println("N?o cadastrado!");
        }
    }

    public static void cadastro(Arvore arvore, int qt) {
        for (int i = 0; i < qt; i++) {
            System.out.println("Digite o nome desse componente: ");
            String nome = l.nextLine();
            System.out.println("Digite a quantidade desse componente: ");
            int qtd = l.nextInt();
            l.nextLine();
            System.out.println("Digite o valor desse componente: ");
            float valorNo = l.nextFloat();
            l.nextLine();
            No no = new No(nome, valorNo, qtd);
            arvore.getRaiz().acrescentarFilho(no);
        }
    }

    public static void listarTodos(Arvore arvore) {
        arvore.getRaiz().componentes();
        System.out.println("\n        TODOS COMPONENTES CADASTRADOS \n");
        for (No folha : No.componentes) {
            System.out.println("Nome: " + folha.getNome());
            System.out.println("Valor: " + folha.getValor());
            System.out.println("Quantidade: " + folha.getQuantidade());
        }
    }

    public static void listarFolhas(Arvore arvore) {
        arvore.getRaiz().folhas();
        System.out.println("\n         FOLHAS / COMPONENTES - N?S SEM FILHOS. \n");
        for (No folha : No.folhas) {
            System.out.println("Nome: " + folha.getNome());
            System.out.println("Valor: " + folha.getValor());
            System.out.println("Quantidade: " + folha.getQuantidade());
        }
    }
}
