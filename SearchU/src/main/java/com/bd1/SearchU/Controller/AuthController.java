package com.bd1.SearchU.Controller;
import com.bd1.SearchU.Entity.User;
import com.bd1.SearchU.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginUser) {
        User existingUser = userService.findByEmailOrUsername(loginUser.getEmail(), loginUser.getUsername());
        if (existingUser != null && existingUser.getPassword().equals(loginUser.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
