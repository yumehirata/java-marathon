package jp.co.rakus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;

/**
 * 登録情報を表示するためのコントローラー.
 * @author yume.hriata
 *
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	/**
	 * 入力画面を表示する.
	 * @return
	 */
	@RequestMapping("/")
	public String toinput() {
		return "inputUserInfo";
	}
	
	/**
	 * 入力情報を受け取って出力画面に渡す.
	 * @param name	ユーザーの名前
	 * @param age	ユーザーの年齢
	 * @param address	ユーザーの住所
	 * @param model	受け渡すための変数
	 * @return
	 */
	@RequestMapping("/input")
	public String input(String name,String age,String address,Model model) {
		User user = new User();
		
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		user.setAddress(address);
		
		model.addAttribute("user",user);
		return "outputUserInfo";
	}
}
