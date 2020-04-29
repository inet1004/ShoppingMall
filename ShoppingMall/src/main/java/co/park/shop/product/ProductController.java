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
	public String product(Model model) {   // view 만
		// TODO 서비스 할 형태를 작성한다.
		int result =cal.sum(10, 100);
		model.addAttribute("sum",result);
		return "sumResult";					// return을 view
	}
	
//	@RequestMapping("")
//	public ModelAndView product_(Model model) {   // model and view
//		ModelAndView mav = new ModelAndView();    // 뷰를 선택해서 돌려주려고 할때
//		// TODO 서비스 할 형태를 작성한다.
//		mav.addObject("a","b");
//		mav.setViewName("viewName");
//		return mav;								// return을 객체로
//	}
	
}
