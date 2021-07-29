/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Challenge;

import org.jeasy.rules.api.*;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.core.RuleBuilder;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rules rules = new Rules();

        Facts facts = new Facts();

        Rule BatteryTerminalsRule = new RuleBuilder()
                .name("BatteryTerminals")
                .description("If the battery terminals are corrupted")
                .when(fact -> fact.get("IsCarSilent").equals(true))
                .then(action -> {
                    System.out.println("Are the battery terminals corroded?");

                    if (evaluateInput(System.in))
                        System.out.println("Clean Terminals and try starting again.");
                    else
                        System.out.println("Replace cables and try starting again.");
                })
                .priority(1)
                .build();

        Rule CarHasFuelInjector = new RuleBuilder()
                .name("CarHasFuelInjector")
                .description("If has fuel injector")
                .when(fact -> fact.get("startAndDies").equals(true))
                .then(action -> {
                    System.out.println("Does you car have fuel injection?");

                    if(evaluateInput(System.in))
                        System.out.println("Get in for service.");
                    else
                        System.out.println("Check to ensure the choke is opening and closing.");
                })
                .priority(4)
                .build();

        Rule EngineStartsAndDieRule = new RuleBuilder()
                .name("EngineStartsAndDie")
                .description("If engine starts and dies")
                .when(fact -> fact.get("crankUpButFailToStart").equals(false))
                .then(action -> {
                    System.out.println("Does the engine start and then die?");
                    action.add(new Fact<>("startAndDies", evaluateInput(System.in)));

                    if (action.get("startAndDies").equals(false))
                        System.out.println("This should not be possible.");
                })
                .priority(3)
                .build();

        Rule CrankUpFailToStartRule = new RuleBuilder()
                .name("CrankUpFailToStart")
                .description("If crank up but fail to start")
                .when(fact -> fact.get("hasSlickingNoise").equals(false))
                .then(action -> {
                    System.out.println("Does the car crank up but fail to start?");
                    action.add(new Fact<>("crankUpButFailToStart", evaluateInput(System.in)));

                    if(action.get("crankUpButFailToStart").equals(true))
                        System.out.println("Check spark plug connections.");
                })
                .priority(2)
                .build();

        Rule CarMakesNoiseRule = new RuleBuilder()
                .name("CareMakesNoise")
                .description("If the car makes slicking noise")
                .when(fact -> fact.get("IsCarSilent").equals(false))
                .then(action -> {
                    System.out.println("Does the car make a slicking noise?");
                    action.add(new Fact<>("hasSlickingNoise", evaluateInput(System.in)));

                    if(action.get("hasSlickingNoise").equals(true))
                        System.out.println("Replace the battery");
                })
                .priority(0)
                .build();

        rules.register(BatteryTerminalsRule);
        rules.register(CarMakesNoiseRule);
        rules.register(CrankUpFailToStartRule);
        rules.register(EngineStartsAndDieRule);
        rules.register(CarHasFuelInjector);

        System.out.println("Is the car silent when you turn the key?");
        facts.put("IsCarSilent", evaluateInput(System.in));

        RulesEngineParameters parameters = new RulesEngineParameters();

        RulesEngine rulesEngine = new DefaultRulesEngine();
        rulesEngine.fire(rules, facts);


    }

    public static boolean evaluateInput(InputStream inputStream) {
        return new Scanner(inputStream).nextLine().equalsIgnoreCase("yes");
    }
}
