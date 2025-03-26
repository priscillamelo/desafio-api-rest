package br.com.bootcamps.dio.desafio_api_rest.service.impl;

import br.com.bootcamps.dio.desafio_api_rest.model.User;
import br.com.bootcamps.dio.desafio_api_rest.repository.UserRepository;
import br.com.bootcamps.dio.desafio_api_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long idUser) {
        return userRepository.findById(idUser).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(user.getId() != null && userRepository.existsById(user.getId())){
            throw new IllegalArgumentException("This User ID already exists.");
        }
        return userRepository.save(user);
    }
}
