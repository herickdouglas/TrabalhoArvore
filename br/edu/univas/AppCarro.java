package br.edu.univas;

public class AppCarro {
    public static void main(String[] args) throws Exception {
        
        Arvore arvore = new Arvore("MOTOR DE CARRO");


        //CADASTRO DE SUB-PEÇAS
        No alternador = new No ("ALTERNADOR", 1000f, 1);
        No bateria = new No ("BATERIA", 2000f, 1);
        No cabecote = new No ("CABEÇOTE", 200f, 4);
        No cilindro = new No ("CILINDROS", 400f, 1);
        No valvula = new No ("VALVULA", 200f, 2);
        No pistao = new No("PISTÃO", 400f, 1);



        arvore.getRaiz().acrescentarFilho(alternador);
        arvore.getRaiz().acrescentarFilho(bateria);
        arvore.getRaiz().acrescentarFilho(cabecote);
        arvore.getRaiz().acrescentarFilho(cilindro);
        arvore.getRaiz().acrescentarFilho(valvula);
        arvore.getRaiz().acrescentarFilho(pistao);


        

        No polia = new No ("POLIA", 100f, 1);
        No rotor = new No ("ROTOR", 200f, 1);
        No estator = new No ("ESTATOR", 200f, 1);

        No caixa = new No ("caixa", 10f, 1);
        No tampa = new No("tampa", 50f, 1);
        No polos = new No("polos", 500f, 1);

        No junta = new No("Junta", 60f, 1);
        No balancins = new No("Balancins", 500f, 1);

        No volante = new No("Volante do motor", 200f, 1);
        No distribuidor = new No("Distribuidor",50f,1);

        No haste = new No("haste", 200f, 1);
        No mola = new No("mola", 100f, 1);
        No metal = new No("Metal", 60f,1);

        No camara = new No("camara", 80f, 1);
        No ressalto = new No("ressalto de anel", 20f, 1);

        // ARVORE
        alternador.acrescentarFilho(polia);
        alternador.acrescentarFilho(rotor);
        alternador.acrescentarFilho(estator);

        bateria.acrescentarFilho(caixa);
        bateria.acrescentarFilho(tampa);
        bateria.acrescentarFilho(polos);

        cabecote.acrescentarFilho(junta);
        cabecote.acrescentarFilho(balancins);

        cilindro.acrescentarFilho(volante);
        cilindro.acrescentarFilho(distribuidor);
   
        valvula.acrescentarFilho(haste);
        valvula.acrescentarFilho(mola);
        valvula.acrescentarFilho(metal);

        pistao.acrescentarFilho(camara);
        pistao.acrescentarFilho(ressalto);
        

        No buscado = arvore.getRaiz().buscar("Capacitores");
        if(buscado != null){
            System.out.println("Nó que foi buscado: " +buscado.getNome()+ "   - Valor: "+buscado.getValor()+ "  - Quantidade: "+buscado.getQuantidade());
        }else {
            System.out.println("Não Encontrado");
        }

        buscado = arvore.getRaiz().buscar("Nano Componentes");
        if(buscado != null){
            System.out.println("Nó que foi buscado: " +buscado.getNome()+ "   - Valor: "+buscado.getValor()+ "  - Quantidade: "+buscado.getQuantidade());
        }else {
            System.out.println("Não Encontrado");
        }

        buscado = arvore.getRaiz().buscar("FONTE");
        if(buscado != null){
            System.out.println("Nó que foi buscado: " +buscado.getNome()+ "   - Valor: "+buscado.getValor()+ "  - Quantidade: "+buscado.getQuantidade());
        }else {
            System.out.println("Não Encontrado");
        }


        arvore.getRaiz().valorArvore();
        System.out.println("\n         VALOR TOTAL DO PRODUTO: "+No.soma);


        arvore.getRaiz().folhas();
        System.out.println("\n          FOLHAS / COMPONENTES - NÓS SEM FILHOS. \n");
        for(No folha : No.folhas){
            System.out.println("Nome: "+folha.getNome());
            System.out.println("Valor: "+folha.getValor());
            System.out.println("Quantidade: "+folha.getQuantidade());
        }

        arvore.getRaiz().componentes();
        System.out.println("\n          TODOS COMPONENTES CADASTRADOS \n");
        for(No folha : No.componentes){
            System.out.println("Nome: "+folha.getNome());
            System.out.println("Valor: "+folha.getValor());
            System.out.println("Quantidade: "+folha.getQuantidade());
        }


    }
}
