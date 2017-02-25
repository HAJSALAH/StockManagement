package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Ouvrier;
import com.amine.core.service.OuvrierService;

@Controller
@RequestMapping("/Ouvrier")
public class OuvrierController {

    protected String OUVRIER_VIEW = "ouvrier/view";

    @Resource(name = "ouvrierService")
    protected OuvrierService ouvrierService;

    @RequestMapping("/all")
    public String getAllOuvrier(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        final List<Ouvrier> ouvrier = ouvrierService.getAllOuvrier();
        model.addAttribute("ouvrier", ouvrier);
        return getOuvrierView();
    }

    @RequestMapping("/save")
    public String saveOuvrier(final HttpServletRequest request, final HttpServletResponse response, final Model model, Ouvrier ouvrier) {
        try {
            ouvrier = ouvrierService.saveOuvrier(ouvrier);
            model.addAttribute("ouvrier", ouvrier);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getOuvrierView();

    }

    private String getOuvrierView() {

        return OUVRIER_VIEW;
    }

}
