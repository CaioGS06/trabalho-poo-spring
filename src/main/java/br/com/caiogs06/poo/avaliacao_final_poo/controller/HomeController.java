package br.com.caiogs06.poo.avaliacao_final_poo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.caiogs06.poo.avaliacao_final_poo.AvaliacaoFinalPooApplication;
import br.com.caiogs06.poo.avaliacao_final_poo.model.Cachorro;
import br.com.caiogs06.poo.avaliacao_final_poo.model.Gato;
import br.com.caiogs06.poo.avaliacao_final_poo.model.Habitat;

@Controller
public class HomeController {

  private final AvaliacaoFinalPooApplication avaliacaoFinalPooApplication;

  HomeController(AvaliacaoFinalPooApplication avaliacaoFinalPooApplication) {
    this.avaliacaoFinalPooApplication = avaliacaoFinalPooApplication;
  }

  @GetMapping("/")
  public String index(Model model) {

    // 1. Criar os habitats
    Habitat canil = new Habitat("Canil dos Cães");
    Habitat viveiroFelinos = new Habitat("Viveiro dos Felinos");

    // 2. Adicionar animais aos seus habitats (HAS-MANY)
    canil.adicionarAnimal(new Cachorro("Rex", 5));
    canil.adicionarAnimal(new Cachorro("Toby", 3));

    viveiroFelinos.adicionarAnimal(new Gato("Mimi", 2));

    // 3. Criar a lista de habitats
    List<Habitat> habitats = new ArrayList<>();
    habitats.add(canil);
    habitats.add(viveiroFelinos);

    // 4. Enviar a lista de HABITATS para o HTML
    model.addAttribute("listaDeHabitats", habitats);

    return "index";
  }
}