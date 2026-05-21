// ==========================================
// CLASSE BASE: ANIMAL (Slide 29)
// ==========================================
class Animal {
    protected String nome;
    protected double comprimento;
    protected int patas;
    protected String cor;
    protected String ambiente;
    protected double velocidadMedia; // O seu VS Code pode estar esperando 'velocidadMedia' ou 'velocidadeMedia'. Para garantir, usamos velocidadeMedia em todo o código.
    protected double velocidadeMedia; 

    // Construtor Corrigido
    public Animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia; // Corrigido aqui para evitar o erro do terminal!
    }

    public void dados() {
        System.out.println("Animal: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento + " cm");
        System.out.println("Patas: " + this.patas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade: " + this.velocidadeMedia + " m/s");
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getComprimento() { return comprimento; }
    public void setComprimento(double comprimento) { this.comprimento = comprimento; }
    public int getPatas() { return patas; }
    public void setPatas(int patas) { this.patas = patas; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public String getAmbiente() { return ambiente; }
    public void setAmbiente(String ambiente) { this.ambiente = ambiente; }
    public double getVelocidadeMedia() { return velocidadeMedia; }
    public void setVelocidadeMedia(double velocidadeMedia) { this.velocidadeMedia = velocidadeMedia; }
}

// ==========================================
// CLASSE FILHA: PEIXE (Slide 30)
// ==========================================
class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, double comprimento, String cor, String ambiente, double velocidadeMedia, String caracteristica) {
        super(nome, comprimento, 0, cor, ambiente, velocidadeMedia); 
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() { return caracteristica; }
    public void setCaracteristica(String caracteristica) { this.caracteristica = caracteristica; }

    public void dadosPeixe() {
        super.dados();
        System.out.println("Característica: " + this.caracteristica);
    }
}

// ==========================================
// CLASSE FILHA: MAMÍFERO (Slide 31)
// ==========================================
class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidadeMedia, String alimento) {
        super(nome, comprimento, patas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() { return alimento; }
    public void setAlimento(String alimento) { this.alimento = alimento; }

    public void dadosMamifero() {
        super.dados();
        System.out.println("Alimento: " + this.alimento);
    }
}

// ==========================================
// CLASSE PRINCIPAL COM O MAIN (Slides 32 a 36)
// ==========================================
public class TestarAnimais {
    public static void main(String[] args) {
        // Criando os animais com a massa de testes exata dos slides
        Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0, "Grama");
        Peixe tubarao = new Peixe("Tubarão", 300, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
        Mamifero urso = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5, "Mel");

        // Executando o relatório
        System.out.println("=== RELATÓRIO DO ZOOLÓGICO ===");
        System.out.println("-----------------------------------");
        camelo.dadosMamifero();
        System.out.println("-----------------------------------");
        tubarao.dadosPeixe();
        System.out.println("-----------------------------------");
        urso.dadosMamifero();
        System.out.println("-----------------------------------");
    }
}''