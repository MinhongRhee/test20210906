package com.cos.test20210906.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.test20210906.domain.user.UserRepository;
import com.cos.test20210906.web.dto.SignupReqDto;

@Controller
public class UserController {
	
	private UserRepository userRepository;
	private HttpSession session;
	
	// DI
	public UserController(UserRepository userRepository, HttpSession session) {
		this.userRepository = userRepository;
		this.session = session;
	}
	
	// views/home.jsp
	@GetMapping("/home")
	public String home() {
		return "home"; // ViewResolver가 발동
	}
	
	// signupForm -> signupForm
	// views/user/signupForm.jsp
	@GetMapping("/signupForm")
	public String signupForm() {
		return "user/signupForm";
	}
	
	@PostMapping("/signup")
	public String signup(SignupReqDto dto) {
		userRepository.save(dto.toEntity());
		return "redirect:/loginForm";
	}
	
	// loginForm -> loginForm
	@GetMapping("/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
	
}
