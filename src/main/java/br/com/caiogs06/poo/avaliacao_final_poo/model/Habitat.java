package br.com.caiogs06.poo.avaliacao_final_poo.model;

import java.util.ArrayList;
import java.util.List;

public class Habitat {

  private String nome; // Ex: "Viveiro dos Felinos", "Canil"

  // --- RELACIONAMENTO HAS-MANY ---
  // Um Habitat TEM-MUITOS Animais.
  // A lista de animais é um atributo do Habitat.
  private List<Animal> animais;

  public Habitat(String nome) {
    this.nome = nome;
    // Inicializa a lista para evitar NullPointerException
    this.animais = new ArrayList<>();
  }

  // Método para adicionar um animal ao habitat
  public void adicionarAnimal(Animal animal) {
    this.animais.add(animal);
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  // Getter para a lista de animais
  public List<Animal> getAnimais() {
    return animais;
  }
}