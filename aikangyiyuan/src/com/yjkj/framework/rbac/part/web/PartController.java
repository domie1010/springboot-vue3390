package com.yjkj.framework.rbac.part.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.part.model.Part;
import com.yjkj.framework.rbac.part.service.inte.PartService;

@Controller
@RequestMapping("/part")
public class PartController {
	
	@Autowired
	private PartService partService;
	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Part Part,HttpSession session) {
		try {
		pager = this.partService.informationLoad(pager,Part,session);
		model.addAttribute("partList", pager);
		model.addAttribute("part", Part);
		return "jsp/PartTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadA")
	public String informationLoadA(Pager pager,Model model,Part Part,HttpSession session) {
		try {
		pager = this.partService.informationLoad(pager,Part,session);
		model.addAttribute("partList", pager);
		model.addAttribute("part", Part);
		return "jsp/foreground/PartTableA";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadB")
	public String informationLoadB(Pager pager,Model model,Part Part,HttpSession session) {
		try {
		pager = this.partService.informationLoad(pager,Part,session);
		model.addAttribute("partList", pager);
		model.addAttribute("part", Part);
		return "jsp/foreground/PartTableB";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Part Part,Model model) {
		
		try {
			Part = this.partService.informationLoadOne(Part);
			model.addAttribute("part", Part);
			return "jsp/Part";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Part Part,Model model) {
		
		try {
			
			this.partService.informationAdd(Part);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	@RequestMapping("/informationDelete")
	public String informationDelete(Part Part,Model model) {
		
		try {
			this.partService.informationDelete(Part);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Part Part,Model model) {
		
		try {
			this.partService.informationUpade(Part);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
