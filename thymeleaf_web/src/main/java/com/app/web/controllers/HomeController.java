package com.app.web.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.web.models.PedidoModel;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String Home(Model model) {
        /** Dados fake  */
            PedidoModel pedido = new PedidoModel();
            pedido.setNome("Notebook Dell G7");
            pedido.setValor(300f);
            pedido.setUrlImagem("https://m.media-amazon.com/images/I/61uxHT2J1sL._AC_SX679_.jpg");
            pedido.setUrlProduto("https://www.amazon.com.br/Console-Playstation-ps4-fat-500/dp/B015CYFSSM/ref=sr_1_6?keywords=ps4&qid=1694169511&sr=8-6");
            pedido.setDescricao("Console Playstation 4 ps4 fat 500 gb");

    
        // List<PedidoModel> pedidos = Arrays.asList(pedido, pedido, pedido);
        // model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
