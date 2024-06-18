package me.franciscomolina.codigo_morse.controller;

import me.franciscomolina.codigo_morse.util.MorseCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseCodeController {

    @GetMapping("/morseCode")
    public String morseCode(@RequestParam String code) {
        MorseCode morseCode = new MorseCode();
        return morseCode.convertToMorseCode(code);
    }

}
