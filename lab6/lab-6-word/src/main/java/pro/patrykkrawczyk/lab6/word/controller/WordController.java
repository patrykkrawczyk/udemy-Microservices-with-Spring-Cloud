package pro.patrykkrawczyk.lab6.word.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.patrykkrawczyk.lab6.word.domain.Word;

import java.util.Random;

@RestController
public class WordController {

    private final Random random = new Random();

    @Value("${words}") String[] words;

    @GetMapping
    public Word getWord() {
        String word = words[random.nextInt(words.length)];
        return new Word(word);
    }
}
