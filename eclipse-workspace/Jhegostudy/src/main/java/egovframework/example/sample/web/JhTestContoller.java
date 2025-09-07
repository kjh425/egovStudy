package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class JhTestContoller {
	
	@RequestMapping(value = "/jhpage.do",method = RequestMethod.GET)
	public String jhpage(ModelMap model) {
		System.out.println("자 내가만든 페이지 가보자~");
		return "sample/jhpage";
	}
	
	@GetMapping("/jhpage2.do")
	public String jhpage2() {
		System.out.println("자 내가만든 페이지 가보자~222222");
		return "sample/jhpage";
	}

}
