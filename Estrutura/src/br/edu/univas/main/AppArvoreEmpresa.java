package br.edu.univas.main;

public class AppArvoreEmpresa {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore("Empresa");

        No unidade = new No ("Unidade", 1000f, 1);
        arvore.getRaiz().acrescentarFilho(unidade);
        No cnpj = new No("cnpj", 900f, 1);
        arvore.getRaiz().acrescentarFilho(cnpj);
        No nomeUnidade = new No("nome", 800f, 1);
        arvore.getRaiz().acrescentarFilho(nomeUnidade);

        No predio = new No("Predio", 800f, 1);
        unidade.acrescentarFilho(predio);
        No numeroPredio = new No("numero", 700f, 1);
        unidade.acrescentarFilho(numeroPredio);
        No nomePredio = new No("nome", 260f, 1);
        unidade.acrescentarFilho(nomePredio);

        No andar = new No("Andar", 500f, 1);
        predio.acrescentarFilho(andar);
        No numeroAndar = new No("numero", 200f, 1);
        predio.acrescentarFilho(numeroAndar);

        No sala = new No("Sala", 0.50f, 1000);
        andar.acrescentarFilho(sala);
        No numeroSala = new No("numero", 250f, 1);
        andar.acrescentarFilho(numeroSala);
        
        No equipamento = new No("Equipamento", 1f, 100);
        andar.acrescentarFilho(equipamento);
        No patrimonio = new No("patrimonio", 150f, 1);
        andar.acrescentarFilho(patrimonio);
        No nomeEquipamento = new No("nome", 600f, 1);
        andar.acrescentarFilho(nomeEquipamento);
        No tipo = new No("tipo", 550f, 1);
        andar.acrescentarFilho(tipo);
        No dataAquisicao = new No("aquisicao", 500f, 1);
        andar.acrescentarFilho(dataAquisicao);
        No dataManutencao = new No("manutencao", 50f, 1);
        andar.acrescentarFilho(dataManutencao);
        
        
        
        
        
        
        No buscado = arvore.getRaiz().buscar("Unidade");
        if(buscado != null){
            System.out.println("NO que foi buscado: " +buscado.getNome()+ "  - Quantidade: "+buscado.getQuantidade());
        }else {
            System.out.println("NO Encontrado");
        }

        buscado = arvore.getRaiz().buscar("Predio");
        if(buscado != null){
            System.out.println("NO que foi buscado: " +buscado.getNome()+ "  - Quantidade: "+buscado.getQuantidade());
        }else {
            System.out.println("NO Encontrado");
        }

        buscado = arvore.getRaiz().buscar("Equipamento");
        if(buscado != null){
            System.out.println("No que foi buscado: " +buscado.getNome()+ "  - Quantidade: "+buscado.getQuantidade());
        }else {
            System.out.println("No Encontrado");
        }



        arvore.getRaiz().folhas();
        System.out.println("\n \n \n \n \n \n FOLHAS / COMPONENTES - NOS SEM FILHOS. \n");
        for(No folha : No.folhas){
            System.out.println("Nome: "+folha.getNome());
            System.out.println("Quantidade: "+folha.getQuantidade());
        }

        arvore.getRaiz().componentes();
        System.out.println("\n \n \n \n \n \n TODOS COMPONENTES CADASTRADOS \n");
        for(No folha : No.componentes){
            System.out.println("Nome: "+folha.getNome());
            System.out.println("Quantidade: "+folha.getQuantidade());
        }


    }
}
