package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Coordonnees;
import com.amine.core.service.CoordonneesService;

@Controller
@RequestMapping(("/coordonnees"))
public class CoordonneesController {

    protected String COORDONNEES_VIEW = "coordonnees/view";

    @Resource(name = "coordonneesService")
    protected CoordonneesService coordonneesService;

    @RequestMapping("/all")
    public String getAllCoordonnees(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        final List<Coordonnees> coordonnees = coordonneesService.getAllCoordonnees();
        model.addAttribute("coordonnees", coordonnees);
        return getCoordonneesView();
    }

    @RequestMapping("/save")
    public String saveCoordonnees(final HttpServletRequest request, final HttpServletResponse response, final Model model,
            Coordonnees coordonnees) {
        try {
            coordonnees = coordonneesService.saveCoordonnees(coordonnees);
            model.addAttribute("coordonnees", coordonnees);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getCoordonneesView();
    }

    public String getCoordonneesView() {
        return COORDONNEES_VIEW;
    }
}
