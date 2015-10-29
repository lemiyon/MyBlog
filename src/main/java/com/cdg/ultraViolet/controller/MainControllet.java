package com.cdg.ultraViolet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * application-context에서 Controller가 빠지는 이유....
 * Spring은 오직 웹만을 위한 프레임워크가 아니다. 따라서 Web의 컨트롤러들은 웹에 묶여있는 애들이기 때문에 나중에
 * 다른 환경에서 돌아가는 데 방해가 될 수 있다.
 * */
 

@Controller
public class MainControllet {

	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
}
