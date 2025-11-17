package org.example.bestsite.controllers;


import lombok.RequiredArgsConstructor;
import org.example.bestsite.interfaces.AccountRepository;
import org.example.bestsite.interfaces.ProductRepository;
import org.example.bestsite.models.Product;
import org.example.bestsite.services.Service;
import org.example.bestsite.models.Account;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class Controller {
    private final Service service;
    private final AccountRepository accountRepository;
    private final ProductRepository productRepository;
    @GetMapping("/main")
    public String account(Model model) {
        model.addAttribute("accounts", accountRepository.findAll());
        model.addAttribute("product", productRepository.findAll());

        return "main";
    }
    @GetMapping("/account/reg")
    public String reg() {
        return "account/account-registration";
    }
    @GetMapping("/product/add")
    public String addProduct() {
        return "product/product-add";
    }
    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("product", service.findProductDetails(id));
        return "product/product-info";
    }

    @PostMapping("/search")
    public String searchAccountByName(String name, Model model) {
        if (name != "") {
            model.addAttribute("accounts", service.searchAccount(name));
            return "searched-accounts";
        }
        return "redirect:/main";
    }

    @GetMapping("/search")
    public String search() {
        return "searched-accounts";
    }

    @PostMapping("product/add")
    public String addProduct(Product product) {
        productRepository.save(product);
        return "redirect:/main";

    }
    @GetMapping("/account/login")
    public String log() {
        return "account/account-login";
    }

    @PostMapping("/account/add")
    public String addAccount(Account account) {
        accountRepository.save(account);
        return "redirect:/main";
    }

    @GetMapping("/account/{id}")
    public String info(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("account", service.findAccountDetails(id));
        return "account/account-info";
    }

}
