// ==========================================
// 1. CLASSE ABSTRATA: VEICULO
// ==========================================
abstract class Veiculo {
    // Atributos privados
    private String marca;
    private String modelo;

    // Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstrato (não tem corpo {}, as filhas são obrigadas a implementar)
    public abstract double calcularConsumo();

    // Método concreto
    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.printf("Consumo Estimado: %.2f km/l%n", this.calcularConsumo());
    }

    // Métodos getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}

// ==========================================
// 2.a) SUBCLASSE CONCRETA: CARRO
// ==========================================
class Carro extends Veiculo {
    private double cilindrada;

    public Carro(String marca, String modelo, double cilindrada) {
        super(marca, modelo); // Inicializa os atributos do Pai
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularConsumo() {
        return 15.0 - (this.cilindrada / 200.0);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + this.cilindrada + " L");
    }
}

// ==========================================
// 2.b) SUBCLASSE CONCRETA: MOTO
// ==========================================
class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularConsumo() {
        return 30.0 - (this.cilindradas / 100.0);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + this.cilindradas + " cc");
    }
}

// ==========================================
// 2.c) SUBCLASSE CONCRETA: CAMINHAO
// ==========================================
class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, double capacidadeCarga) {
        super(marca, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularConsumo() {
        return 5.0 - (this.capacidadeCarga / 1000.0);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de Carga: " + this.capacidadeCarga + " kg");
    }
}

// ==========================================
// 3. CLASSE PRINCIPAL COM O MAIN
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("=== GESTÃO DE VEÍCULOS ===");
        
        // Instanciando um veículo de cada tipo
        Carro meuCarro = new Carro("Toyota", "Corolla", 2000); // 2000 cilindradas
        Moto minhaMoto = new Moto("Honda", "CB 500", 500);     // 500 cc
        Caminhao meuCaminhao = new Caminhao("Volvo", "FH 540", 1500); // 1500 kg de carga

        // Exibindo as informações e consumos de cada um
        System.out.println("\n--- Informações do Carro ---");
        meuCarro.exibirInformacoes();

        System.out.println("\n--- Informações da Moto ---");
        minhaMoto.exibirInformacoes();

        System.out.println("\n--- Informações do Camião ---");
        meuCaminhao.exibirInformacoes();
        System.out.println("-----------------------------");
    }
}