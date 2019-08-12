package com.landonhotel.eventsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.landonhotel.eventsapp.domain.QuoteRequest;

@Controller
public class QuoteRequestManagementController {

	@GetMapping(path="/quoteRequests")
    public String listRequest() {
        
    		return "quoteRequestList";
    }
	
	@GetMapping(path="/quoteRequests", params = "!eventType")
    public String listWeddingRequest() {
        
    		return "quoteWeddingRequestList";
    }
    
	@GetMapping("/quoteRequest/{quotedId}")
    public String viewQuoteRequest(@PathVariable int quoteId) {
        
		//	quoteId
			QuoteRequest obj = new QuoteRequest();
			obj.setBudget(5000);
			obj.setEventType("wedding");
			
			ModelAndView mav = new ModelAndView();
    		return "quoteRequestDetails";
    }
	
	@PostMapping("/quoteDetail")
    public String updateQuoteRequest(@ModelAttribute QuoteRequest formBean) {
        
    		return "quoteRequestDetails";
    }

}
