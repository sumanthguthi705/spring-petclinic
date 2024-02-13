package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DogsController
{
	@GetMapping("/dogs")
	public String dogs(Model model)
	{
		return "dogs.html";
	}


	//create the db repository and perform curd operations
}
