package br.com.alura.mvc.mudi.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNome("Apple iPhone 14");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/618Bb+QzCmL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B0BDJBCZHV/ref=redir_mobile_desktop?_encoding=UTF8&aaxitk=3d49e84b30835a39c7e92a007535032c&content-id=amzn1.sym.11e51694-fe62-4569-997c-cd4f71dfcc23%3Aamzn1.sym.11e51694-fe62-4569-997c-cd4f71dfcc23&hsa_cr_id=7118233130601&pd_rd_plhdr=t&pd_rd_r=1ee88705-817a-4b4f-b3d0-5d05a2d5c78c&pd_rd_w=WeMJf&pd_rd_wg=xvglB&qid=1669688821&ref_=sbx_be_s_sparkle_mcd_asin_1_img&sr=1-2-9e67e56a-6f64-441f-a281-df67fc737124");
		pedido.setDescricao("Celular Iphone");
		pedido.setDataEntrega(LocalDate.now());
//		pedido.setValorNegociado(BigDecimal.valueOf(1250));
		
		List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido, pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
