/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author barbaraargolo
 */
public class Jogo {
    // nome do jogador(a)
    static String nomeMaodaRainha;

    // variavel contador
    static int numTerritorios = 0;

    static int temp_dialog = 20, temp_narrativa = 300, temp_ascII = 10;

    public static void main(String[] args) throws Exception {
//         Scanner entrada = new Scanner(System.in);
//   //1      nomeMaodaRainha = entrada.next();
//         int escolhaMenu;
        ;


            Console("Depois de dias pelo Mar Extreito, terra foi avistada...\n" +
                    "    .                  __.   .  _   *     -.\n" +
                    "           *         /_ . \\   ((         /  \\       *    .\n" +
                    "         _    .   .--' . \\_\\     `      /_   \\  *___    \n" +
                    "     *  / \\_    _/ ^      \\/\\__        /  \\ /\\ __/   \\ * \n" +
                    "       /_.   \\  /    .'   _/  /  \\  *'/    \\/ \\/.`'\\_/\\   .\n" +
                    "  .   /   \\ /\\/ :' __  ^/  ^/   `--./.' ^`-.\\_       _:\\ _ . \n" +
                    "     /     \\/ \\  _/  \\-' __/.' ^ _  / \\_  .'\\   _/\\.__/ \\ \n" +
                    "   /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_/   \\ /  `._/ ^ \\ \n" +
                    "  /  `-.__ ^   / .-''.--'    . /    `-\\/ .-'  `-.  `-. `. \\   \n" +
                    "@/        `./ /      `-.   /  .-'   / .\\ .'     \\   \\  \\ .-\\.... \n" +
                    "@&8jgs@@%% @)&@&(88&@.-_=_-=_-=_-=_-=_.8@% &@&&8(8%@%8)(8@%8 8%@)%\n" +
                    "@88:::&(&8&&8:::::%&`.~-_~~-~~_~-~_~-~~=.'@(&%::::%@8&8)::&#@8::::\n" +
                    "`::::::8%@@%:::::@%&8:`.=~~-.~~-.~~=..~'8::::::::&@8:::::&8:::::'\n" +
                    " `::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.'", TimeUnit.MILLISECONDS,
                    temp_ascII);

            Console( "\n \n Varys - Bem vinda novamente a Westeros, Daenerys Targaryen, você provavelmente não se lembra, mas foi aqui em Pedra do Dragão onde você nasceu.",
                    TimeUnit.MICROSECONDS, temp_dialog);
            Console("\n \n Daenerys Targaryen - Depois de tudo que passamos e sofremos finalmente estamos aqui. \n Agora, precisamos conquistar o Trono de Ferro, não podemos perder tempo.",
                    TimeUnit.MICROSECONDS, temp_dialog);

           menu();
    }

    // ------------------------------------------------------- MENU -------------------------------------------------------
    static void menu() throws Exception {
        Scanner entrada = new Scanner(System.in);

        int escolhaMenu;
        do {
            System.out.println("\n\n..:: Game of Thrones ::.. \n\n1 - Jogar \n2 - Instruções\n3 - Créditos \n4 - Sair");
            System.out.println();

            escolhaMenu = entrada.nextInt();
            if (escolhaMenu == 1) {
                parteI();
            } else if (escolhaMenu == 2) {
                instrucoes();
            } else if (escolhaMenu == 3) {
                creditos();
            } else if (escolhaMenu == 4) {
                System.out.println("Você saiu do jogo!");
                System.exit(0);
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolhaMenu != 1 && escolhaMenu != 2 && escolhaMenu != 3 && escolhaMenu != 4);
    }

    // ------------------------------------- PARTE I -------------------------------------------------------------------

    static void parteI() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int pouparRecursos;
        int atacarTerritorio;

        do {
            Console("\n 1Em meio a uma batalha pelo Trono de Ferro, Daenerys Targaryen recebe visitas que podem mudar completamente o rumo dos acontecimentos. Olenna Tyrell, em busca de vingança contra Cersei Lannister, e Ellaria Sand com as Serpentes da Areia, ambas com o mesmo objetivo, se unem a Daenerys em uma reunião de conselho. "
                    + "\n\n Daenerys, olhando para as duas mulheres, pergunta com curiosidade: \n - O que traz vocês duas até aqui? E como podemos ser úteis umas às outras?",
                    TimeUnit.MICROSECONDS, temp_narrativa);

            Console("\n\n Olenna responde com sagacidade: \n - Eu quero vingança contra Cersei Lannister, mas estou ciente de que sozinha não tenho força para derrubá-la. Você, Daenerys, é uma líder poderosa com um exército forte. Sei que podemos ajudar um ao outro.",
                    TimeUnit.MICROSECONDS, temp_narrativa);

            Console("\n\n Ellaria acrescenta: \n - Eu também quero vingança contra Cersei Lannister, ela assassinou meu amado Oberyn. Juntos, podemos acabar com o reinado dela e colocar um fim em sua crueldade.",
                    TimeUnit.MICROSECONDS, temp_narrativa);

            Console("\n\n Daenerys olha para as duas mulheres e decide que pode contar com elas para vencer a guerra: \n - Vocês têm meu apoio. Juntos, podemos derrotar Cersei Lannister e colocar fim à sua tirania.",
                    TimeUnit.MICROSECONDS, temp_narrativa);

            Console("\n\n Em seguida, a reunião de conselho começa, e Daenerys ouve com atenção as sugestões de seus aliados sobre o que fazer em relação ao exército Lannister que está na região de Correrrio.",
                    TimeUnit.MICROSECONDS, temp_narrativa);

            Console("\n\n Olenna argumenta: \n - Atacar os Lannisters agora é a melhor opção. Não podemos deixá-los ganhar mais apoio e poder. Se não agirmos agora, podemos estar perdidos."
                    + "Ellaria, no entanto, oferece um ponto de vista diferente: \n - Poupar recursos agora é a melhor opção. CorreRio não é uma prioridade agora, e precisamos nos concentrar no que é realmente importante: acabar com o reinado de Cersei Lannister.",
                    TimeUnit.MICROSECONDS, temp_narrativa);

            Console("\n\n - [1] Poupar Recursos ou [2] Atacar Território!", TimeUnit.MILLISECONDS, temp_dialog);

            pouparRecursos = entrada.nextInt();
            atacarTerritorio = entrada.nextInt();

            if (pouparRecursos == 1) {
                numTerritorios += 20;

                Console("Sábia decisão, poupar recursos te fez adquirir 20 pontos! \n seu número de territórios permanece intacto. \n placar: " + numTerritorios,
                                TimeUnit.MILLISECONDS, 50);

                primeiroDesafio();
                parteIIdestinoI();

                break;

            } else if (atacarTerritorio == 2) {
                numTerritorios += 10;

                Console("Decisão importante, porém, existem custos nas guerras, então atacar o território te fez receber apenas 10 pontos! \n seu número de territórios permanece intacto. \n placar: "  + numTerritorios,
                TimeUnit.MILLISECONDS, 50);

                primeiroDesafio();
                parteIIdestinoII();

                break;

            } else {
                System.out.println("Você não digitou uma resposta válida!");

            }
        } while (pouparRecursos != 1 || atacarTerritorio != 2);

    }

    // --------------------------------- Desafios de Matemática -----------------------------------------------------------

    static void primeiroDesafio() throws Exception {
        Console("\n\n\n ATENÇÃO! seu primeiro desafio matemático começará em: \n 3 \n 2 \n 1 \n", TimeUnit.MILLISECONDS, 100);

        Scanner entrada = new Scanner(System.in);

        List<String> alternativas = new ArrayList<>();

        alternativas.add("11000111 e FA.");

        alternativas.add("11100111 e F9.");

        alternativas.add("11010111 e FA.");

        alternativas.add("11000111 e F9.");

        alternativas.add("11100111 e FA.");

        // embaralha as alternativas

        Collections.shuffle(alternativas);

        String respostaCerta = "11000111 e FA.";

        do {

            Console(
                    "Os números decimais 199 e 250 correspondem, nos sistemas binário e hexadecimal, às seguintes representações: \n",  TimeUnit.MILLISECONDS, 100);

            for (int i = 0; i < alternativas.size(); i++) {

                System.out.println("(" + (char)('a' + i) + ") " + alternativas.get(i));
                 
                
            }

            String selected = entrada.nextLine();

            switch (selected) {

                case "a" -> {

                    if (alternativas.get(0)
                            .equals(respostaCerta)) {

                        System.out.println("Resposta correta");
                        return;

                    }

                }

                case "b" -> {

                    if (alternativas.get(1)
                            .equals(respostaCerta)) {

                        System.out.println("Resposta correta");
                        return;

                    }

                }

                case "c" -> {

                    if (alternativas.get(2)
                            .equals(respostaCerta)) {

                        System.out.println("Resposta correta");
                        return;

                    }

                }

                case "d" -> {

                    if (alternativas.get(3)
                            .equals(respostaCerta)) {

                        System.out.println("Resposta correta");
                        return;

                    }

                }

                case "e" -> {

                    if (alternativas.get(4)
                            .equals(respostaCerta)) {

                        System.out.println("Resposta correta");
                        return;

                    }

                }

            }

            // se a resposta selecionada estiver incorreta, as alternativas embaralham de novo

            Collections.shuffle(alternativas);

            System.out.println("Resposta incorreta");

        } while (true);

    }

    static void segundoDesafio() throws Exception {

        Console("\n\n\n ATENÇÃO! Seu segundo desafio matemático começará em: \n 3 \n 2 \n 1 \n", TimeUnit.MILLISECONDS,
				100);

		Scanner entrada = new Scanner(System.in);

		List<String> alternativas = new ArrayList<>();

		alternativas.add("4 e 8");

		alternativas.add("3 e 6");

		alternativas.add("4 e 12");

		alternativas.add("2 e 4");

		alternativas.add("4 e 6");

		// embaralha as alternativas

		Collections.shuffle(alternativas);

		String respostaCerta = "4 e 8";

		do {

			Console("As potências 2² e 2³ correspondem, respectivamente, às seguintes representações: \n",
					TimeUnit.MILLISECONDS, 100);

			for (int i = 0; i < alternativas.size(); i++) {

				System.out.println("(" + (char) ('a' + i) + ") " + alternativas.get(i));

			}

			String selected = entrada.nextLine();

			switch (selected) {

			case "a" -> {

				if (alternativas.get(0).equals(respostaCerta)) {

					System.out.println("Resposta correta");
					return;

				}

			}

			case "b" -> {

				if (alternativas.get(1).equals(respostaCerta)) {

					System.out.println("Resposta correta");
					return;

				}

			}

			case "c" -> {

				if (alternativas.get(2).equals(respostaCerta)) {

					System.out.println("Resposta correta");
					return;

				}

			}

			case "d" -> {

				if (alternativas.get(3).equals(respostaCerta)) {

					System.out.println("Resposta correta");
					return;

				}

			}

			case "e" -> {

				if (alternativas.get(4).equals(respostaCerta)) {

					System.out.println("Resposta correta");
					return;

				}

			}

			}

			// se a resposta selecionada estiver incorreta, as alternativas embaralham de
			// novo

			Collections.shuffle(alternativas);

			System.out.println("Resposta incorreta");

		} while (true);

	}


    static void terceiroDesafio() throws Exception {

    }

    static void quartoDesafio() throws Exception {

    }

    static void desafioFinal() throws Exception {

    }

    // ------------------------------------- Partes II  -------------------------------------------------------------------
    static void parteIIdestinoI() throws Exception {

		Scanner entrada = new Scanner(System.in);
		int escolhaIIdestinoI;

		do {
			Console("\n Passaram-se os dias e cada vez mais tropas chegam ao acampamento. "
					+ "\n\n Contente com o exército aumentando, Daenerys decide fazer uma festa ao estilo Dothraki, povo que apoiou o início de sua jornada como rainha.",
					TimeUnit.MICROSECONDS, temp_narrativa);

			Console("\n\n Com todos alegres, dançando, cantando e comendo em volta da fogueira, a herdeira do trono de ferro passa a temer o que está por vir."
					+ "\n Afinal, em uma guerra, não sabemos até quando os bons momentos irão durar.",
					TimeUnit.MICROSECONDS, temp_narrativa);

			Console("\n\n Durante a festa, Daenerys percebe a ausência de Olenna e vai em busca da aliada.",
					TimeUnit.MICROSECONDS, temp_narrativa);

			Console("\n\n Ao ver a mulher sentada em frente ao lago, Daenerys questiona:\n - O que está havendo, Olenna?",
					TimeUnit.MICROSECONDS, temp_narrativa);

			Console("\n\n Olenna responde: \n - Recebi informações de que Cersei está reunindo tropas, deveríamos ter atacado quando tivemos oportunidade.",
					TimeUnit.MICROSECONDS, temp_narrativa);

			Console("\n\n Daenerys reafirma a sua decisão: \n - Com os recursos que conseguimos e as tropas que se aproximam, poderemos atacá-los em brev…",
				 TimeUnit.MICROSECONDS, 50);

			Console("\n\n Daenerys é interrompida com gritos e fumaça, sem entender se levanta, quando o cavaleiro Sor Jorah, seu protetor, aparece puxando-a e correndo."
					+ "\n\n Seguidos por Olenna, param atrás de uma das barracas e Jorah explica: \n Estamos sendo atacados pelo leste, enviei uma tropa para o combate, temos que nos preparar para partir.",
					TimeUnit.MICROSECONDS, temp_narrativa);

			Console("\n\n Daenerys então pergunta: \n - Qual o tamanho da força ofensiva? Estamos em grande número, precisamos pensar melhor.",
					TimeUnit.MICROSECONDS, temp_narrativa);

			Console("\n\n Então Olenna aconselha: \n - Devemos retaliar enquanto podemos! Fomos pegos de surpresa, mas não despreparados, minhas tropas estão a postos no perímetro norte, podemos atacar pelas laterais.",
					TimeUnit.MICROSECONDS, temp_narrativa);

			Console("\n\n - [1] Partir ou [2] Retaliar!", TimeUnit.MILLISECONDS, temp_dialog);

			escolhaIIdestinoI = entrada.nextInt();

			if (escolhaIIdestinoI == 1) {
				numTerritorios += 10;

				Console("Boa escolha, partir te fez poupar recursos e adquirir 10 pontos! \n Placar: "
						+ numTerritorios, TimeUnit.MILLISECONDS, 50);

				segundoDesafio();
				parteIIIdestinoI();

				break;

			} else if (escolhaIIdestinoI == 2) {
				numTerritorios += 30;

				Console("Decisão corajosa! As tropas foram contidas e avançamos no território, você recebeu 30 pontos! \n Placar: "
						+ numTerritorios, TimeUnit.MILLISECONDS, 50);

				segundoDesafio();
				parteIIIdestinoII();

				break;

			} else {
				System.out.println("Você não digitou uma resposta válida!");

			}
		} while (escolhaIIdestinoI != 1 || escolhaIIdestinoI != 2);

	}


    static void parteIIdestinoII() throws Exception {

        Scanner entrada = new Scanner(System.in);
		int escolhaIIdestinoII;

		do {
		Console("\n Após uma batalha muito árdua e grandes perdas, Daenerys se via no momento de se recompor."
				+ "\n\n Parte do exército se manteve no recém conquistado Correrrio e a herdeira do trono de ferro optou por montar um acampamento no vale entre as montanhas, para poder observar qualquer inimigo que se aproximasse.",
				TimeUnit.MICROSECONDS, temp_narrativa);

		Console("\n\n Para comemorar a vitória e honrar os que se foram, Daenerys decide fazer uma festa ao estilo Dothraki, povo que apoiou o início de sua jornada como rainha.",
				TimeUnit.MICROSECONDS, temp_narrativa);

		Console("\n Apesar do luto pelas vidas perdidas, todos comemoram dançando, cantando e comendo em volta da fogueira. " 
		+ "\n\n A herdeira do trono de ferro passa a temer o que está por vir. ",
				TimeUnit.MICROSECONDS, temp_narrativa);

		Console("\n Afinal, em uma guerra, não sabemos até quando os bons momentos irão durar." 
		+ "\n\n Durante a festa, Daenerys percebe a ausência de Ellaria e vai em busca da aliada.",
				TimeUnit.MICROSECONDS, temp_narrativa);

		Console("\n\n Ao ver a mulher sentada em frente ao lago, Daenerys questiona: \n - O que está havendo, Ellaria?" 
		+ "\n\n Ellaria responde: \n - Recebi informações de que Cersei está reunindo tropas, deveríamos ter poupado recursos quando tivemos oportunidade.",
				TimeUnit.MICROSECONDS, temp_narrativa);

		Console("\n\n Daenerys reafirma a sua decisão: \n - Com o território que conseguimos e as tropas que se juntam a nós, estaremos com os recursos suficientes em brev…",
		  TimeUnit.MICROSECONDS, 50);

		Console("\n\n Daenerys é interrompida com gritos, sem entender se levanta, quando o cavaleiro Sor Jorah, seu protetor, aparece puxando-a e correndo.",
				TimeUnit.MICROSECONDS, temp_narrativa);
		
		Console("\n\n  Seguidos por Ellaria, param atrás de uma das barracas e Jorah explica: \n - Estamos sendo atacados pelo leste, os arqueiros a postos estão dando conta por ora, temos que nos preparar para partir.",
				TimeUnit.MICROSECONDS, temp_narrativa);
		
		Console("\n\n Daenerys então pergunta: \n - Qual o tamanho da força ofensiva? Somos poucos, podemos conter a situação?" 
		+ "\n\n Então Ellaria aconselha: \n - Devemos partir enquanto podemos! \n Fomos pegos de surpresa, estamos despreparados, minhas tropas estão a postos no perímetro norte, podemos escapar pelas laterais.",
				 TimeUnit.MICROSECONDS, temp_narrativa);
		
		Console("\n\n - [1] Partir ou [2] Retaliar!", TimeUnit.MILLISECONDS, temp_dialog);

		escolhaIIdestinoII = entrada.nextInt();

		if (escolhaIIdestinoII == 1) {
			numTerritorios += 10;

			Console("Boa escolha, partir te fez poupar recursos e adquirir 10 pontos! \n Placar: "
					+ numTerritorios, TimeUnit.MILLISECONDS, 50);

			segundoDesafio();
			parteIIIdestinoI();

			break;

		} else if (escolhaIIdestinoII == 2) {
			numTerritorios += 30;

			Console("Decisão corajosa! As tropas foram contidas e avançamos no território, você recebeu 30 pontos! \n Placar: "
					+ numTerritorios, TimeUnit.MILLISECONDS, 50);

			segundoDesafio();
			parteIIIdestinoII();

			break;

		} else {
			System.out.println("Você não digitou uma resposta válida!");

		}
	} while (escolhaIIdestinoII != 1 || escolhaIIdestinoII != 2);

}

    
    // ------------------------------------- Partes III  -------------------------------------------------------------------

    static void parteIIIdestinoI() throws Exception {

        System.out.println("Cheguei na parte 3");

    }

    static void parteIIIdestinoII() throws Exception {
        
        System.out.println("Cheguei na parte 3");

    }

    // ------------------------------------- Partes IV  -------------------------------------------------------------------

    // ------------------------------------- Partes V ( final)  -------------------------------------------------------------------



    // ------------------------------------- INSTRUÇÕES -------------------------------------------------------------------
    static void instrucoes() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu, temp_narrativa = 80;

        Console("\n O Jogo baseado no modo RPG Textual é uma troca de mensagens em que o jogador move a trama do ponto de vista do seu personagem atráves de uma pergunta respondida.\r\n\n A cada pergunta respondida o jogo dará opções de caminhos para explorar.\r\n\n Ou seja, Mantenha total atenção na hora de responder.\r\n",
                TimeUnit.MILLISECONDS, temp_narrativa);
        Console("\n O objetivo é conseguir o maior número de pontos através das respostas dos desafios, e assim, conquistando territórios até chegar no Trono de Ferro."
                + "\n Não é possível morrer em `Game of Thrones`, pois o intuito é incentivar a pessoa que está em um processo de aprendizagem, porém, o destino do jogador depende de seus próprios erros e acertos. "
                + "\n Sempre será possível chegar em um final, porém, ele pode não ser o melhor destino..."
                + "\n Winter is Coming!"
                + "  ", TimeUnit.MILLISECONDS, temp_narrativa);

        do {
            System.out.println();
            System.out.println("\n2 - Retornar ao menu");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 2) {
                menu();
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolha_menu != 2);
    }
    // ------------------------------------- CRÉDITOS -------------------------------------------------------------------

    static void creditos() throws Exception {
        Scanner entrada = new Scanner(System.in);
        int escolhaMenu, temp_narrativa = 80;

        Console("\n\n</> Desenvolvedores </>\n\n-> Ana \n-> Barbara \n-> Luana \n-> João Vitor",
                TimeUnit.MILLISECONDS, temp_narrativa);

        do {
            System.out.println();
            System.out.println("\n2 - Retornar ao menu");
            escolhaMenu = entrada.nextInt();
            if (escolhaMenu == 2) {
                menu();
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolhaMenu != 2);
    }
    // ------------------------------------- FUNÇÕES -------------------------------------------------------------------

    public static void Console(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }
}