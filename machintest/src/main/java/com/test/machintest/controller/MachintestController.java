package com.test.machintest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.machintest.CategoryMaster;
import com.test.machintest.ProductMaster;
import com.test.machintest.services.MachintestService;

@Controller
public class MachintestController {

	@Autowired
	MachintestService services;

	@GetMapping("/add")
	public String add() {
		return "/WEB-INF/addproductmaster.jsp";
	}

	@PostMapping("/addproductmaster")
	public String AddproductMaster(@ModelAttribute CategoryMaster categoryMaster) {
		services.addProductMaster(categoryMaster);
		return "/index.jsp";
	}

	@GetMapping("/list")
	public String list(Model model) {
		List<CategoryMaster> list = services.listMaster();
		model.addAttribute("list", list);
		return "/index.jsp";
	}

	@PostMapping("/find")
	public String findmaster(@ModelAttribute CategoryMaster master, Model model) {
		CategoryMaster find = services.find(master);
		model.addAttribute("find", find);
		return "/index.jsp";
	}

	@GetMapping("/delete")
	public String delete() {
		return "/WEB-INF/deletemaster.jsp";
	}

	@PostMapping("/deleted")
	public String DataDeleted(@RequestParam String categoryid) {
		services.delete(Integer.parseInt(categoryid));
		return "/index.jsp";
	}

	@GetMapping("/edit")
	public String update() {
		return "/WEB-INF/updatemaster.jsp";
	}

	CategoryMaster master;

	@PostMapping("/updated")
	public String updated(@ModelAttribute CategoryMaster categoryid, Model model) {
		master = services.find(categoryid);
		model.addAttribute("emp", master);
		return "/WEB-INF/updatemaster.jsp";
	}

	@PostMapping("/updateData")
	public String updatedata(@RequestParam String newName) {
		services.update(master.getCategoryid(), newName);
		return "/index.jsp";

	}
	
	@GetMapping("/producthomepage")
	public String ProductHomepage() {
		return "/WEB-INF/producthomepage.jsp";
		
	}
	@GetMapping("/addproduct")
	public String AddProduct() {
		return "/WEB-INF/addproduct.jsp";
		
	}
	@PostMapping("/addmaster")
	public String Addproduct(@ModelAttribute ProductMaster productMaster) {
		services.addProduct(productMaster);
		return "/WEB-INF/producthomepage.jsp";
	}
	@PostMapping("/findproduct")
	public String findProduct(@ModelAttribute ProductMaster product, Model model) {
		ProductMaster find = services.findProduct(product);
		model.addAttribute("findproduct", find);
		return "/WEB-INF/producthomepage.jsp";
	}

	@GetMapping("/listproduct")
	public String listProcuct(Model model) {
		List<ProductMaster> productlist = services.listProduct();
		List<CategoryMaster> listMaster = services.listMaster();
		model.addAttribute("productlist", productlist);
		model.addAttribute("categorylist", listMaster);
		return "/WEB-INF/producthomepage.jsp";
	}
	@GetMapping("/deleteproduct")
	public String deleteProduct() {
		return "/WEB-INF/deleteproduct.jsp";
	}
	@PostMapping("/productdeleted")
	public String ProductDeleted(@RequestParam String productid) {
		services.deleteProduct(Integer.parseInt(productid));
		return "/WEB-INF/producthomepage.jsp";
	}
	@GetMapping("/updatePd")
	public String updateProduct() {
		return "/WEB-INF/updateproduct.jsp";
	}
	ProductMaster productMaster;
	@PostMapping("/updatedproduct")
	public String updatedProduct(@ModelAttribute ProductMaster productid, Model model) {
		productMaster = services.findProduct(productid);
		model.addAttribute("product", productMaster);
		return "/WEB-INF/updateproduct.jsp";
	}
	@PostMapping("/productdata")
	public String ProductDataUpdated(@RequestParam String newName) {
		services.updateProduct(productMaster.getProductid(), newName);
		return "/WEB-INF/producthomepage.jsp";

	}


}
