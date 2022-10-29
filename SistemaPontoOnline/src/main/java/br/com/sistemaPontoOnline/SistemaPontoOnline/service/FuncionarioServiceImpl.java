package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> list(Long codigoFuncional) {
        return null;
    }

    @Override
    public List<Funcionario> listByCodigoFuncional (Long codigoFuncional) {
        return null;
    }
    @Override
    public List<Funcionario> listByNome (String nome){
        return null;
    }

    @Override
    public Funcionario save(Funcionario funcionario) {
        return null;
    }

    @Override
    public Funcionario getByCodigoFuncional(Long codigoFuncional) {
        return null;
    }

    @Override
    public Funcionario update(Long codigoFuncional, Funcionario funcionario) {
        return null;
    }

    @Override
    public void delete(Long codigoFuncional) {

    }
}
