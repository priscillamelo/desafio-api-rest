package br.com.bootcamps.dio.desafio_api_rest.repository;

import br.com.bootcamps.dio.desafio_api_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
