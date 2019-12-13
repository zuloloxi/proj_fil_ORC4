package com.dojo.stage.exposition;

import com.dojo.stage.infrastructure.OutputFileDAO;
import com.dojo.stage.infrastructure.OutputFileJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;

public class OutputController {


    @RestController
    public class OutputFileController {

        @Autowired
        private OutputFileDAO outputFileDAO;

        @GetMapping("/outputs")
        public ArrayList<OutputFileJPA> getOutputs() { return (ArrayList<OutputFileJPA>) outputFileDAO.findAll(); }

        @PostMapping("/outputs")
        public OutputFileJPA createOutput(@Valid @RequestBody OutputFileJPA question) {
            return outputFileDAO.save(question);
        }

    }


}
