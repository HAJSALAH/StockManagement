package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Devis;
import com.amine.core.service.DevisService;

@Controller
@RequestMapping("/Devis")
public class DevisController {

    protected String DEVIS_VIEW = "devis/view";

    @Resource(name = "devisService")
    protected DevisService devisService;

    @RequestMapping("/all")
    public String getAllDevis(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        final List<Devis> devis = devisService.getAllDevis();
        model.addAttribute("devis", devis);
        return getDevisView();
    }

    @RequestMapping("/save")
    public String saveDevis(final HttpServletRequest request, final HttpServletResponse response, final Model model, Devis devis) {
        try {
            devis = devisService.saveDevis(devis);
            model.addAttribute("devis", devis);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getDevisView();

    }

    private String getDevisView() {

        return DEVIS_VIEW;
    }
}
