package org.example.bestsite.interfaces;

import org.example.bestsite.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    List<Account> findAllByNameContaining(String name);


}
