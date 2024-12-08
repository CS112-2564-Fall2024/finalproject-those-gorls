package edu.miracosta.cs112.finalproject.finalproject;

import java.util.Random;


    public class ActionsAndEvents {

        private final Random random = new Random();
        private String currentEvent;

        public String generateEvent(String beeType) {
            currentEvent = switch (beeType.toLowerCase()) {
                case "worker" -> getRandomWorkerEvent();
                case "drone" -> getRandomDroneEvent();
                case "queen" -> getRandomQueenEvent();
                default -> "Unknown Bee Type.";
            };
            return currentEvent;
        }

        public String handleEvent(String beeType, boolean userChoice) {
            return switch (beeType.toLowerCase()) {
                case "worker" -> handleWorkerBeeEvent(userChoice);
                case "drone" -> handleDroneBeeEvent(userChoice);
                case "queen" -> handleQueenBeeEvent(userChoice);
                default -> "Unknown Bee Type.";
            };
        }

        // Worker Bee Events
        private String getRandomWorkerEvent() {
            return switch (random.nextInt(7)) {
                case 0 -> "There is a pretty flower in the window, would you like to get a closer look?";
                case 1 -> "The nectar looks very tempting, would you like to sneak a little taste?";
                case 2 -> "The queen has requested all worker bees to the royal room, would you like to attend?";
                case 3 -> "A bear paw is attacking the hive! Would you like to attack?";
                case 4 -> "The sky is looking a bit cloudy... do you still want to go to work?";
                case 5 -> "The larvae are looking a little hungry, would you like to feed them royal jelly?";
                case 6 -> "Winter is approaching and food is scarce, would you like to kick the drones out of the hive?";
                default -> "Unknown Worker Event.";
            };
        }

        private String handleWorkerBeeEvent(boolean userChoice) {
            return switch (currentEvent) {
                case "There is a pretty flower in the window, would you like to get a closer look?" ->
                        userChoice ? "Game over. The flower was plastic and you were attacked by a fly swatter." :
                                "Another bee approached and was swiftly smooshed with a fly swatter.";
                case "The nectar looks very tempting, would you like to sneak a little taste?" ->
                        "It was for the best.";
                case "The queen has requested all worker bees to the royal room, would you like to attend?" ->
                        "She gave everybody in attendance an extra ration of food!";
                case "A bear paw is attacking the hive! Would you like to attack?" ->
                        userChoice ? "Game over. You stung the bear and saved the hive! Unfortunately, your stinger has been ripped from your body." :
                                "The bear was defeated but we lost a lot of friends during the fight.";
                case "The sky is looking a bit cloudy... do you still want to go to work?" ->
                        userChoice && random.nextDouble() < 0.25 ? "Game over. A raindrop shot you down!" :
                                "Luckily the rain was light enough to get home safely.";
                case "The larvae are looking a little hungry, would you like to feed them royal jelly?" ->
                        "I wonder what royal jelly tastes like.";
                case "Winter is approaching and food is scarce, would you like to kick the drones out of the hive?" ->
                        "It was for the better.";
                default -> "Unknown Worker Event.";
            };
        }

        // Drone Bee Events
        private String getRandomDroneEvent() {
            return switch (random.nextInt(6)) {
                case 0 -> "The nectar looks very tempting, would you like to sneak a little taste?";
                case 1 -> "The queen seems very busy today, would you like to offer the queen a snack?";
                case 2 -> "The queen is only mating with five drones today, would you like to volunteer?";
                case 3 -> "The queen declared no work today, would you like to explore the outdoors?";
                case 4 -> "The queen makes eye contact with you across the room, would you like to wink back?";
                case 5 -> "The hive seems to be getting colder, would you like to find a warm place to relax?";
                default -> "Unknown Drone Event.";
            };
        }

        private String handleDroneBeeEvent(boolean userChoice) {
            return switch (currentEvent) {
                case "The nectar looks very tempting, would you like to sneak a little taste?" ->
                        userChoice ? "Game over. You were caught by the guards and publicly executed for treason!" :
                                "Your self-control might have saved your life.";
                case "The queen seems very busy today, would you like to offer the queen a snack?" ->
                        userChoice && random.nextDouble() < 0.25 ? "Game over. The queen was displeased and had you buried alive in honey" :
                                "The queen appreciates the yummy snack.";
                case "The queen is only mating with five drones today, would you like to volunteer?" ->
                        "The hive salutes you for your loyalty.";
                case "The queen declared no work today, would you like to explore the outdoors?" ->
                        userChoice && random.nextDouble() < 0.5 ? "Game over. You only lasted 3 minutes in the wild before getting ran over by a tricycle." :
                                "You had a fun couple hours in the sun!";
                case "The queen makes eye contact with you across the room, would you like to wink back?" ->
                        userChoice ? "Game over. The queen has you executed for humiliating her." :
                                "Good thing you didn't respond, the queen was just staring off.";
                case "The hive seems to be getting colder, would you like to find a warm place to relax?" ->
                        "Game over. After a quick nap, you realized the other drones were evicted due to limited food. You are caught and shortly meet the same demise.";
                default -> "Unknown Drone Event.";
            };
        }

        // Queen Bee Events
        private String getRandomQueenEvent() {
            return switch (random.nextInt(7)) {
                case 0 -> "Laying eggs is a lot of work, would you like to ask your servant for a drink?";
                case 1 -> "The nectar looks very tempting, would you like to sneak a little taste?";
                case 2 -> "The weather is beautiful today! Would you like to announce a day off to the bees?";
                case 3 -> "A drone bee asked for extra food rations this week, would you like to punish him?";
                case 4 -> "A bear is attacking the hive! Do you want to assemble the worker bees to attack?";
                case 5 -> "Winter is approaching and food is sparse, would you like to kick the drones out of the hive?";
                case 6 -> "The bees are getting worried for the queen, would you like to make a public appearance to reassure your subjects?";
                default -> "Unknown Queen Event.";
            };
        }

        private String handleQueenBeeEvent(boolean userChoice) {
            return switch (currentEvent) {
                case "Laying eggs is a lot of work, would you like to ask your servant for a drink?" ->
                        userChoice && random.nextDouble() < 0.25 ? "Game over. The servant poisoned you!" : "Refreshing!";
                case "The nectar looks very tempting, would you like to sneak a little taste?" ->
                        "Being a queen is all about the tough decisions.";
                case "The weather is beautiful today! Would you like to announce a day off to the bees?" ->
                        "Being a queen is all about the tough decisions.";
                case "A drone bee asked for extra food rations this week, would you like to punish him?" ->
                        "Being a queen is all about the tough decisions.";
                case "A bear is attacking the hive! Do you want to assemble the worker bees to attack?" ->
                        "Being a queen is all about the tough decisions.";
                case "Winter is approaching and food is sparse, would you like to kick the drones out of the hive?" ->
                        userChoice ? "They will be missed." : "Game over. The hive starved to death.";
                case "The bees are getting worried for the queen, would you like to make a public appearance to reassure your subjects?" ->
                        userChoice && random.nextDouble() < 0.15 ? "Game over. It was a trick! Your subjects decided to revolt." :
                                "Your subjects were pleased to see you.";
                default -> "Unknown Queen Event.";
            };
        }
    }