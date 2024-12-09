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

        public String handleEvent(String beeType, boolean userChoice, String currentEvent) {
            System.out.println("Handling event for bee type: " + beeType);
            System.out.println("User choice: " + userChoice);
            System.out.println("Current Event: " + currentEvent);

            String result = switch (beeType.toLowerCase()) {
                case "worker" -> handleWorkerBeeEvent(userChoice, currentEvent);
                case "drone" -> handleDroneBeeEvent(userChoice, currentEvent);
                case "queen" -> handleQueenBeeEvent(userChoice, currentEvent);
                default -> {
                    System.out.println("Unknown bee type: " + beeType);
                    yield "Unknown Bee Type.";
                }
            };

            System.out.println("Event result: " + result);
            return result;
        }

        // Worker Bee Events
        private String getRandomWorkerEvent() {
            String[] events = {
                "There is a pretty flower in the window, would you like to get a closer look?",
                "The nectar looks very tempting, would you like to sneak a little taste?",
                "The queen has requested all worker bees to the royal room, would you like to attend?",
                "A bear paw is attacking the hive! Would you like to attack?",
                "The sky is looking a bit cloudy... do you still want to go to work?",
                "The larvae are looking a little hungry, would you like to feed them royal jelly?",
                "Winter is approaching and food is scarce, would you like to kick the drones out of the hive?"
            };
            return events[random.nextInt(events.length)];
        }

        // Queen Bee Events
        private String getRandomQueenEvent() {
            String[] events = {
                "Laying eggs is a lot of work, would you like to ask your servant for a drink?",
                "The nectar looks very tempting, would you like to sneak a little taste?",
                "The weather is beautiful today! Would you like to announce a day off to the bees?",
                "A drone bee asked for extra food rations this week, would you like to punish him?",
                "A bear is attacking the hive! Do you want to assemble the worker bees to attack?",
                "Winter is approaching and food is sparse, would you like to kick the drones out of the hive?",
                "The bees are getting worried for the queen, would you like to make a public appearance to reassure your subjects?"
            };
            return events[random.nextInt(events.length)];
        }

        // Drone Bee Events
        private String getRandomDroneEvent() {
            String[] events = {
                "The nectar looks very tempting, would you like to sneak a little taste?",
                "The queen has been working very hard today, would you like to offer the queen a snack?",
                "The queen is only mating with five drones today, would you like to volunteer?",
                "The queen declared no work today, would you like to explore the outdoors?",
                "The queen makes eye contact with you across the room, would you like to wink back?",
                "The hive seems to be getting colder, would you like to find a warm place to relax?"
            };
            return events[random.nextInt(events.length)];
        }

        private String handleWorkerBeeEvent(boolean userChoice, String currentEvent) {
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

        private String handleDroneBeeEvent(boolean userChoice, String currentEvent) {
            return switch (currentEvent) {
                case "The nectar looks very tempting, would you like to sneak a little taste?" ->
                        userChoice ? "Game over. You were caught by the guards and publicly executed for treason!" :
                                "Your self-control might have saved your life.";
                case "The queen has been working very hard today, would you like to offer the queen a snack?" ->
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

        private String handleQueenBeeEvent(boolean userChoice, String currentEvent) {
            return switch (currentEvent) {
                case "Laying eggs is a lot of work, would you like to ask your servant for a drink?" ->
                        userChoice && random.nextDouble() < 0.25 ? "Game over. The servant poisoned you!" : "Refreshing!";
                case "The nectar looks very tempting, would you like to sneak a little taste?" ->
                        "Silly bee! You're queen, you never have to 'sneak a taste'.";
                case "The weather is beautiful today! Would you like to announce a day off to the bees?" ->
                        "The bees are thankful for your kindness.";
                case "A drone bee asked for extra food rations this week, would you like to punish him?" ->
                        "Being a queen is all about the tough decisions.";
                case "A bear is attacking the hive! Do you want to assemble the worker bees to attack?" ->
                        "We lost many workers along the way, but atleast the hive is safe.";
                case "Winter is approaching and food is sparse, would you like to kick the drones out of the hive?" ->
                        userChoice ? "They will be missed." : "Game over. The hive starved to death.";
                case "The bees are getting worried for the queen, would you like to make a public appearance to reassure your subjects?" ->
                        userChoice && random.nextDouble() < 0.15 ? "Game over. It was a trick! Your subjects decided to revolt." :
                                "Your subjects were pleased to see you.";
                default -> "Unknown Queen Event.";
            };
        }
    }