package br.com.bootcamps.dio.desafio_api_rest.service;

import br.com.bootcamps.dio.desafio_api_rest.model.User;

public interface UserService {
    User findById(Long idUser);
    User create(User user);
}
