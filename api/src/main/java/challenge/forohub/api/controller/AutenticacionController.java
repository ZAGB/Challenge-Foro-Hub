package challenge.forohub.api.controller;


import challenge.forohub.api.infra.security.DatosJWTToken;
import challenge.forohub.api.infra.security.TokenService;
import challenge.forohub.api.usuario.DatosAutenticacionUsuario;
import challenge.forohub.api.usuario.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    private TokenService tokenService;

    public AutenticacionController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario){
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(), datosAutenticacionUsuario.clave());
       var datosAutenticados = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuario) datosAutenticados.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }


}
