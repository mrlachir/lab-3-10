package ma.fstg.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @org.springframework.web.bind.annotation.ModelAttribute("username")
    public String username(java.security.Principal principal) {
        return principal == null ? "" : principal.getName();
    }

    @GetMapping("/") public String index() { return "redirect:/home"; }
    @GetMapping("/home") public String home() { return "home"; }
    @GetMapping("/user/dashboard") public String userDashboard() { return "user-dashboard"; }
    @GetMapping("/admin/dashboard") public String adminDashboard() { return "admin-dashboard"; }
    @GetMapping("/login") public String login() { return "login"; }
    @GetMapping("/access-denied") public String accessDenied() { return "access_denied"; }
}

