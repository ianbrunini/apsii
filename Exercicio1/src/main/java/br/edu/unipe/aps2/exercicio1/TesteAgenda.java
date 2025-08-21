package br.edu.unipe.aps2.exercicio1;

public class TesteAgenda {
	public static void main(String[] args) {
		
	    MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

        Aniversariante a1 = new Aniversariante("Ian",8,02);
        Aniversariante a2 = new Aniversariante("Meg",new DataAniversario(23,3));
        Aniversariante a3 = new Aniversariante("Ivys",23,12);
        Aniversariante a4 = new Aniversariante("Shirley",new DataAniversario(3,7));
        
        agenda.adicionar(a1);
        agenda.adicionar(a2);
        agenda.adicionar(a3);
        agenda.adicionar(a4);
        
        System.out.println("Lista dos Aniversariantes");
        for (Aniversariante a : agenda.listar()) {
		System.out.println(a);
	}
        
        agenda.remover(a1);
        System.out.println("===========================");
        System.out.println("Lista dos Aniversariantes apos a remoçao do a1");
        for (Aniversariante a : agenda.listar()) {
		System.out.println(a);
        
  }
 }
}       
