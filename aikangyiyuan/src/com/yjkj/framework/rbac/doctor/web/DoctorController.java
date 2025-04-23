package com.yjkj.framework.rbac.doctor.web;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.doctor.model.Doctor;
import com.yjkj.framework.rbac.doctor.service.inte.DoctorService;
import com.yjkj.framework.rbac.part.service.inte.PartService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private PartService partService;
	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Doctor Doctor,HttpSession session) {
		try {
		pager = this.doctorService.informationLoad(pager,Doctor,session);
		model.addAttribute("doctorList", pager);
		model.addAttribute("doctor", Doctor);
		return "jsp/DoctorTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	@RequestMapping("/informationLoadFore")
	public String informationLoadFore(Pager pager,Model model,Doctor Doctor,HttpSession session) {
		try {
		pager = this.doctorService.informationLoadFore(pager,Doctor,session);
		model.addAttribute("doctorList", pager);
		model.addAttribute("doctor", Doctor);
		return "jsp/foreground/DoctorTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Doctor Doctor,Model model) {
		
		try {
			Doctor = this.doctorService.informationLoadOne(Doctor);
			model.addAttribute("partList", this.partService.informationLoadAll(null));
			model.addAttribute("doctor", Doctor);
			return "jsp/Doctor";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationLoadOneFore")
	public String informationLoadOneFore(Doctor Doctor,Model model) {
		
		try {
			Doctor = this.doctorService.informationLoadOne(Doctor);
			model.addAttribute("doctor", Doctor);
			return "jsp/foreground/Doctor";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Doctor Doctor,@Param("file")MultipartFile[] file,Model model,HttpServletRequest request) {
		
		try {
			
			this.doctorService.informationAdd(Doctor,file,request);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	@RequestMapping("/informationDelete")
	public String informationDelete(Doctor Doctor,Model model) {
		
		try {
			this.doctorService.informationDelete(Doctor);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDeleteFore")
	public String informationDeleteFore(Doctor Doctor,Model model) {
		
		try {
			this.doctorService.informationDelete(Doctor);
			return "redirect:informationLoadFore";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Doctor Doctor,@Param("file")MultipartFile[] file,Model model,HttpServletRequest request) {
		
		try {
			this.doctorService.informationUpade(Doctor,file,request);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
