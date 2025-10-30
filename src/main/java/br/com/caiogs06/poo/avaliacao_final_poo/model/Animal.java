package br.com.caiogs06.poo.avaliacao_final_poo.model;

// public abstract class -> Define uma classe abstrata
public abstract class Animal {

  // private -> Modificador de Acesso.
  // Estes atributos só podem ser acessados de dentro desta classe.
  // Isso é Encapsulamento.
  private String nome;
  private int idade;

  // Construtor
  public Animal(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // --- Getters e Setters ---
  // Métodos públicos para permitir o acesso controlado
  // aos atributos privados.
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  // Método 1: comer() (sem parâmetros)
  // Retorna uma ação padrão
  public String comer() {
    return "Comendo ração padrão...";
  }

  // Método 2: comer(String comida) (com um parâmetro)
  // Mesmo nome "comer", mas assinatura diferente.
  // Retorna uma ação específica
  public String comer(String comida) {
    return "Comendo " + comida + "...";
  }

  // --- Método Abstrato ---
  // Define um método que NÃO tem implementação (corpo).
  // Força todas as classes filhas (concretas) a implementar este método.
  // Isso é parte da Abstração e fundamental para o Polimorfismo.
  public abstract String fazerBarulho();
}