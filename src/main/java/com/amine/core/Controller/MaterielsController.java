package com.amine.core.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amine.core.domain.Materiels;
import com.amine.core.service.MaterielsService;

@Controller
@RequestMapping("/MaterielsController")
public class MaterielsController {

    protected String MATERIELS_VIEW = "materiels/view";

    @Resource(name = "materielsService")
    protected MaterielsService materielsService;

    @RequestMapping("/all")
    public String getAllMateriels(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        final List<Materiels> materiels = materielsService.getAllMateriels();
        model.addAttribute("materiels", materiels);
        return getMaterielsView();
    }

    @RequestMapping("/save")
    public String saveMateriels(final HttpServletRequest request, final HttpServletResponse response, final Model model, Materiels materiels) {
        try {
            materiels = materielsService.saveMateriels(materiels);
            model.addAttribute("materiels", materiels);
        } catch (final Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return getMaterielsView();

    }

    private String getMaterielsView() {

        return MATERIELS_VIEW;
    }

}
