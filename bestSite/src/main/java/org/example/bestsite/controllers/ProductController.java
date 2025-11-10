package org.example.bestsite.controllers;


import lombok.RequiredArgsConstructor;
import org.example.bestsite.services.ProductService;
import org.example.bestsite.models.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/main")
    public String account(Model model) {
        model.addAttribute("accounts", productService.listAccounts());
        return "main";
    }
    /*@GetMapping("/account/{id}")
    public String accountDetails(Model model, @PathVariable Long id) {
        model.addAttribute("account", productService.getAccountById(id));
        return "account-info";
    }*/
    @GetMapping("/reg")
    public String reg() {
        return "registration";
    }
    @PostMapping("/account/add")
    public String addAccount(Account account) {
        productService.addAccount(account);
        return "redirect:/main";
    }

}
