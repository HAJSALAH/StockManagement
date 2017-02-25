package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.TabDevis;
import com.amine.core.service.TabDevisService;

@Controller
@RequestMapping("/TabDevis")
public class TabDevisController {

    protected String TABDEVIS_VIEW = "box/view";

    @Resource(name = "tabDevisService")
    protected TabDevisService tabDevisService;

    @RequestMapping("/all")
    public String getAllTabDevis(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        final List<TabDevis> tabDevis = tabDevisService.getAllTabDevis();
        model.addAttribute("tabDevis", tabDevis);
        return getTabDevisView();
    }

    @RequestMapping("/save")
    public String saveTabDevis(final HttpServletRequest request, final HttpServletResponse response, final Model model, TabDevis tabDevis) {
        try {
            tabDevis = tabDevisService.saveTabDevis(tabDevis);
            model.addAttribute("tabDevis", tabDevis);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getTabDevisView();

    }

    private String getTabDevisView() {

        return TABDEVIS_VIEW;
    }

}
