package com.yjkj.framework.rbac.bargain.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.bargain.model.Bargain;
import com.yjkj.framework.rbac.bargain.service.inte.BargainService;

@Controller
@RequestMapping("/bargain")
public class BargainController {
	
	@Autowired
	private BargainService bargainService;
	
	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Bargain bargain,HttpSession session) {
		try {
		pager = this.bargainService.informationLoad(pager,bargain,session);
		model.addAttribute("bargainList", pager);
		return "jsp/BargainTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	@RequestMapping("/informationLoadFore")
	public String informationLoadFore(Pager pager,Model model,Bargain bargain,HttpSession session) {
		try {
		pager = this.bargainService.informationLoadFore(pager,bargain,session);
		model.addAttribute("bargainList", pager);
		return "jsp/foreground/BargainTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Bargain bargain,Model model,HttpSession session) {
		
		try {
			bargain = this.bargainService.informationLoadOne(bargain);
			model.addAttribute("bargain", bargain);
			return "jsp/foreground/Bargain";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Bargain bargain,Model model) {
		
		try {
			
			this.bargainService.informationAdd(bargain);
			return "redirect:informationLoadFore";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAddFore")
	public String informationAddFore(Bargain bargain,Model model) {
		
		try {
			
			this.bargainService.informationAdd(bargain);
			return "redirect:informationLoadFore";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Bargain bargain,Model model) {
		
		try {
			this.bargainService.informationDelete(bargain);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Bargain bargain,Model model) {
		
		try {
			this.bargainService.informationUpade(bargain);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/getTicket")
	public String getTicket(Bargain bargain,Model model) {
		
		try {
			this.bargainService.informationUpade(bargain);
			return "redirect:informationLoadFore";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
	}
	@RequestMapping("/backTicket")
	public String backTicket(Bargain bargain,Model model) {
		
		try {
			this.bargainService.informationUpade(bargain);
			return "redirect:informationLoadFore";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
	}
		@RequestMapping("/informationDeleteFore")
		public String informationDeleteFore(Bargain bargain,Model model) {
			
			try {
				this.bargainService.informationDelete(bargain);
				return "redirect:informationLoadFore";
			}catch (Exception e) {
				e.printStackTrace();
				return "jsp/Failed";
			}
			
		}
		
		@RequestMapping("/informationUpdateFore")
		public String informationUpdateFore(Bargain bargain,Model model) {
			
			try {
				this.bargainService.informationUpade(bargain);
				return "redirect:informationLoadFore";
			} catch (Exception e) {
				e.printStackTrace();
				return "jsp/Failed";
			}
		
	}
	
}
