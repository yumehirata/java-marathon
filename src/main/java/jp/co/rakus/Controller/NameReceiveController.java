package jp.co.rakus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 入力結果を受け渡すコントローラー.
 * 
 * @author yume.hirata
 *
 */
@Controller
@RequestMapping("/name")
public class NameReceiveController {
	
	
	/**
	 * 入力画面を表示する.
	 * 
	 * @return	入力画面
	 */
	@RequestMapping("/")
	public String toInput() {
		return "inputname";
	}
	
	
	/**
	 * 出力画面を表示する.
	 * @param name	入力された名前
	 * @param model	出力用の変数
	 * @return	出力画面
	 */
	@RequestMapping("/input")
	public String input(String name,Model model) {
		model.addAttribute("name",name);
		return "outputname";
	}

}
