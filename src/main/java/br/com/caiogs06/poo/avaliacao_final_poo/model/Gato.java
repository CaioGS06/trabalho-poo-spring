package br.com.caiogs06.poo.avaliacao_final_poo.model;

// "extends Animal" -> Herança
// Gato É-UM (IS-A) Animal.
public class Gato extends Animal {

  // Construtor que chama o construtor da classe-mãe (super)
  public Gato(String nome, int idade) {
    super(nome, idade);
  }

  // @Override -> Sobrescrita
  // Implementação específica do "fazerBarulho" para Gato.
  @Override
  public String fazerBarulho() {
    return "Miau!";
  }
}