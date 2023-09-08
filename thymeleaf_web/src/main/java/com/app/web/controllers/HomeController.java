package com.app.web.controllers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.models.PedidoModel;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String Home(Model model) {

        PedidoModel pedido = new PedidoModel();
        pedido.setNome("Notebook Dell G7");
        pedido.setValor(300f);
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/61uxHT2J1sL._AC_SX679_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Console-Playstation-ps4-fat-500/dp/B015CYFSSM/ref=sr_1_6?keywords=ps4&qid=1694169511&sr=8-6");
        pedido.setDescricao("Console Playstation 4 ps4 fat 500 gb");

        model.addAttribute("pedidos", pedido);

        // List<PedidoModel> pedidos = Arrays.asList(pedido, pedido, pedido);
        // model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
