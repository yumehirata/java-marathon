package jp.co.rakus.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 計算した結果を受け渡すコントローラー.
 * 
 * @author yume.hirata
 *
 */
@Controller
@RequestMapping("/calc")
public class CalcController {

	@Autowired
	private HttpSession session;

	/**
	 * 入力画面を表示.
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String toInput() {
		return "inputValue";
	}

	/**
	 * 入力内容を出力画面に渡す.
	 * 
	 * @param num1
	 *            計算用の数字1
	 * @param num2
	 *            計算用の数字2
	 * @return
	 */
	@RequestMapping("/input")
	public String input(String num1, String num2) {

		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int answer = n1 * n2;

//		session.setAttribute("n1", new Integer(n1));
//		session.setAttribute("n2", new Integer(n2));
//		session.setAttribute("answer", new Integer(answer));
		session.setAttribute("n1", n1);
		session.setAttribute("n2", n2);
		session.setAttribute("answer", answer);

		return "outputValue";
	}

	/**
	 * 出力画面2を表示させる.
	 * @return
	 */
	@RequestMapping("/toOutputValue2")
	public String toOutputValue2() {
		return "outputValue2";
	}

}
