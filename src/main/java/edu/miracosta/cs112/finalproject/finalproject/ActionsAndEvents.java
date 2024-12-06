package edu.miracosta.cs112.finalproject.finalproject;

import java.util.Random;


    public class ActionsAndEvents {

        private static final Random RANDOM = new Random();

        public static String workerBeeEvent1() {
            return "There is a pretty flower in the window, would you like to get a closer look?";
        }

        public static String workerBeeEvent2() {
            return "The nectar looks very tempting, would you like to sneak a little taste?";
        }

        public static String workerBeeEvent3() {
            return "The queen has requested all worker bees to the royal room, would you like to attend?";
        }

        public static String workerBeeEvent4() {
            return "A bear paw is attacking the hive! Would you like to attack?";
        }

        public static String workerBeeEvent5() {
            return "The sky is looking a bit cloudy... do you still want to go to work?";
        }

        public static String workerBeeEvent6() {
            return "The larvae are looking a little hungry, would you like to feed them royal jelly?";
        }

        public static String workerBeeEvent7() {
            return "Winter is approaching and food is scarce, would you like to kick the drones out of the hive?";
        }

        public static String getRandomWorkerBeeEvent() {
            int randomEvent = RANDOM.nextInt(7);
            return switch (randomEvent) {
                case 0 -> workerBeeEvent1();
                case 1 -> workerBeeEvent2();
                case 2 -> workerBeeEvent3();
                case 3 -> workerBeeEvent4();
                case 4 -> workerBeeEvent5();
                case 5 -> workerBeeEvent6();
                case 6 -> workerBeeEvent7();
                default -> "Unknown Worker Event.";
            };
        }

        public static String droneBeeEvent1() {
            return "The nectar looks very tempting, would you like to sneak a little taste?";
        }

        public static String droneBeeEvent2() {
            return "The queen seems very busy today, would you like to offer the queen a snack?";
        }

        public static String droneBeeEvent3() {
            return "The queen is only mating with five drones today, would you like to volunteer?";
        }

        public static String droneBeeEvent4() {
            return "The queen declared no work today, would you like to explore the outdoors?";
        }

        public static String droneBeeEvent5() {
            return "The bee waiting in front of you in line seems sick today, would you like to alert the guard?";
        }

        public static String droneBeeEvent6() {
            return "The queen makes eye contact with you across the room, would you like to wink back?";
        }

        public static String droneBeeEvent7() {
            return "The hive seems to be getting colder, would you like to find a warm place to relax?";
        }

        public static String getRandomDroneBeeEvent() {
            int randomEvent = RANDOM.nextInt(7);
            return switch (randomEvent) {
                case 0 -> droneBeeEvent1();
                case 1 -> droneBeeEvent2();
                case 2 -> droneBeeEvent3();
                case 3 -> droneBeeEvent4();
                case 4 -> droneBeeEvent5();
                case 5 -> droneBeeEvent6();
                case 6 -> droneBeeEvent7();
                default -> "Unknown Drone Event.";
            };
        }

        public static String queenBeeEvent1() {
            return "Laying eggs is a lot of work, would you like to ask your servant for a drink?";
        }

        public static String queenBeeEvent2() {
            return "The nectar looks very tempting, would you like to sneak a little taste?";
        }

        public static String queenBeeEvent3() {
            return "The weather is beautiful today! Would you like to announce a day off to the bees?";
        }

        public static String queenBeeEvent4() {
            return "A drone bee asked for extra food rations this week, would you like to punish him?";
        }

        public static String queenBeeEvent5() {
            return "A bear is attacking the hive! Do you want to assemble the worker bees to attack?";
        }

        public static String queenBeeEvent6() {
            return "Winter is approaching and food is sparse, would you like to kick the drones out of the hive?";
        }

        public static String queenBeeEvent7() {
            return "The bees are getting worried for the queen, would you like to make a public appearance to reassure your subjects?";
        }

        public static String getRandomQueenBeeEvent() {
            int randomEvent = RANDOM.nextInt(7);
            return switch (randomEvent) {
                case 0 -> queenBeeEvent1();
                case 1 -> queenBeeEvent2();
                case 2 -> queenBeeEvent3();
                case 3 -> queenBeeEvent4();
                case 4 -> queenBeeEvent5();
                case 5 -> queenBeeEvent6();
                case 6 -> queenBeeEvent7();
                default -> "Unknown Queen Event.";
            };
        }

        public static String getDailyEvent(Bee bee) {
            if (bee instanceof WorkerBeeActions) {
                return getRandomWorkerBeeEvent();
            } else if (bee instanceof DroneBeeActions) {
                return getRandomDroneBeeEvent();
            } else if (bee instanceof QueenBeeActions) {
                return getRandomQueenBeeEvent();
            } else {
                return "This bee type doesn't have events.";
            }
        }
    }


