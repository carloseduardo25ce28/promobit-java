package br.com.minhaempresa.meuapp.main;

import br.com.minhaempresa.meuapp.model.Avaliacao;
import br.com.minhaempresa.meuapp.model.Categoria;
import br.com.minhaempresa.meuapp.model.Item;
import br.com.minhaempresa.meuapp.model.Post;
import br.com.minhaempresa.meuapp.model.Qualidade;
import br.com.minhaempresa.meuapp.model.UsuarioAdministrador;
import br.com.minhaempresa.meuapp.model.UsuarioComum;
import br.com.minhaempresa.meuapp.service.GerenciadorAvaliacao;
import br.com.minhaempresa.meuapp.service.GerenciadorPost;
import br.com.minhaempresa.meuapp.service.GerenciadorUsuario;

public class aplicacao1 {

	public static void main(String[] args) {
		
		GerenciadorPost gerenciadorPost = new GerenciadorPost();
		GerenciadorAvaliacao gerenciadorAvaliacao = new GerenciadorAvaliacao();
		GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario(gerenciadorPost, gerenciadorAvaliacao);
		
		UsuarioComum anaSilva = new UsuarioComum("Ana Silva", "anasilva@gmail.com", "ana123");
		UsuarioComum brunoCosta = new UsuarioComum("Bruno Costa", "brunocosta@gmail.com", "bruno123");
		UsuarioComum carlaMendes = new UsuarioComum("Carla Mendes", "carlamendes@gmail.com", "carla123");
		UsuarioComum cucaBeludo = new UsuarioComum("Cuca Beludo", "cucabeludo@gmail.com", "cuca123");
		UsuarioComum eduardaLima = new UsuarioComum("Eduarda Lima", "eduardalima@gmail.com", "eduarda123");
		UsuarioComum carlosEduardo = new UsuarioComum("Carlos Eduardo", "carloseduardo@gmail.com", "carlos123");
		UsuarioComum jalimHabei = new UsuarioComum("Jalim Habei", "jalimhabei@gmail.com", "jalim123");
		UsuarioComum pauloRodrigues = new UsuarioComum("Paulo Rodrigues", "paulorodrigues@gmail.com", "paulo123");
		UsuarioComum giovanaPires = new UsuarioComum("Giovana Pires", "giovanapires@gmail.com", "giovana123");
		UsuarioComum thiagoViana = new UsuarioComum("Thiago Viana", "thiagoviana@gmail.com", "thiago123");
		UsuarioComum paulaTejano = new UsuarioComum("Paula Tajeno", "paulaTejana@gmail.com", "paula123");
		UsuarioComum victorMelo = new UsuarioComum("Victor Melo", "victomelo@gmail.com", "victor123");
		UsuarioAdministrador gabrielBarbosa = new UsuarioAdministrador("Gabriel Barbosa", "gabrielbarbosa@gmail.com", "gabriel123");
		UsuarioComum brunoHenrique = new UsuarioComum("Bruno Henrique", "brunohnerique@gmail.com", "bruno123");
		
		gerenciadorUsuario.adicionarUsuario(anaSilva);
		gerenciadorUsuario.adicionarUsuario(brunoCosta);
		gerenciadorUsuario.adicionarUsuario(carlaMendes);
		gerenciadorUsuario.adicionarUsuario(cucaBeludo);
		gerenciadorUsuario.adicionarUsuario(eduardaLima);
		gerenciadorUsuario.adicionarUsuario(carlosEduardo);
		gerenciadorUsuario.adicionarUsuario(jalimHabei);
		gerenciadorUsuario.adicionarUsuario(pauloRodrigues);
		gerenciadorUsuario.adicionarUsuario(giovanaPires);
		gerenciadorUsuario.adicionarUsuario(thiagoViana);
		gerenciadorUsuario.adicionarUsuario(paulaTejano);
		gerenciadorUsuario.adicionarUsuario(victorMelo);
		gerenciadorUsuario.adicionarUsuario(brunoHenrique);
		gerenciadorUsuario.adicionarUsuario(gabrielBarbosa);
		
		
		
		Post postAnaSilva = new Post(
			    new Item("Camisa", "Camisa do FLAMENGOO", Categoria.VESTUARIO),
			    2000.00, 1500.00, "www.com.amazonbr", "Camisa retro flamengo 1981", anaSilva);
			gerenciadorPost.adicionar(postAnaSilva, anaSilva);

			Post postBrunoCosta = new Post(
			    new Item("Fone de Ouvido", "Fone sem fio Bluetooth", Categoria.ELETRONICOS),
			    300.00, 250.00, "www.amazon.com.br", "Fone ótimo para estudos e chamadas", brunoCosta);
			gerenciadorPost.adicionar(postBrunoCosta, brunoCosta);

			Post postCarlaMendes = new Post(
			    new Item("Livro", "Dom Casmurro de Machado de Assis", Categoria.EDUCACAO),
			    50.00, 35.00, "www.livrariaonline.com", "Clássico da literatura brasileira", carlaMendes);
			gerenciadorPost.adicionar(postCarlaMendes, carlaMendes);

			Post postCucaBeludo = new Post(
			    new Item("Tênis", "Tênis esportivo Nike", Categoria.VESTUARIO),
			    400.00, 299.99, "www.nike.com", "Tênis confortável para corrida", cucaBeludo);
			gerenciadorPost.adicionar(postCucaBeludo, cucaBeludo);

			Post postEduardaLima = new Post(
			    new Item("Notebook", "Notebook Dell i5", Categoria.ELETRONICOS),
			    3500.00, 2999.99, "www.dell.com.br", "Notebook ideal para home office", eduardaLima);
			gerenciadorPost.adicionar(postEduardaLima, eduardaLima);

			Post postCarlosEduardo = new Post(
			    new Item("Cabo HDMI", "Cabo HDMI 2m", Categoria.ELETRONICOS),
			    40.00, 25.00, "www.kabum.com.br", "Alta qualidade de imagem e som", carlosEduardo);
			gerenciadorPost.adicionar(postCarlosEduardo, carlosEduardo);

			Post postJalimHabei = new Post(
			    new Item("Bola de futebol", "Bola oficial FIFA", Categoria.CASA),
			    200.00, 150.00, "www.espnstore.com", "Perfeita para jogos oficiais", jalimHabei);
			gerenciadorPost.adicionar(postJalimHabei, jalimHabei);

			Post postPauloRodrigues = new Post(
			    new Item("Camiseta Geek", "Camiseta do Batman", Categoria.VESTUARIO),
			    80.00, 60.00, "www.geekstore.com", "Estampa original do Batman", pauloRodrigues);
			gerenciadorPost.adicionar(postPauloRodrigues, pauloRodrigues);

			Post postGiovanaPires = new Post(
			    new Item("Livro", "Harry Potter e a Pedra Filosofal", Categoria.EDUCACAO),
			    70.00, 55.00, "www.amazon.com.br", "Primeiro livro da série mágica", giovanaPires);
			gerenciadorPost.adicionar(postGiovanaPires, giovanaPires);

			Post postThiagoViana = new Post(
			    new Item("Controle PS5", "Controle DualSense", Categoria.ELETRONICOS),
			    500.00, 450.00, "www.sony.com", "Novo controle PS5 com feedback tátil", thiagoViana);
			gerenciadorPost.adicionar(postThiagoViana, thiagoViana);

			Post postPaulaTejano = new Post(
			    new Item("Saia", "Saia longa floral", Categoria.VESTUARIO),
			    120.00, 90.00, "www.lojaestilo.com", "Estampa delicada e tecido leve", paulaTejano);
			gerenciadorPost.adicionar(postPaulaTejano, paulaTejano);

			Post postVictorMelo = new Post(
			    new Item("Violão", "Violão acústico Giannini", Categoria.EDUCACAO),
			    600.00, 500.00, "www.musicalcenter.com", "Ideal para iniciantes e intermediários", victorMelo);
			gerenciadorPost.adicionar(postVictorMelo, victorMelo);

			Post postGabrielBarbosa = new Post(
			    new Item("Cadeira Gamer", "Cadeira gamer com apoio lombar", Categoria.ELETRONICOS),
			    1200.00, 999.99, "www.pichau.com.br", "Conforto e durabilidade", gabrielBarbosa);
			gerenciadorPost.adicionar(postGabrielBarbosa, gabrielBarbosa);

			Post postBrunoHenrique = new Post(
			    new Item("Relógio", "Relógio smartwatch Xiaomi", Categoria.ELETRONICOS),
			    350.00, 280.00, "www.mercadolivre.com.br", "Monitora batimentos, passos e notificações", brunoHenrique);
			gerenciadorPost.adicionar(postBrunoHenrique, brunoHenrique);

			Avaliacao avaliacao1 = new Avaliacao(paulaTejano, Qualidade.BOM, "Muito Bom", postThiagoViana);
			gerenciadorAvaliacao.adicionarAvaliacao(avaliacao1);
			
			for(Avaliacao a : postThiagoViana.getAvaliacoes()) {
				a.exibirInformacoesA();
			}
			
			gerenciadorPost.exibirPostsPorCategoria(Categoria.ELETRONICOS);
		//gerenciadorUsuario.removerUsuario(2, gabrielBarbosa);
		//gerenciadorPost.remover(1, gabrielBarbosa);
		
		
		
		//for(Avaliacao a : gerenciadorAvaliacao.listarTodas()) {
		//	a.exibirInformacoes();
		//}
		
		//anaSilva.exibirUsuario();
		//postAnaSilva.exibirInformacoes();
		
		//brunoCosta.exibirUsuario();
		//postBrunoCosta.exibirInformacoes();
		//gerenciadorUsuario.listarUsuarioPost();
		
		//anaSilva.exibirListaPost();
		//gerenciadorPost.remover(1, anaSilva);
		//anaSilva.exibirListaPost();
		//gerenciadorUsuario.listarUsuarioPost();
	}
	
	

}
