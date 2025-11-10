package org.example.bestsite.services;

import org.example.bestsite.models.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private long ID = 0;
    private final List<Account> accounts = new ArrayList<>();

    {
        accounts.add(new Account("Admin", "admin", "admin", "admin", "+79962335958"));
    }

    public List<Account> listAccounts() {
        return accounts;
    }

    /*public Object getAccountById(Long id) {
        for (Account account : accounts) {
            if (account.getID() == id) return account;
        }
        return null;
    }*/
    public void addAccount(Account account) {
        //account.setID(ID++);
        accounts.add(account);
    }
}
