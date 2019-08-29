package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;



    @Controller
    public class HomeController {

        @Autowired
        MODELCLASSRepository modelclassRepository;

        @RequestMapping("/")
        public String listTODOs(Model model){
            model.addAttribute("modelclasss", modelclassRepository.findAll());
            return "list";
        }

        @GetMapping("/add")
        public String modelclassForm(Model model){
            model.addAttribute ("modelclass", new ModelClass());
            return "modelclass";
        }

        @PostMapping("/process")
        public String processForm(@Valid ModelClass modelclass,
          BindingResult result){
            if (result.hasErrors( )){
                return "modelclass";
            }
            modelclassRepository.save(modelclass);
            return "redirect:/";
        }

        @RequestMapping("/detail/{id}")
        public String showTODO(@PathVariable("id") long id, Model model) {
            model.addAttribute("todo", modelclassRepository.findById(id).get());
            return "show";
        }

        @RequestMapping("/update/{id}")
        public String updateTODO(@PathVariable("id") long id,
                                   Model model) {
            model.addAttribute("modelclass", modelclassRepository.findById(id).get());
            return "modelclass";
        }

        @RequestMapping("/delete/{id}")
        public String delTODO(@PathVariable("id") long id) {
            modelclassRepository.deleteById(id);
            return "redirect:/";
        }
    }