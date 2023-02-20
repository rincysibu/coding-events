package org.launcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("events")
public class EventController {
    public static ArrayList<String> eventLists = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        eventLists.add("Rincy");
        eventLists.add("Roselyn");
        eventLists.add("Daniel");
        model.addAttribute("events", eventLists);
        return "events/index";
    }
    //lives at /events/create
@GetMapping("create")

    public String renderCreateEventForm(){
        return "events/create";

    }

}
