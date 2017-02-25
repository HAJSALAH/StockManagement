package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Fournisseur;
import com.amine.core.service.FournisseurService;

@Controller
@RequestMapping("/Fournisseur")
public class FournisseurController {

    protected String FOURNISSEUR_VIEW = "fournisseur/view";

    @Resource(name = "fournisseurService")
    protected FournisseurService fournisseurService;

    @RequestMapping("/all")
    public String getAllFournisseur(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        final List<Fournisseur> fournisseur = fournisseurService.getAllFournisseur();
        model.addAttribute("fournisseur", fournisseur);
        return getFournisseurView();
    }

    @RequestMapping("/save")
    public String saveFournisseur(final HttpServletRequest request, final HttpServletResponse response, final Model model,
            Fournisseur fournisseur) {
        try {
            fournisseur = fournisseurService.saveFournisseur(fournisseur);
            model.addAttribute("fournisseur", fournisseur);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getFournisseurView();

    }

    private String getFournisseurView() {

        return FOURNISSEUR_VIEW;
    }

}
