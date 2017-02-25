package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Box;
import com.amine.core.domain.Coordonnees;
import com.amine.core.service.BoxService;


@Controller
@RequestMapping ("/Box")
public class BoxController {
	
	protected String BOX_VIEW="box/view";
	
	@Resource(name="boxService")
	protected BoxService boxService;
	
	public String getAllBox(HttpServletRequest request, HttpServletResponse response,
			Model model ){
		List<Box> box= boxService.getAllBox();
		model.addAttribute("box", box);
		return getBoxView();
	}
	@RequestMapping ("/all")
	public String saveBox(HttpServletRequest request, HttpServletResponse response,
			Model model,Box box ){
		try {
			box = boxService.saveBox(box);
			model.addAttribute("box", box);
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return getBoxView();
				
		
	}

	private String getBoxView() {
		
		return BOX_VIEW;
	}
	
	

}
