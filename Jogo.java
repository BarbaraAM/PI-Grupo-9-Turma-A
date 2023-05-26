/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

    // variavel contador
    static int numTerritorios = 0; 

    public static void main(String[] args) throws Exception {


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
                " `::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.'");

        Console( "\n \n Varys - Bem vinda novamente a Westeros, Daenerys Targaryen, você provavelmente não se lembra, mas foi aqui em Pedra do Dragão onde você nasceu.");
        Console("\n \n Daenerys Targaryen - Depois de tudo que passamos e sofremos finalmente estamos aqui. \n Agora, precisamos conquistar o Trono de Ferro, não podemos perder tempo.");

        menu();
        System.out.println(" >>>>>> Placar Final : " + numTerritorios);
    }

    // ------------------------------------------------------- MENU -------------------------------------------------------
    static void menu() throws Exception {
        int escolhaMenu;

        System.out.println("\n\n..:: Game of Thrones ::.. \n\n1 - Jogar \n2 - Instruções\n3 - Créditos \n4 - Sair");

        do {
            Scanner entrada = new Scanner(System.in);
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


        Console("\n Em meio a uma batalha pelo Trono de Ferro, Daenerys Targaryen recebe visitas que podem mudar completamente o rumo dos acontecimentos. Olenna Tyrell, em busca de vingança contra Cersei Lannister, e Ellaria Sand com as Serpentes da Areia, ambas com o mesmo objetivo, se unem a Daenerys em uma reunião de conselho. "
                + "\n\n Daenerys, olhando para as duas mulheres, pergunta com curiosidade: \n - O que traz vocês duas até aqui? E como podemos ser úteis umas às outras?");

        Console("\n\n Olenna responde com sagacidade: \n - Eu quero vingança contra Cersei Lannister, mas estou ciente de que sozinha não tenho força para derrubá-la. Você, Daenerys, é uma líder poderosa com um exército forte. Sei que podemos ajudar uma a outra.");

        Console("\n\n Ellaria acrescenta: \n - Eu também quero vingança contra Cersei Lannister, ela assassinou meu amado Oberyn. Juntos, podemos acabar com o reinado dela e colocar um fim em sua crueldade.");

        Console("\n\n Daenerys olha para as duas mulheres e decide que pode contar com elas para vencer a guerra: \n - Vocês têm meu apoio. Juntas, podemos derrotar Cersei Lannister e colocar fim à sua tirania.");

        Console("\n\n Em seguida, a reunião de conselho começa, e Daenerys ouve com atenção as sugestões de seus aliados sobre o que fazer em relação ao exército Lannister que está na região de Correrrio.");

        Console("\n\n Olenna argumenta: \n - Atacar os Lannisters agora é a melhor opção. Não podemos deixá-los ganhar mais apoio e poder. Se não agirmos agora, podemos estar perdidos."
                + "Ellaria, no entanto, oferece um ponto de vista diferente: \n - Poupar recursos agora é a melhor opção. CorreRio não é uma prioridade agora, e precisamos nos concentrar no que é realmente importante: acabar com o reinado de Cersei Lannister.");

        Console("\n\n - [1] Poupar Recursos ou [2] Atacar Território!");

        int escolha;

        do {
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();
        
            if (escolha == 1) {
                numTerritorios += 20;

                Console("Sábia decisão, poupar recursos te fez adquirir 20 pontos! \n seu número de territórios permanece intacto. \n placar: " + numTerritorios);

                primeiroDesafio();
                parteIIdestinoI();
                break;
            } else if (escolha == 2) {
                numTerritorios += 10;

                Console("Decisão importante, porém, existem custos nas guerras, então atacar o território te fez receber apenas 10 pontos! \n seu número de territórios permanece intacto. \n placar: "  + numTerritorios);

                primeiroDesafio();
                parteIIdestinoII();

                break;
            } else {
                System.out.println("Você não digitou uma resposta válida!");
            }
            
        } while (escolha != 1 && escolha != 2);
       
    }

    // ------------------------------------- Partes II  -------------------------------------------------------------------
    static void parteIIdestinoI() throws Exception {
        Console("\n Passaram-se os dias e cada vez mais tropas chegam ao acampamento. "
                + "\n\n Contente com o exército aumentando, Daenerys decide fazer uma festa ao estilo Dothraki, povo que apoiou o início de sua jornada como rainha.");

        Console("\n\n Com todos alegres, dançando, cantando e comendo em volta da fogueira, a herdeira do trono de ferro passa a temer o que está por vir."
                + "\n Afinal, em uma guerra, não sabemos até quando os bons momentos irão durar.");

        Console("\n\n Durante a festa, Daenerys percebe a ausência de Olenna e vai em busca da aliada.");

        Console("\n\n Ao ver a mulher sentada em frente ao lago, Daenerys questiona:\n - O que está havendo, Olenna?");

        Console("\n\n Olenna responde: \n - Recebi informações de que Cersei está reunindo tropas, deveríamos ter atacado quando tivemos oportunidade.");

        Console("\n\n Daenerys reafirma a sua decisão: \n - Com os recursos que conseguimos e as tropas que se aproximam, poderemos atacá-los em brev…");

        Console("\n\n Daenerys é interrompida com gritos e fumaça, sem entender se levanta, quando o cavaleiro Sor Jorah, seu protetor, aparece puxando-a e correndo."
                + "\n\n Seguidos por Olenna, param atrás de uma das barracas e Jorah explica: \n Estamos sendo atacados pelo leste, enviei uma tropa para o combate, temos que nos preparar para partir.");

        Console("\n\n Daenerys então pergunta: \n - Qual o tamanho da força ofensiva? Estamos em grande número, precisamos pensar melhor.");

        Console("\n\n Então Olenna aconselha: \n - Devemos retaliar enquanto podemos! Fomos pegos de surpresa, mas não despreparados, minhas tropas estão a postos no perímetro norte, podemos atacar pelas laterais.");

        Console("\n\n - [1] Partir ou [2] Retaliar!");

		int escolha;
		do {
            Scanner entrada = new Scanner(System.in);
			escolha = entrada.nextInt();

			if (escolha == 1) {
				numTerritorios += 10;

				Console("Boa escolha, partir te fez poupar recursos e adquirir 10 pontos! \n Placar: "
						+ numTerritorios);

				segundoDesafio();
				parteIIIdestinoI();
               
				break;
			} else if (escolha == 2) {
				numTerritorios += 30;

				Console("Decisão corajosa! As tropas foram contidas e avançamos no território, você recebeu 30 pontos! \n Placar: "
						+ numTerritorios);

				segundoDesafio();
				parteIIIdestinoII();

				break;
			} else {
				System.out.println("Você não digitou uma resposta válida!");
			}
		} while (escolha != 1 || escolha != 2);
	}


    static void parteIIdestinoII() throws Exception {

		int escolha;

		Console("\n Após uma batalha muito árdua e grandes perdas, Daenerys se via no momento de se recompor."
				+ "\n\n Parte do exército se manteve no recém conquistado Correrrio e a herdeira do trono de ferro optou por montar um acampamento no vale entre as montanhas, para poder observar qualquer inimigo que se aproximasse.");

		Console("\n\n Para comemorar a vitória e honrar os que se foram, Daenerys decide fazer uma festa ao estilo Dothraki, povo que apoiou o início de sua jornada como rainha.");

		Console("\n Apesar do luto pelas vidas perdidas, todos comemoram dançando, cantando e comendo em volta da fogueira. " 
		+ "\n\n A herdeira do trono de ferro passa a temer o que está por vir. ");

		Console("\n Afinal, em uma guerra, não sabemos até quando os bons momentos irão durar." 
		+ "\n\n Durante a festa, Daenerys percebe a ausência de Ellaria e vai em busca da aliada.");

		Console("\n\n Ao ver a mulher sentada em frente ao lago, Daenerys questiona: \n - O que está havendo, Ellaria?" 
		+ "\n\n Ellaria responde: \n - Recebi informações de que Cersei está reunindo tropas, deveríamos ter poupado recursos quando tivemos oportunidade.");

		Console("\n\n Daenerys reafirma a sua decisão: \n - Com o território que conseguimos e as tropas que se juntam a nós, estaremos com os recursos suficientes em brev…");

		Console("\n\n Daenerys é interrompida com gritos, sem entender se levanta, quando o cavaleiro Sor Jorah, seu protetor, aparece puxando-a e correndo.");
		
		Console("\n\n  Seguidos por Ellaria, param atrás de uma das barracas e Jorah explica: \n - Estamos sendo atacados pelo leste, os arqueiros a postos estão dando conta por ora, temos que nos preparar para partir.");
		
		Console("\n\n Daenerys então pergunta: \n - Qual o tamanho da força ofensiva? Somos poucos, podemos conter a situação?" 
		+ "\n\n Então Ellaria aconselha: \n - Devemos partir enquanto podemos! \n Fomos pegos de surpresa, estamos despreparados, minhas tropas estão a postos no perímetro norte, podemos escapar pelas laterais.");
		
		Console("\n\n - [1] Partir ou [2] Retaliar!");

		do {
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();

            if (escolha == 1) {
                numTerritorios += 10;

                Console("Boa escolha, partir te fez poupar recursos e adquirir 10 pontos! \n Placar: " + numTerritorios);

                segundoDesafio();
                parteIIIdestinoI();
                break;

            } else if (escolha == 2) {
                numTerritorios += 30;

                Console("Decisão corajosa! As tropas foram contidas e avançamos no território, você recebeu 30 pontos! \n Placar: " + numTerritorios);

                segundoDesafio();
                parteIIIdestinoII();
                break;

            } else {
                System.out.println("Você não digitou uma resposta válida!");
            }
	    } while (escolha != 1 || escolha != 2);
    }

    
    // ------------------------------------- Partes III  -------------------------------------------------------------------

    static void parteIIIdestinoI() throws Exception {
        /*COMEÇO DA HISTORIA DA PARTE 3 DESTINO 1 */
        Console("\n Assim que Daenerys decidi fugir do ataque surpresa de Cersei, a mesma consegue proteger inúmeras vidas de suas tropas que morreriam em batalha. ");
        Console("\n Daenerys passa a ser cada vez mais respeitada por suas sábias decisões no campo de batalha!");
        Console("\n Olenna diz que não deveriam deixar o ataque de surpresa de Cersei de nada e que deveríamos pensar em um plano para atacar Cersei.");
        Console("\n Mas seu cavaleiro Jorah diz que na situação atual o melhor seria economizar recursos, cuidar dos feridos e deixar nossas tropas mais forte!");

        Console("\n\n [1] Atacar Cersei ou [2]Poupar recursos! ");
        /*FINAL DA HISTORIA DA PARTE 3 DESTINO 1 */

        int escolha;
        
        do {
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();

            if (escolha == 1) {
                numTerritorios += 20;
    
                Console("\n Decisão corajosa! As tropas foram derrotadas e avançamos no território, você recebeu 20 pontos! \n Placar: " + numTerritorios);
           
                terceiroDesafio();
                parteIV();
                break;
    
            } else if (escolha == 2) {
                numTerritorios += 10;

                Console("\n Boa escolha, recuar te fez poupar recursos e adquirir 10 pontos! \n Placar: " + numTerritorios);
                    
                terceiroDesafio();
                parteIV();
                break;

            } else {
                System.out.println("Você não digitou uma resposta válida!");
            }
        } while (escolha != 1 || escolha != 2);
    }


    static void parteIIIdestinoII() throws Exception {
        /*COMEÇO DA HISTORIA DA PARTE 3 DESTINO 1 */
        Console("\n Então Daenerys com seu exército decide Retaliar o ataque inimigo, porem seu exército não estava com todas as suas forças, pois acabaram de sair de uma batalha.");
        Console("\n Isso fez com o exército de Cersei que era menor que o exército de Daenerys tivessem o mesmo nível de força, então o menor erro poderia ditar o destino dessa batalha!");
        Console("\n Daenerys percebe que seu cavaleiro Jorah esta lutando contra dois inimigos ao mesmo tempo, e decide ir ajudá-lo, quando de repente escuta um grito e percebe que sua aliada Ellaria está com um ferimento na perna e não consegue se mexer.");
        Console("\n Por isso Daenerys tem que fazer uma escolha, ajudar Jorah que está lutando contra dois inimigos sozinho, ou ajudar Ellaria que está com a perna ferida!");
        Console("\n\n [1] Ajudar Jorah ou [2] Ajudar Ellaria.");

        /*FINAL DA HISTORIA DA PARTE 3 DESTINO 1 */

        int escolha;
        do {
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();

            if (escolha == 1) {
                numTerritorios += 20;
    
                Console("\n Boa escolha, partir te fez poupar recursos e adquirir 20 pontos! \n Placar: " + numTerritorios);
    
                quartoDesafio();
                parteIV();
                break;
    
            } else if (escolha == 2) {
                numTerritorios += 10;
    
                Console("\n Decisão corajosa! As tropas foram contidas e avançamos no território, você recebeu 10 pontos! \n Placar: " + numTerritorios);
    
                quartoDesafio();
                parteIV();
                break;
    
            } else {
                System.out.println("Você não digitou uma resposta válida!");
            }
        } while (escolha != 1 || escolha != 2);
    }
    // ------------------------------------- Partes IV  -------------------------------------------------------------------

    static void parteIV() throws Exception {

        Console("\n\n Com seu exército exausto e faminto, Daenerys iniciou uma busca desesperada por alimentos e por um refúgio adequado para que todos pudessem se recuperar. ");

        Console("\n\n Após dias de marcha exaustiva, Sir Jorah avistou uma subida protegida por um rio, um local perfeito para proteger o grupo e proporcionar segurança natural.");

        Console("\n\n Determinada a garantir a defesa, Daenerys organizou os arqueiros em pontos estratégicos para vigiar o confronto e estabeleceu um cronograma de patrulhas para monitorar a região. ");

        Console("\n\n Enquanto alguns soldados saíam para caçar e pescar, outros guardavam incansavelmente para montar o acampamento. ");

        Console("\n\n Com tudo ocorrendo conforme o planejado, Daenerys convocou uma reunião com Ellaria, Olenna e Sir Jorah para discutir o golpe final para conquistar o Trono de Ferro.");

        Console("\n\n Daenerys declarou: "
                + "\n - Chegou a hora de trazermos os dragões. Não podemos atacar a Capital sem eles. ");

        Console("\n\n Ellaria expressou suas preocupações: "
                + "\n - Eu acredito que os dragões podem nos causar problemas. São animais perigosos, nossas tropas podem se assustar!");

        Console("\n\n Sir Jorah ponderou com sabedoria:"
                + " \n - Os dragões simbolizam a força do novo reinado, mas devemos tratá-los com cautela. Precisamos de mais suprimentos para trazê-los.");

        Console("\n\n Escolha:"
                + " \n [1 ]Trazer os dragões ou [2] Atacar sem dragões ");

        int escolha;

        do {
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();

            if (escolha == 1) {
                numTerritorios += 20;

                Console("\n Decisão corajosa! As tropas foram derrotadas e avançamos no território, você recebeu 20 pontos! \n Placar: "
                        + numTerritorios);

                Console("\n Ellaria e Sir Jorah refletem sobre as palavras da rainha e percebem a inteligência inabalável em seus olhos. ");

                break;
            } else if (escolha == 2) {
                numTerritorios += 0;

                Console("\n Você não teve pontos!  \n Placar: ");


                Console("\n Daenerys reconsidera:"
                        + "\n - Temos força suficiente por terra, tivemos sucesso até aqui, conseguiremos sem os dragões e com a confiança das tropas.");

                break;
            } else {
                System.out.println("\n Você não digitou uma resposta válida!");
            }

        } while (escolha != 1 || escolha != 2);

     
        parteV();

    }


    // ------------------------------------- Partes V ( final)  -------------------------------------------------------------------

    static void parteV() throws Exception {
        
        Console("A proposta de Daenerys de utilizar os territórios conquistados estrategicamente para cercar a capital e invadir por todos os lados foi ouvida com atenção pelos presentes. ");

        Console("\n\n Olenna, uma mulher de grande sagacidade, acrescentou:"
                + "\n - A capital tem um trecho cercado pelo mar. Não temos tropas nem habilidades em batalhas marítimas.");

        Console("\n\n Daenerys respondeu com um sorriso determinado:"
                + "\n - Exatamente, Olenna. Por esse motivo, vou me reunir com Yara e Euron Greyjoy para discutirmos uma aliança nessa guerra.");

        Console("\n\n Ellaria expressou suas preocupações:"
                + "\n - Ouvi rumores de que Cersei recebeu acordos para Euron. No entanto, Yara guarda um forte rancor dos Lannisters e se recusa a apoiá-los.");

        Console("\n\n Sir Jorah, conhecendo a importância de garantir aliados, acrescentou:"
                + " \n - Não queremos os Greyjoys como inimigos. Precisamos chegar a um acordo com eles, pois o contrário pode ser fatal para a nossa causa.");

        Console("\n\n Com o passar dos dias, o exército continua se fortalecendo e se preparando para a batalha final."
                + " \n - Enquanto isso, Daenerys partiu com Drogon, seu dragão mais poderoso, para encontrar os Greyjoys nas Ilhas de Ferro, buscando solidificar uma aliança crucial para o sucesso de sua campanha. ");


                if (numTerritorios <= 60) {
                    desafioFinalI();
                    finalIIparteV();
                } if (numTerritorios > 60 ) {
                    desafioFinalII();
                    finalIparteV();
                }

    }

    static void finalIparteV() throws Exception {
        Console("\n\n Após formar uma aliança com os Greyjoy e conquistar os mares, Daenerys lança um ataque conjunto com suas tropas terrestres e a poderosa frota Greyjoy contra a capital.\n Com o elemento surpresa e a superioridade numérica, eles conseguem romper as defesas inimigas e adentram a cidade. Daenerys lidera suas tropas com destreza, demonstrando coragem e estratégia.");

        Console("\n\n No confronto final, Daenerys enfrenta o atual ocupante do Trono de Ferro, derrotando-o com astúcia e força. A notícia de sua vitória se espalha rapidamente, e o povo dos Sete Reinos começa a aclamá-la como sua nova rainha. Ela é coroada, finalmente tomando posse do Trono de Ferro.");

        Console("\n\n Com o controle da capital e o apoio das principais casas, Daenerys inicia um período de reconstrução e estabilidade nos Sete Reinos. Ela implementa reformas sociais e políticas, garantindo justiça e igualdade para todos. \n A paz começa a ser restabelecida, e a influência dos dragões e do novo reinado de Daenerys é sentida em todo o reino.");

        Console("\n\n Daenerys governa com sabedoria e benevolência, procurando apaziguar as tensões e reconciliar os diferentes povos dos Sete Reinos. Ela se torna uma rainha amada e respeitada, e seu reinado é lembrado como uma era de progresso, justiça e harmonia.");
    }

    static void finalIIparteV()throws Exception {
        Console("\n\n Daenerys, determinada a conquistar o Trono de Ferro, lança um ataque brutal contra a capital. Os dragões são convocados e usados com fúria destrutiva, causando grande devastação na cidade e no exército inimigo.\n No entanto, a batalha se arrasta por semanas, causando um enorme custo humano e material para ambos os lados.");

        Console("\n\n Apesar de sua vitória, a cidade está em ruínas e muitas vidas foram perdidas. Daenerys se senta no Trono de Ferro, mas a alegria de sua conquista é manchada pela destruição e pelo peso das perdas sofridas. \nA população dos Sete Reinos olha para ela com medo e desconfiança, temendo que sua liderança seja marcada por mais violência e tirania.");

        Console("\n\n Enquanto tenta governar, Daenerys enfrenta uma série de rebeliões e resistência por parte das casas nobres e do povo comum, que estão descontentes com seu reinado sangrento. Ela luta para manter o controle e a estabilidade, mas a desconfiança generalizada e o ressentimento persistem.");

        Console("\n\n A reputação de Daenerys como a 'Rainha Quebradora de Correntes' é interpretada de forma negativa, com muitos vendo-a como uma tirana e uma conquistadora implacável. \n A paz e a prosperidade são meras ilusões, e o reinado de Daenerys é marcado por conflitos internos e rebeliões constantes.");

        Console("\n\n Ao final, Daenerys percebe que seu desejo pelo poder custou caro demais. O Trono de Ferro é seu, mas ela governa sobre um reino dilacerado.");
    }

    // ----------------------------------------DESAFIOS MATEMÁTICA----------------------------------------
    static void primeiroDesafio() throws Exception {
        Console("\n\n\n ATENÇÃO! seu primeiro desafio matemático começará em: \n 3 \n 2 \n 1 \n");


        //lista de alternativas
        List<String> alternativas = new ArrayList<>();
        alternativas.add("11000111 e FA.");
        alternativas.add("11100111 e F9.");
        alternativas.add("11010111 e FA.");
        alternativas.add("11000111 e F9.");
        alternativas.add("11100111 e FA.");

        Collections.shuffle(alternativas);

        String respostaCerta = "11000111 e FA.";

        
        do {

            Console("Os números decimais 199 e 250 correspondem, nos sistemas binário e hexadecimal, às seguintes representações: \n");
            //busca a alternativa no do while
            for (int i = 0; i < alternativas.size(); i++) 
                System.out.println("(" + (char)('a' + i) + ") " + alternativas.get(i));
            

            Scanner entrada = new Scanner(System.in);
            String selected = entrada.nextLine();

            switch (selected) {
                case "a" -> {
                    //se alternativa for igual a resposta certa
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

            //Caso a resposta esteja incorreta embaralha de novo
            Collections.shuffle(alternativas);
            System.out.println("Resposta incorreta");
        } while (true);
    }


    static void segundoDesafio() throws Exception {

        Console("\n\n\n ATENÇÃO! Seu segundo desafio matemático começará em: \n 3 \n 2 \n 1 \n");

	
		List<String> alternativas = new ArrayList<>();
		alternativas.add("4 e 8");
		alternativas.add("3 e 6");
		alternativas.add("4 e 12");
		alternativas.add("2 e 4");
		alternativas.add("4 e 6");
		Collections.shuffle(alternativas);

		String respostaCerta = "4 e 8";
		do {
            
			Console("As potências 2² e 2³ correspondem, respectivamente, às seguintes representações: \n");

			for (int i = 0; i < alternativas.size(); i++) {
				System.out.println("(" + (char) ('a' + i) + ") " + alternativas.get(i));
			}

            Scanner entrada = new Scanner(System.in);
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

			// Caso a resposta esteja errada embaralha de novo
			Collections.shuffle(alternativas);
			System.out.println("Resposta incorreta");
		} while (true);
	}


    static void terceiroDesafio() throws Exception {

        Console("\n\n\n ATENÇÃO! Seu terceiro desafio matemático começará em: \n 3 \n 2 \n 1 \n");

        Scanner entrada = new Scanner(System.in);

        List<String> alternativas = new ArrayList<>();

        alternativas.add("x = 9");

        alternativas.add("x = 6");

        alternativas.add("x = 12");

        alternativas.add("x = 4");

        alternativas.add("x = 8");

        // embaralha as alternativas

        Collections.shuffle(alternativas);

        String respostaCerta = "x = 9";

        do {

            Console("Resolva a seguinte equação do primeiro grau com uma incógnita: 4x + 2 = 38  \n");

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

            Collections.shuffle(alternativas);

            System.out.println("Resposta incorreta");

        } while (true);

    }

    static void quartoDesafio() throws Exception {

        Console("\n\n\n ATENÇÃO! Seu quarto desafio matemático começará em: \n 3 \n 2 \n 1 \n");

        Scanner entrada = new Scanner(System.in);

        List<String> alternativas = new ArrayList<>();

        alternativas.add("(x-1) + x + (x + 1) = 150");

        alternativas.add("x + x + x = 50");

        alternativas.add("(x-1) * 2 = 150");

        alternativas.add("3x = 50");

        alternativas.add("x = 50");

        // embaralha as alternativas

        Collections.shuffle(alternativas);

        String respostaCerta = "(x-1) + x + (x + 1) = 150";

        do {

            Console("A soma de três números inteiros consecutivos é igual a 150, qual equação que expressa esse problema? \n");

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

            Collections.shuffle(alternativas);

            System.out.println("Resposta incorreta");

        } while (true);

    }

    
    public static void desafioFinalI() throws Exception {

        Console("\n Agora, o último desafio!\n Será que você será capaz?\n \n");

        Console("\n Seu placar: " + numTerritorios);
        
        List<String> alternativas = new ArrayList<>();
        alternativas.add("26");
        alternativas.add("39");
        alternativas.add("3");
        alternativas.add("13");
        alternativas.add("169");
        Collections.shuffle(alternativas);
    
        String respostaCerta = "13";
    
        do {
            Console("\nQual a Raiz Quadrada de 169 ?\n\n");
    
            for (int i = 0; i < alternativas.size(); i++) 
                System.out.println("(" + (char) ('a' + i) + ") " + alternativas.get(i));
            
            Scanner entrada = new Scanner(System.in);
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

			// Caso a resposta esteja errada embaralha de novo
            Collections.shuffle(alternativas);
            System.out.println("Resposta incorreta");
    
        } while (true);
    }
    
    public static void desafioFinalII() throws Exception {
    
        Console("\n Agora, o último desafio!\n Será que você será capaz? \n \n");

        Console("\n Seu placar: " + numTerritorios);
    
    
        List<String> alternativas = new ArrayList<>();
        alternativas.add("Isaac Newton");
        alternativas.add("Albert Einsten");
        alternativas.add("Pitágoras de Samos");
        alternativas.add("Van Gogh");
        alternativas.add("Leonardo da Vinci");
        Collections.shuffle(alternativas);

        String respostaCerta = "Pitágoras de Samos";
        do {
            Console("\nQuem é considerado o pai da matemática?\n\n");
    
            for (int i = 0; i < alternativas.size(); i++) 
                System.out.println("(" + (char) ('a' + i) + ") " + alternativas.get(i));
    
            Scanner entrada = new Scanner(System.in);
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
    
			// Caso a resposta esteja errada embaralha de novo
            Collections.shuffle(alternativas);
            System.out.println("Resposta incorreta");
        } while (true);
    }

    // ------------------------------------- INSTRUÇÕES -------------------------------------------------------------------
    static void instrucoes() throws Exception {
        int escolha_menu;

        Console("\n O Jogo baseado no modo RPG Textual é uma troca de mensagens em que o jogador move a trama do ponto de vista do seu personagem atráves de uma pergunta respondida.\r\n\n A cada pergunta respondida o jogo dará opções de caminhos para explorar.\r\n\n Ou seja, Mantenha total atenção na hora de responder.\r\n");
        Console("\n O objetivo é conseguir o maior número de pontos através das respostas dos desafios, e assim, conquistando territórios até chegar no Trono de Ferro."
                + "\n Não é possível morrer em `Game of Thrones`, pois o intuito é incentivar a pessoa que está em um processo de aprendizagem, porém, o destino do jogador depende de seus próprios erros e acertos. "
                + "\n Sempre será possível chegar em um final, porém, ele pode não ser o melhor destino..."
                + "\n Winter is Coming!");

        do {
            System.out.println("\n2 - Retornar ao menu");

            Scanner entrada = new Scanner(System.in);
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
        int escolhaMenu;

        Console("\n\n</> Desenvolvedores </>\n\n-> Ana \n-> Barbara \n-> Luana \n-> João Vitor");

        do {
            System.out.println("\n2 - Retornar ao menu");

            Scanner entrada = new Scanner(System.in);
            escolhaMenu = entrada.nextInt();

            if (escolhaMenu == 2) {
                menu();
            } else {
                System.out.println("\nOpção inválida, digite novamente:\n ");
            }
        } while (escolhaMenu != 2);
    }
    // ------------------------------------- FUNÇÕES -------------------------------------------------------------------
    
    // ------------------------------------- PARTE FINAL -------------------------------------------------------------------
    
    public static void Console(String mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            TimeUnit.MILLISECONDS.sleep(5);
        }
    }
}