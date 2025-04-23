package com.yjkj.framework.rbac.information.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.information.model.Information;
import com.yjkj.framework.rbac.information.service.inte.InformationService;
@Controller
@RequestMapping("/information")
public class InformationController {
	
	@Autowired
	private InformationService informationService;
	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Information Information,HttpSession session) {
		try {
		pager = this.informationService.informationLoad(pager,Information,session);
		model.addAttribute("information", Information);
		model.addAttribute("informationList", pager);
		return "jsp/InformationTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadFore")
	public String informationLoadFore(Pager pager,Model model,Information Information,HttpSession session) {
		try {
		pager = this.informationService.informationLoad(pager,Information,session);
		model.addAttribute("informationList", pager);
		return "jsp/foreground/InformationTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/error";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Information Information,Model model,HttpSession session) {
		
		try {
			Information = this.informationService.informationLoadOne(Information);
			model.addAttribute("information", Information);
			return "jsp/Information";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Information Information,Model model) {
		
		try {
			
			this.informationService.informationAdd(Information);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Information Information,Model model) {
		
		try {
			this.informationService.informationDelete(Information);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Information Information,Model model) {
		
		try {
			this.informationService.informationUpade(Information);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
