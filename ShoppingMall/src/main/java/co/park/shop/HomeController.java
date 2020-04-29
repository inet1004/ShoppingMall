package co.park.shop;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);  // �ý��ۿ� �α׸� ������ ��
		logger.info("home.jsp�� �����");

		
		return "home";  // "/"ġ�� localhost�� root�� context path�Ʒ��� home.jsp �� �´ٴ� ����
	}
	
}
