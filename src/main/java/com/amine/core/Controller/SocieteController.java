package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Societe;
import com.amine.core.service.SocieteService;

@Controller
@RequestMapping("/Societe")
public class SocieteController {

    protected String SOCIETE_VIEW = "societe/view";

    @Resource(name = "societeService")
    protected SocieteService societeService;

    @RequestMapping("/all")
    public String getAllSociete(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        final List<Societe> societe = societeService.getAllSociete();
        model.addAttribute("societe", societe);
        return getSocieteView();
    }

    @RequestMapping("/save")
    public String saveSociete(final HttpServletRequest request, final HttpServletResponse response, final Model model, Societe societe) {
        try {
            societe = societeService.saveSociete(societe);
            model.addAttribute("societe", societe);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getSocieteView();

    }

    private String getSocieteView() {

        return SOCIETE_VIEW;
    }

}
