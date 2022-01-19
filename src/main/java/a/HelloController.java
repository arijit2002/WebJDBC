package a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class HelloController {
	@Autowired 
	HelloService helloService;
	@GetMapping("/home")
	public String getHello() {
		return "hello";
	}
	
	@GetMapping("/hello2")
	public String getHello2() {
		return "hello2";
	}
	
	@PostMapping("/h2")
	public String postRequest(@RequestParam("t1") String str, Model m) {
		m.addAttribute("Arijit",str.toUpperCase());
		return "output/response";
	}
	
	@PostMapping("/h3")
	public String postDbRequest(@RequestParam("t3") String str, Model m) {
		Employee e = helloService.getEmployee((Integer.parseInt(str)));
		m.addAttribute("MyEmp", e);
		return "output/db";
	}
}
