package org.example.bestsite.services;

import org.example.bestsite.interfaces.ProductRepository;
import org.example.bestsite.models.Account;
import org.example.bestsite.interfaces.AccountRepository;
import org.example.bestsite.models.Product;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final AccountRepository accountRepository;
    private final ProductRepository productRepository;

    public Service(AccountRepository accountRepository, ProductRepository productRepository) {
        this.accountRepository = accountRepository;
        this.productRepository = productRepository;
    }

    public List<Account> searchAccount(String name){
        return accountRepository.findAllByNameContaining(name);
    }
    public Product findProductDetails(Integer id) {
        return productRepository.findById(id)
                .orElse(null);

    }

    public Account findAccountDetails( Integer id) {
        return accountRepository.findById(id)
                .orElse(null);

    }

}
