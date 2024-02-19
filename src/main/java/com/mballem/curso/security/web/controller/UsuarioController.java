package com.mballem.curso.security.web.controller;

import com.mballem.curso.security.datatables.Datatables;
import com.mballem.curso.security.domain.Usuario;
import com.mballem.curso.security.repository.EspecialidadeRepository;
import com.mballem.curso.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("u")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/novo/cadastro/usuario")
    public String cadastroPorAdminParaAdminMedicoPaciente(Usuario usuario) {
        return "usuario/cadastro";
    }

    //abrir lista de usuários
    @GetMapping("/lista")
    public String listarUsuarios() {
        return "usuario/lista";
    }

    //listar usuários na datatable
    @GetMapping("/datatables/server/usuarios")
    public ResponseEntity<?> listarUsuariosDatatables(HttpServletRequest request) {
        return ResponseEntity.ok(usuarioService.buscarTodos(request));
    }
}
