import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Seja bem-vindo à Ilha Misteriosa! Uma terra repleta de segredos, perigos e, quem sabe, recompensas inimagináveis.");
        System.out.println("No coração dessa ilha, dizem os antigos, estar escondido um grande tesouro, mas cuidado... nem todos que vieram antes de você tiveram a mesma sorte.");
        System.out.println("Alguns encontraram riquezas, enquanto outros, apenas lama e decepção.");
        System.out.println("Sua missão é simples: fazer as escolhas certas para encontrar o tesouro.");
        System.out.println("Caso não faça uma boa escolha, poderá perder ao meio do caminho.");
        System.out.println("Agora, aventureiro, para qual lado deseja seguir? Escolha sabiamente...");
        System.out.println("Digite 'Esquerdo' ou 'Direito':");

        String escolha = in.nextLine();

        while (!escolha.equalsIgnoreCase("esquerdo") && !escolha.equalsIgnoreCase("direito")) {
            System.out.println("Digite 'Esquerdo' ou 'Direito':");
            escolha = in.nextLine();
        }

        if (escolha.equalsIgnoreCase("direito")) {
            System.out.println("Você segue as pegadas, que se tornam cada vez mais frequentes, até que você chega a uma clareira com uma construção antiga.");
        }

        else  {
            System.out.println("Você entra na floresta densa e misteriosa, mas logo é cercado por estranhos sons de criaturas desconhecidas.");
        }

        System.out.println("Após algumas horas de caminhada, você é surpreendido por uma criatura selvagem.");
        System.out.println("Ela bloqueia o caminho. Você pode escolher lutar contra ela ou tentar distrair a criatura e fugir.");
        System.out.println("Digite 'Lutar' ou 'Fugir':");

        escolha = in.nextLine();

        while (!escolha.equalsIgnoreCase("Lutar") && !escolha.equalsIgnoreCase("Fugir")) {
            System.out.println("Digite 'Lutar' ou 'Fugir':");
            escolha = in.nextLine();
        }


        if (escolha.equalsIgnoreCase("lutar")) {
            System.out.println("Você decide enfrentar a criatura em combate! Prepare-se para lutar!");
            System.out.println("Parabéns, você derrotou a criatura após uma batalha árdua.");
        }

        else  {
            System.out.println("Tente distrair a criatura com um objeto que você encontrou e corra para se salvar.");
            System.out.println("A criatura se distraiu, fuja antes que ela te veja e vá atrás de você.");
        }

        System.out.println("Ao seguir mais adiante, você encontra uma caverna antiga. Na entrada, há um enigma escrito em uma pedra.");
        System.out.println("O enigma diz: 'Eu sou leve como uma pena, mas ninguém pode me segurar por muito tempo. O que sou eu?'");
        System.out.println("Digite sua resposta (Ar, Água ou Sombras):");

        escolha = in.nextLine();
        while (!escolha.equalsIgnoreCase("ar") && !escolha.equalsIgnoreCase("água") && !escolha.equalsIgnoreCase("sombras")) {
            System.out.println("Digite sua resposta (Ar, Água ou Sombras):");
            escolha = in.nextLine();
        }

        if (escolha.equalsIgnoreCase("ar")) {
            System.out.println("Correto! A porta da caverna se abre e você pode continuar.");
        }

        else {
            System.out.println("Errado! A caverna permanece fechada e você decide voltar.");
            return;
        }

        System.out.println("No caminho, você encontra um viajante ferido, pedindo por ajuda. Ele diz que conhece um atalho para o tesouro.");
        System.out.println("Você pode ajudá-lo, mas isso pode te atrasar. O que você faz?");
        System.out.println("Digite 'Ajudar' ou 'Ignorar':");

        escolha = in.nextLine();
        while (!escolha.equalsIgnoreCase("ajudar") && !escolha.equalsIgnoreCase("ignorar")) {
            System.out.println("Digite 'Ajudar' ou 'Ignorar':");
            escolha = in.nextLine();
        }

        if (escolha.equalsIgnoreCase("Ajudar")) {
            System.out.println("Muito bem! Sua alma boa em ajudar ao próximo deu resultado, o Viajante não era mais uma armadilha e realmente o ajudou com um atalho.");
        }

        else {
            System.out.println("Você não ajudou o viajante e acabou por se perder no caminho e depara-se a uma mata onde não consegue sair.");
            return;
        }

        System.out.println("Ao chegar perto do fim de sua jornada, você encontra uma porta dourada trancada.");
        System.out.println("Perto dela, há um pedestal com três chaves de cores diferentes: ");
        System.out.println("Uma de ouro, uma de prata e uma de bronze. ");
        System.out.println("Qual delas você escolherá?");

        escolha = in.nextLine();
        while (!escolha.equalsIgnoreCase("ouro") && !escolha.equalsIgnoreCase("prata") && !escolha.equalsIgnoreCase("bronze")) {
            System.out.println("Escolha entre Ouro, Prata ou Bronze:");
            escolha = in.nextLine();
        }

        if (escolha.equalsIgnoreCase("Ouro")) {
            System.out.println("A porta se abre, revelando...");
            System.out.println("Você ganhou LAMA!");
        }

        else if (escolha.equalsIgnoreCase("Prata")) {
            System.out.println("A porta se abre, revelando...");
            System.out.println("Você ganhou mais ARMADILHAS!");
        }

        else {
            System.out.println("PARABÉNS! Você encontrou o TESOURO!");
        }


        System.out.println("Obrigado por jogar! Sua aventura termina aqui.");

        in.close();
    }
    }