package br.com.alura.api.controller;

import br.com.alura.api.model.User;
import br.com.alura.api.model.dto.LoginDTO;
import br.com.alura.api.model.dto.jwtDTO;
import br.com.alura.api.service.JwtService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthenticationController(AuthenticationManager authenticationManager, JwtService jwtService) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    @PostMapping
    public ResponseEntity login(@RequestBody @Valid LoginDTO dto) {
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(dto.login(), dto.pass());
        Authentication authentication = authenticationManager.authenticate(authToken);

        String tokenJWT = jwtService.generateToken((User) authentication.getPrincipal());
        return ResponseEntity.ok(new jwtDTO(tokenJWT));
    }
}
