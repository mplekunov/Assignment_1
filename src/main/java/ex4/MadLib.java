/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

public class MadLib {
    private String noun;
    private String verb;
    private String adjective;
    private static String template = "Do you ? your ? quickly? That's hilarious!";

    public MadLib(String noun, String verb, String adjective) {
        this.noun = noun;
        this.verb = verb;
        this.adjective = adjective;
    }

    public String getCompletedTemplate() {
        return this.template.replaceFirst("\\?", this.verb)
                .replaceFirst("\\?", this.adjective.concat(" " + this.noun));
    }

}
