package jp.co.rakus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 名前を表示するためのコントローラー.
 * @author rksuser
 *
 */
@Controller
@RequestMapping("/name")
public class NameReceiveController {
	
	@RequestMapping("/")
	public String toInput() {
		return "inputname";
	}
	
	@RequestMapping("input")
	public String input(String name,Model model) {
		model.addAttribute("name",name);
		return "outputname";
	}

}
