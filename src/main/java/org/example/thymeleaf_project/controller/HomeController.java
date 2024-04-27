package org.example.thymeleaf_project.controller;

import org.example.thymeleaf_project.models.Portfolio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        Portfolio portfolio1 = Portfolio
                .builder()
                .name("LOG CABIN")
                .image("/img/cabin.png")
                .description("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.")
                .build();

        Portfolio portfolio2 = Portfolio
                .builder()
                .name("TASTY CAKE")
                .image("/img/cake.png")
                .description("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.")
                .build();

        Portfolio portfolio3 = Portfolio
                .builder()
                .name("CIRCUS TENT")
                .image("/img/circus.png")
                .description("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.")
                .build();

        ArrayList<Portfolio> portfolios = new ArrayList<>();
        portfolios.add(portfolio1);
        portfolios.add(portfolio2);
        portfolios.add(portfolio3);
        model.addAttribute("portfolios", portfolios);

        return "home";
    }
}
