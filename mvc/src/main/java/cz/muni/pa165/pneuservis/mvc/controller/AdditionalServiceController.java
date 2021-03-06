package cz.muni.pa165.pneuservis.mvc.controller;

import cz.muni.pa165.pneuservis.api.dto.AdditionalServiceDTO;
import cz.muni.pa165.pneuservis.api.facade.AdditionalServiceFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;


/**
 * Created by xjavorka on 14.12.16.
 */
@Controller
@RequestMapping("/additionalService")
public class AdditionalServiceController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AdditionalServiceFacade facade;

    @GetMapping("/")
    public String findAllAdditionalServices(Model model) {
        logger.info("Showing all additional services");
        model.addAttribute("additionalServices", facade.findAll());
        return "additionalService/list";
    }


    @GetMapping("/new")
    public String newAdditionalService(Model model) {
        model.addAttribute("additionalService", new AdditionalServiceDTO());
        return "additionalService/edit";
    }

    @GetMapping("/edit/{id}")
    public String editAdditionalService(@PathVariable Long id, Model model) {
        model.addAttribute("additionalService", facade.findOne(id));
        return "additionalService/edit";
    }

    @PostMapping("/save")
    public String saveAdditionalService(@Valid @ModelAttribute("additionalService") AdditionalServiceDTO dto,
                                        BindingResult bindingResult,
                                        Model model,
                                        RedirectAttributes redirectAttributes,
                                        UriComponentsBuilder uriBuilder) {
        logger.info("Saving AdditionalServiceDTO: {}", dto);
        if (bindingResult.hasErrors()) {
            return "additionalService/edit";
        }
        facade.save(dto);
        return "redirect:" + uriBuilder.path("/additionalService/").toUriString();
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id, UriComponentsBuilder uriBuilder) {
        logger.info("Deleting additional service with id: {}", id);
        facade.delete(id);
        return "redirect:" + uriBuilder.path("/additionalService/").toUriString();
    }
}
