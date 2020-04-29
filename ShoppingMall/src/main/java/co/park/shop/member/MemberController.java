package co.park.shop.member;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.park.shop.HomeController;
import co.park.shop.member.Vo.MemberVo;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	MemberVo memberVo;
	
	
	@RequestMapping("/login.do") 
	public String login(Model model) {
		logger.info("�α��� ���� �����");
		return "member/loginform";
	}
	
	
//	@RequestMapping("/loginchack.do")   // Param���� ������
//	public ModelAndView loginchack(
//			@RequestParam("id") String id,
//			@RequestParam("pw") String pw) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("id",id);
//		mav.addObject("pw",pw);
//		if(id.equals("park")) {
//			mav.setViewName("member/loginOk");
//		} else {
//			mav.setViewName("member/loginFail");
//		}
//		logger.info("�α���üũ�� �����");
//		return mav;
//	}
	
	
	
//	@RequestMapping("/loginchack.do") // ��ü�� ������
//	public ModelAndView loginchack(HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("id", request.getParameter("id"));
//		mav.addObject("pw", request.getParameter("pw"));
//		if(request.getParameter("id").equals("park")) {
//			mav.setViewName("member/loginOk");
//		} else {
//			mav.setViewName("member/loginFail");
//		}
//		return mav;
//	}
	
	
	@RequestMapping("/loginchack.do") // Request ��ü�� �����͸� ������
	public ModelAndView loginchack(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
//		MemberVo memberVo = new MemberVo();
		memberVo.setId(request.getParameter("id"));
		memberVo.setPw(request.getParameter("pw"));
		mav.addObject("member",memberVo);
		
		if(request.getParameter("id").equals("park")) {
			mav.setViewName("member/loginOk");
		} else {
			mav.setViewName("member/loginFail");
		}
		return mav;
	}
	
	

}
