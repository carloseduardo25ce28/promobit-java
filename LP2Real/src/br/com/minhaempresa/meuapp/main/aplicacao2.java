package br.com.minhaempresa.meuapp.main;

import java.util.Scanner;

import br.com.minhaempresa.meuapp.model.Avaliacao;
import br.com.minhaempresa.meuapp.model.Categoria;
import br.com.minhaempresa.meuapp.model.Item;
import br.com.minhaempresa.meuapp.model.Post;
import br.com.minhaempresa.meuapp.model.Qualidade;
import br.com.minhaempresa.meuapp.model.Usuario;
import br.com.minhaempresa.meuapp.model.UsuarioAdministrador;
import br.com.minhaempresa.meuapp.model.UsuarioComum;
import br.com.minhaempresa.meuapp.service.GerenciadorAvaliacao;
import br.com.minhaempresa.meuapp.service.GerenciadorPost;
import br.com.minhaempresa.meuapp.service.GerenciadorUsuario;
import br.com.minhaempresa.meuapp.util.Validador;

public class aplicacao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GerenciadorAvaliacao gerenciadorAvaliacao = new GerenciadorAvaliacao();
		GerenciadorPost gerenciadorPost = new GerenciadorPost();
		GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario(gerenciadorPost, gerenciadorAvaliacao);
		Usuario usuario = null;
		
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

		usuario = cadastro_login(gerenciadorUsuario, sc, usuario);
			
		while(true) {
			
			if(usuario instanceof UsuarioComum) {
				int escolhaMenu;
				while(true) {
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					System.out.println("			MENU          \n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					System.out.println("1 - Pesquisar post\n2 - Exibir posts por categoria\n3 - Ver todos os posts\n4 - Postar\n5 - Fazer Avaliação\n6 - Salvar post\n7 - Ver posts Salvos\n8 - Remover post\n9 - Remover post salvo\n10 - Remover Avaliação\n11 - Fazer login ou cadastro\n12 - Ver todos os meus posts\n0 - Sair");
					System.out.println("Olá " + usuario.getNome() + "!\n");
					System.out.println("Faça uma escolha: ");
					escolhaMenu = sc.nextInt();
					switch(escolhaMenu) {
					    case 0:
					    	break;
						case 1:
							pesquisarPostM(gerenciadorPost, sc);
							break;
						case 2:
							exibirPostsPorCategoriaM(gerenciadorPost, sc);
							break;
						case 3:
							listaTodosM(gerenciadorPost);
							break;
						case 4:
							postar(gerenciadorPost, usuario, sc);
							break;
						case 5:
							fazerAvaliacao(gerenciadorPost, gerenciadorAvaliacao, usuario, sc);
							break;
						case 6:
							salvarPost(gerenciadorPost, usuario, sc);
							break;
						case 7:
							verPostSalvo(gerenciadorPost, usuario);
							break;
						case 8:
							removerPost(gerenciadorPost, gerenciadorUsuario, usuario, sc);
							break;
						case 9:
							removerPostSalvo(gerenciadorPost, usuario, sc);
							break;
						case 10:
							removerAvaliacao(gerenciadorAvaliacao, usuario, sc);
							break;
						case 11:
							usuario = cadastro_login(gerenciadorUsuario, sc, usuario);
							break;
						case 12:
							((UsuarioComum) usuario).exibirListaPost();
							break;
						default:
							System.out.println("Escolha uma opção válida!");
							break;
							
					}
					if(escolhaMenu == 0 || escolhaMenu == 11) {
						break;
					}
				}
				if(escolhaMenu == 0) {
					break;
				}
			
			}
			
			else if(usuario instanceof UsuarioAdministrador){
				int escolhaMenu2;
				while(true) {
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					System.out.println("			MENU          \n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					System.out.println("1 - Remover usuário\n2 - Remover Post\n3 - Remover avaliação\n4 - Fazer Login\n5 - Listar usuarios\n0 - Sair");
					System.out.println("Olá " + usuario.getNome() + "!\n");
					System.out.println("Faça uma escolha: ");
					escolhaMenu2 = sc.nextInt();
					switch(escolhaMenu2) {
						case 0:
							break;
						case 1:
							removerUsuario(gerenciadorUsuario, usuario, sc);
							break;
						case 2:
							removerPost(gerenciadorPost, gerenciadorUsuario, usuario, sc);
							break;
						case 3:
							removerAvaliacao(gerenciadorAvaliacao, usuario, sc);
							break;
						case 4:
							usuario = cadastro_login(gerenciadorUsuario, sc, usuario);
							break;
						case 5:
							for(Usuario u : gerenciadorUsuario.getTodosUsuarios()) {
								u.exibirUsuario();
							}
							break;
						default:
							System.out.println("Escolha uma opção válida!");
							break;
					}
					if(escolhaMenu2 == 0 || escolhaMenu2 == 4) {
						break;
					}
				}
				if(escolhaMenu2 == 0) {
					break;
				}
			}
			else if(usuario == null) {
				System.out.println("Senha ou email incorreto!");
				usuario = cadastro_login(gerenciadorUsuario, sc, usuario);
			}
		}
	}
	
	public static void pesquisarPostM(GerenciadorPost gerenciadorPost, Scanner sc) {
		System.out.println("Digite o id do post que deseja pesquisar: ");
		int idPost = sc.nextInt();
		Post post = gerenciadorPost.buscarPost(idPost);
		if(post != null) {
			post.exibirInformacoes();
		}
		else {
			System.out.println("Post não encontrado");
		}
		
	}
	
	public static void exibirPostsPorCategoriaM(GerenciadorPost gerenciadorPost, Scanner sc) {
		String categoria = verificarCategoriaAdequada(sc);
		gerenciadorPost.exibirPostsPorCategoria(Categoria.valueOf(categoria));
	}
	
	public static void listaTodosM(GerenciadorPost gerenciadorPost) {
		for(Post p : gerenciadorPost.listarTodos()) {
			p.exibirInformacoes();
		}
	}
	
	public static void postar(GerenciadorPost gerenciadorPost, Usuario usuario, Scanner sc) {
		sc.nextLine();
		System.out.println("Sobre o item: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Descrição: ");
		String descricao = sc.nextLine();
		
		String categoria = verificarCategoriaAdequada(sc);
		//System.out.println("Categoria: ");
		//String categoria = sc.nextLine();
		
		System.out.println("Agora sobre o post: ");
		System.out.println("Preço original do item: ");
		double precoOriginal = sc.nextDouble();
		System.out.println("Preço com desconto do item: ");
		double precoDesconto = sc.nextDouble();
		sc.nextLine();
		System.out.println("Link: ");
		String link = sc.nextLine();
		System.out.println("Descrição: ");
		String descricaoP = sc.nextLine();
		
		Post post = new Post(new Item(nome, descricao, Categoria.valueOf(categoria)), precoOriginal, precoDesconto, link, descricaoP, usuario);
		gerenciadorPost.adicionar(post, usuario);
	}
	
	public static void fazerAvaliacao(GerenciadorPost gerenciadorPost, GerenciadorAvaliacao gerenciadorAvaliacao,Usuario usuario,Scanner sc) {
		System.out.println("Digite o id do post que deseja avaliar: ");
		int id = sc.nextInt();
		Post post = gerenciadorPost.buscarPost(id);
		if(post != null) {
			System.out.println("Post encontrado!");
			post.exibirInformacoes();
			
			String qualidade = null;
			while(true) {
		    	System.out.println("1 - Bom\n2 - Ruim\n3 - Médio\n");
		    	System.out.println("Escolha: ");
		    	int escolha = sc.nextInt();
		    	switch(escolha) {
		    		case 1:
		    			qualidade = "BOM";
		    			break;
		    		case 2:
		    			qualidade = "RUIM";
		    			break;
		    		case 3:
		    			qualidade = "MEDIO";
		    			break;
		    		default:
		    			System.out.println("Escolha invalida");
		    	}
		    	if(escolha > 0 && escolha < 6) {
		    		break;
		    	}
			}
			//System.out.println("Digite a qualidade: ");
			
			sc.nextLine();
			System.out.println("Comentario: ");
			String comentario = sc.nextLine();
			Avaliacao ava = new Avaliacao(usuario, Qualidade.valueOf(qualidade), comentario, post);
			if(gerenciadorAvaliacao.adicionarAvaliacao(ava)) {
				System.out.println("Avaliação adicionada com sucesso!");
			}
			else {
				System.out.println("Erro ao adicionar avaliação.");
			}
		}
		else {
			System.out.println("Post não encontrado.");
		}
	}
	
	public static void salvarPost(GerenciadorPost gerenciadorPost, Usuario usuario, Scanner sc) {
		System.out.println("Digite o id do post que deseja salvar: ");
		int id = sc.nextInt();
		Post post = gerenciadorPost.buscarPost(id);
		if(post != null) {
			gerenciadorPost.salvarPost(usuario, post);
		}
		else {
			System.out.println("Post não encontrado");
		}
	}
	
	public static void verPostSalvo(GerenciadorPost gerenciadorPost, Usuario usuario) {
		for(Post p : gerenciadorPost.listarPostsSalvos(usuario)) {
			p.exibirInformacoes();
		}
	}
	
	public static void removerPost(GerenciadorPost gerenciadorPost, GerenciadorUsuario gerenciadorUsuario, Usuario usuario, Scanner sc) {
		System.out.println("Digite o Id do post que deseja remover");
		int id = sc.nextInt();
		if(gerenciadorPost.remover(id, usuario, gerenciadorUsuario)) {
			System.out.println("Post removido com sucesso!");
		}
		else {
			System.out.println("Erro ao remover.");
		}
	}
	
	public static void removerPostSalvo(GerenciadorPost gerenciadorPost,  Usuario usuario, Scanner sc) {
		System.out.println("Digite o id do post que deseja remover");
		int id = sc.nextInt();
		if(gerenciadorPost.removerPostSalvo(usuario, id)) {
			System.out.println("Post removido com sucesso!");
		}
		else {
			System.out.println("Erro ao remover post!");
		}
	}
	
	public static void removerAvaliacao(GerenciadorAvaliacao gerenciadoAvaliacao, Usuario usuario, Scanner sc) {
		sc.nextLine();
		System.out.println("Digite o id da avaliação que deseja excluir");
		String id = sc.nextLine();
		if(gerenciadoAvaliacao.removerAvaliacao(id, usuario)) {
			System.out.println("Avaliação removida com sucesso!");
		}
		else {
			System.out.println("Erro ao remover avaliação!");
		}
	}
	
	public static Usuario cadastro_login(GerenciadorUsuario gerenciadorUsuario, Scanner sc, Usuario usuario) {
		System.out.println("    MENU           \n");
		System.out.println("1 - Cadastrar\n2 - Login\n_________________");
		int escolha;
		while(true) {
			escolha = sc.nextInt();
			if(escolha != 1 && escolha != 2) {
				System.out.println("Escolha inválida");
			}
			else {
				break;
			}
		}
		
		
		sc.nextLine();
		int escolha3 = -1;
		int escolha2 = 0;
		String nome = null;
		String email = null;
		String senha = null;
		
		while(true) {
			System.out.println("Nome: ");
			nome = sc.nextLine();
			if(Validador.isNome(nome)) {
				break;
			}
			else {
				System.out.println("Nome Invalido");
			}
		}
		while(true) {
			System.out.println("Email: ");
			email = sc.nextLine();
			if(Validador.isEmail(email)) {
				break;
			}
			else {
				System.out.println("Email invalido");
			}
		}
		
		System.out.println("Senha: ");
		senha = sc.nextLine();

		
		if(escolha == 1) {
		
			while(true) {
				System.out.println("Qual tipo de usuario: ");
				System.out.println("1 - Usuario Comum\n2 - Usuario Administrador");
				escolha2 = sc.nextInt();
				if(escolha2 == 1) {
					break;
				}
				if(escolha2 == 2) {
					sc.nextLine();
					while(true) {
						System.out.println("Senha administrador: ");
						senha = sc.nextLine();
						if(!Validador.permissaoAdministrador(senha)) {
							//escolha2 = 1;
							System.out.println("Senha incorreta");
							System.out.println("1 - Continuar tentando\n2 - Voltar");
							escolha3 = sc.nextInt();
							if(escolha3 == 2) {
								break;
							}
							sc.nextLine();
						}
						else {
							escolha3 = 0;
							break;
						}
					}
				}
				if(escolha3 == 0) {
					usuario = new UsuarioAdministrador(nome, email, senha);
					
					
					//if(usuario.equals(null)) {
					//	System.out.println("é nulo");
					//}
					gerenciadorUsuario.adicionarUsuario(usuario);
					return usuario;
					//break;
				}
			}
			
			if(escolha2 == 1) {
				usuario = new UsuarioComum(nome, email, senha);
				gerenciadorUsuario.adicionarUsuario(usuario);
				return usuario;
			}
	}
			//usuarioxibirUsuario();
			
			//Agora começa login
			if(escolha == 2) {
				usuario = gerenciadorUsuario.fazerLogin(email, senha);
				if (gerenciadorUsuario.getTodosUsuarios().contains(usuario)){
					System.out.println("Contemm");
				}
				else {
					System.out.println("Não contém");
				}
				return usuario;
			}
			return null;
	}
	
	public static void removerUsuario(GerenciadorUsuario gerenciadorUsuario, Usuario usuario, Scanner sc) {
		System.out.println("Digite o id do usuario que deseja remover: ");
		int id = sc.nextInt();
		if(gerenciadorUsuario.removerUsuario(id, usuario)) {
			System.out.println("Usuario removido com sucesso!");
		}
		else {
			System.out.println("Erro ao remover usuario");
		}
	}
	
	public static String verificarCategoriaAdequada(Scanner sc) {
		String categoria = null;
		while(true) {
	    	System.out.println("1 - Eletrônicos\n2 - Alimentação\n3 - Vestuario\n4 - Casa\n5 - Serviço\n6 - Cosmético\n7 - Educação");
	    	System.out.println("Escolha: ");
	    	int escolha = sc.nextInt();
	    	switch(escolha) {
	    		case 1:
	    			categoria = "ELETRONICOS";
	    			break;
	    		case 2:
	    			categoria = "ALIMENTACAO";
	    			break;
	    		case 3:
	    			categoria = "VESTUARIO";
	    			break;
	    		case 4:
	    			categoria = "CASA";
	    			break;
	    		case 5:
	    			categoria = "SERVICO";
	    			break;
	    		case 6:
	    			categoria = "COSMETICO";
	    			break;
	    		case 7:
	    			categoria = "EDUCACAO";
	    			break;
	    		default:
	    			System.out.println("Escolha invalida");
	    	}
	    	if(escolha > 0 && escolha < 8) {
	    		return categoria;
	    	}
		}
	}
}
