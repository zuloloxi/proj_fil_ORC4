package com.dojo.stage.contoller;

import com.dojo.stage.repository.OutputFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutputFileController {

    @Autowired
    private OutputFileRepository outputFileRepository;


}
