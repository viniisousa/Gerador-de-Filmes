import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String[] genre = {"Ação", "Comédia", "Drama", "Terror", "Ficção Científica", "Fantasia"};
        int age;

        //Início do Programa
        JOptionPane.showMessageDialog(null, "Vamos fazer um filme", "Gerador de Filmes", 1);

        //Nome do usuário
        String name = JOptionPane.showInputDialog(null, "Digite o seu nome completo: ", "Gerador de Filmes", 1);

        //Nome do filme
        String movieName = JOptionPane.showInputDialog(null, "Digite um nome para o seu filme: ", "Gerador de Filmes", 1);

        //Personagem principal
        String protagonist = JOptionPane.showInputDialog(null,  "Digite o nome do personagem principal: ", "Gerador de Filme", 1);

        //Idade
        String ageString = JOptionPane.showInputDialog(null, "Quantos anos ele(a) tem?: ", "Gerador de Filme", 1);
        age = Integer.parseInt(ageString);

        //Característica marcante
        String feature = JOptionPane.showInputDialog(null, "Dica uma característica marcante dele(a) (professor, detetive, mago, rei, etc.): ", "Gerador de Filme", 1);

        //Ambientação
        String atmosphere = JOptionPane.showInputDialog(null,  "Onde se passa o filme? (lugar ou época, como \"futuro distante\" ou \"cidade pequena nos anos 80\")", "Gerador de Filme", 1);

        //Conflito
        String conflict = JOptionPane.showInputDialog(null,  "Qual o conflito principal? (algo como \"um herói precisa salvar o mundo\" ou \"alguém descobre um segredo do passado\")", "Gerador de Filme", 1);

        //Climax ou reviravolta
        String climax = JOptionPane.showInputDialog(null,  "Qual o climax ou reviravolta? (algum evento impactante no terceiro ato)", "Gerador de Filme", 1);

        //Gênero do filme
        int choose = JOptionPane.showOptionDialog(null,  name + ", escolha o gênero do filme: ", "Gerador de Filmes", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, genre, genre[0]);

        switch (choose) {
            case 0:
                JOptionPane.showMessageDialog(null, movieName + ": Filme de ação criado por " + name, "Gerador de Filmes", 1);

                JOptionPane.showMessageDialog(null, "Em " + atmosphere + ", " + protagonist + ", um(a) " + feature + " de " + age + " anos, se vê diante de\num dilema mortal: " + conflict + ". Ele(a) precisa lutar contra o tempo e enfrentar inimigos implacáveis.\nNo ponto mais alto da batalha, " + climax + ", e isso surpreende a todos,\nlevando a um final de tirar o fôlego.", "Gerador de Filmes", 1);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, movieName + ": Filme de comédia criado por " + name, "Gerador de Filmes", 1);

                JOptionPane.showMessageDialog(null, "Na peculiar cidade de " + atmosphere + ", " + protagonist + ", um(a) " + feature + " de " + age + " anos,\nse mete em uma enrascada quando " + conflict + ". Ao lado de seus amigos excêntricos, ele(a) embarca\nem uma sequência de situações hilárias, até que... " + climax + "! E isso uda completamente o rumo da\nhistória, resultando em um final que ninguém poderia prever.", "Gerador de Filmes", 1);

                break;
            case 2:
                JOptionPane.showMessageDialog(null, movieName + ": Filme de drama criado por " + name, "Gerador de Filmes", 1);

                JOptionPane.showMessageDialog(null, "Em" + atmosphere + ", " + protagonist + " de " + age + " anos está passando por um momento difícil.\nMarcado(a) por ser " + feature + ", ele(a) precisa lidar com " + conflict + " que ameaça destruir tudo\no que conhece. No clímax, " + climax + ", ele(a) se sente obrigado(a) a confrontar verdades dolorosas,\nculminando em um final que desafia suas convicções.", "Gerador de Filmes", 1);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, movieName + ": Filme de terror criado por " + name, "Gerador de Filmes", 1);

                JOptionPane.showMessageDialog(null, "Depois de se mudar para " + atmosphere + ", " + protagonist + " começa a perceber que algo não está certo.\nEstranhas ocorrências envolvendo um elemento sobrenatural deixam todos em pânico, e logo eles\ndescobrem que o passado sombrio de " + atmosphere + " está voltando à tona. Agora, " + protagonist + " deve\nencontrar uma maneira de escapar antes que seja tarde demais.", "Gerador de Filmes", 1);
                break;
            case 4:
                int year;

                String yearString = JOptionPane.showInputDialog(null, "Digite o ano em que o filme se passa: ", "Gerador de Filmes", 1);
                year = Integer.parseInt(yearString);

                String threat = JOptionPane.showInputDialog(null, "Dê um nome para o antagonista/ameaça: ", "Gerador de Filmes", 1); 

                JOptionPane.showMessageDialog(null, movieName + ": Filme de ficção científica criado por " + name, "Gerador de Filmes", 1);

                JOptionPane.showMessageDialog(null, "No ano " + year + ", a humanidade está à beira da extinção. " + protagonist + ", um(a) " + feature + ",\ndescobre um segredo capaz de salvar o planeta. No entanto, com " + threat + " no seu caminho,\nele(a) terá que decidir entre salvar o futuro ou proteger aqueles que ama.", "Gerador de Filmes", 1);
                break;
            case 5:
                String kingdom = JOptionPane.showInputDialog(null, "Dê um nome para o reino: ", "Gerador de Filmes", 1); 

                String artifact = JOptionPane.showInputDialog(null, "Diga um artefato para encontrar: ", "Gerador de Filmes", 1); 

                String friendName = JOptionPane.showInputDialog(null, "Dê um nome para seu amigo/grupo de companheiros: ", "Gerador de Filmes", 1); 

                JOptionPane.showMessageDialog(null, movieName + ": Filme de fantasia criado por " + name, "Gerador de Filmes", 1);

                JOptionPane.showMessageDialog(null, "Em um reino distante chamado " + kingdom + ", " + protagonist + ", um(a) " + feature + ",\nembarca em uma jornada épica para encontrar " + artifact + " que poderá salvar seu povo. Com a ajuda de\n" + friendName + ", ele(a) enfrentará perigos indescritíveis e inimigos poderosos,\nenquanto descobre o verdadeiro poder dentro de si.", "Gerador de Filmes", 1);
                break;
        }
    }
}