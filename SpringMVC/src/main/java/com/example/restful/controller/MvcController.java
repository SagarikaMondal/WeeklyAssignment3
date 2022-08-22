	package com.example.restful.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller

	public class MvcController {

	 @RequestMapping("/")

	 public String sayHello() {

	 return "form.jsp";

	 }
	 @RequestMapping("/sub")

	 public String sendResponse(@RequestParam("cid") String cid,@RequestParam("cname") String cname,@RequestParam("cph") String cph,@RequestParam("cad") String cad,@RequestParam("cp") String cp,@RequestParam("clid") String clid,Model m) {

		 m.addAttribute("cid",cid);
		 m.addAttribute("cname",cname);
		 m.addAttribute("cph",cph);
		 m.addAttribute("clid",clid);
		 m.addAttribute("cad",cad);
		 m.addAttribute("cp",cp);
		 
		 
	 return "Response.jsp";

	 }

	}
