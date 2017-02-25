package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Facture;
import com.amine.core.service.FactureService;

@Controller
@RequestMapping("/Facture")
public class FactureController {

    protected String FACTURE_VIEW = "facture/view";

    @Resource(name = "factureService")
    protected FactureService factureService;

    @RequestMapping("/all")
    public String getAllFacture(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        final List<Facture> facture = factureService.getAllFacture();
        model.addAttribute("facture", facture);
        return getFactureView();
    }

    @RequestMapping("/save")
    public String saveFacture(final HttpServletRequest request, final HttpServletResponse response, final Model model, Facture facture) {
        try {
            facture = factureService.saveFacture(facture);
            model.addAttribute("facture", facture);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getFactureView();

    }

    private String getFactureView() {

        return FACTURE_VIEW;
    }

}
