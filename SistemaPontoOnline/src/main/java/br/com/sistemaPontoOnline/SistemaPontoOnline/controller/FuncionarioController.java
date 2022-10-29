package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    Funcionario save (@RequestBody Funcionario funcionario){
        return funcionarioService.save(funcionario);
    }
}
