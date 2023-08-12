package com.ventas.ecomerce.service;

import com.ventas.ecomerce.model.Usuario;
import com.ventas.ecomerce.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UsuarioService {
    Optional<Usuario> findById(Integer id);
    Usuario save(Usuario usuario);
}
