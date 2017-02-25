package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Chantier;
import com.amine.core.service.ChantierService;

@Controller
@RequestMapping("/Chantier")
public class ChantierController {

    protected String CHANTIER_VIEW = "Chantier/view";

    @Resource(name = "chantierService")
    protected ChantierService chantierService;

    @RequestMapping("/all")
    public String getAllChantier( HttpServletRequest request,  HttpServletResponse response,  Model model) {
        final List<Chantier> chantier = chantierService.getAllChantier();
        model.addAttribute("chantier", chantier);
        return getChantierView();
    }

    @RequestMapping("/save")
    public String saveChantier( HttpServletRequest request,  HttpServletResponse response,  Model model, Chantier chantier) {
        try {
            chantier = chantierService.saveChantier(chantier);
            model.addAttribute("chantier", chantier);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getChantierView();

    }

    private String getChantierView() {

        return CHANTIER_VIEW;
    }

}
