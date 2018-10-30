package jp.co.rakus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;

/**
 * 登録情報を表示するためのコントローラー.
 * @author rksuser
 *
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	@RequestMapping("/")
	public String toinput() {
		return "inputUserInfo";
	}
	
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
