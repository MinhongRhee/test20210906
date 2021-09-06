package com.cos.test20210906.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cos.test20210906.domain.user.User;
import com.cos.test20210906.domain.user.UserRepository;
import com.cos.test20210906.web.dto.LoginReqDto;
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
	
	// login
	@PostMapping("/login")
	public String login(LoginReqDto dto, HttpServletResponse response) {
		User userEntity = userRepository.mLogin(dto.getUsername(),dto.getPassword());
		if (userEntity == null) {
			return "redirect:/loginForm";
		} else {
			if( dto.getIdChecked() == null) {
			session.setAttribute("principal", userEntity);
			return "redirect:/home";
			} else {
				  session.setAttribute("principal", userEntity);
				  Cookie cusername = new Cookie("username", dto.getUsername());
				  Cookie cpassword = new Cookie("password", dto.getPassword());
				  cusername.setMaxAge(60*10);
				  cpassword.setMaxAge(60*10);
				  response.addCookie(cusername); 
				  response.addCookie(cpassword);
				  return "redirect:/home";
			}
		}	
	}
	
	// logout
	@GetMapping("/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/loginForm";
	}
}
