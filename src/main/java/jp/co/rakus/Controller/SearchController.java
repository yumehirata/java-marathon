package jp.co.rakus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;
import jp.co.rakus.repository.UserRepository;

/**
 * DBの情報を表示させるコントローラー.
 * 
 * @author yume.hirata
 *
 */
@Controller
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	UserRepository repository;
	
	/**
	 * 入力画面を表示する.
	 * 
	 * @return	入力画面
	 */
	@RequestMapping("/")
	public String toInput() {
		return "userInfoSearch";
	}
	
	/**
	 * 情報を出力する.
	 * 
	 * @param id	検索のキーとなるユーザーのid
	 * @param model	出力用の変数
	 * @return	出力画面
	 */
	@RequestMapping("/input")
	public String input(Integer id,Model model) {
		
		User user = repository.load(id);
		model.addAttribute("user",user);
		
		return "userInfoView";
	}

}
