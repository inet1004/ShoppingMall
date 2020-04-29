package co.park.shop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.park.shop.product.cal.Calcurator;

@Controller
public class ProductController {
	@Autowired
	Calcurator cal;
	
	@RequestMapping("/sum.do")
	public String product(Model model) {   // view ��
		// TODO ���� �� ���¸� �ۼ��Ѵ�.
		int result =cal.sum(10, 100);
		model.addAttribute("sum",result);
		return "sumResult";					// return�� view
	}
	
//	@RequestMapping("")
//	public ModelAndView product_(Model model) {   // model and view
//		ModelAndView mav = new ModelAndView();    // �並 �����ؼ� �����ַ��� �Ҷ�
//		// TODO ���� �� ���¸� �ۼ��Ѵ�.
//		mav.addObject("a","b");
//		mav.setViewName("viewName");
//		return mav;								// return�� ��ü��
//	}
	
}
