package jp.co.rakus.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 価格を表示するためのコントローラー.
 * @author yume.hirata
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private ServletContext application;
	
	/**
	 * 入力画面を表示する.
	 * @return
	 */
	@RequestMapping("/")
	public String toInput() {
		return "buyGoods";
	}
	
	@RequestMapping("/input")
	public String input(String goods1,String goods2,String goods3) {
		
		int g1 = Integer.parseInt(goods1);
		int g2 = Integer.parseInt(goods2);
		int g3 = Integer.parseInt(goods3);
		
		int noTax = (g1+g2+g3)/3;
		int taxInc = (int)((g1+g2+g3)/3*1.08);
		
		application.setAttribute("noTax", new Integer(noTax));
		application.setAttribute("taxInc", new Integer(taxInc));
		
		return "totalPrice";
	}

}
