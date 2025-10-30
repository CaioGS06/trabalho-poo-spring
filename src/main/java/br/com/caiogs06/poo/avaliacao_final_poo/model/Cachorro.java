package br.com.caiogs06.poo.avaliacao_final_poo.model;

// "extends Animal" -> Define a Herança.
// Cachorro É-UM (IS-A) Animal.
public class Cachorro extends Animal {

  // Construtor que chama o construtor da classe-mãe (super)
  public Cachorro(String nome, int idade) {
    super(nome, idade);
  }

  // @Override -> Anotação que indica Sobrescrita de método.
  // Estamos implementando o método abstrato "fazerBarulho"
  // que foi definido na classe Animal.
  @Override
  public String fazerBarulho() {
    return "Au au!";
  }
}