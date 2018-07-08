package com.journal.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import com.journal.domain.JournalEntry;
import com.journal.repository.JournalRepository;

@RestController
public class JournalController {

  private static final String VIEW_INDEX = "index";

  @Autowired
  JournalRepository repo;

  @RequestMapping(
    value = "/journal",
    produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }
  )
  public @ResponseBody List<JournalEntry> getJournal() {
    return repo.findAll();
  }

  @RequestMapping(
    value = "/",
    method = RequestMethod.GET
  )
  public ModelAndView index(ModelAndView modelAndView) {
    modelAndView.setViewName(VIEW_INDEX);
    modelAndView.addObject("journal", repo.findAll());
    return modelAndView;
  }
}
