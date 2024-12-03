package edu.miracosta.cs112.finalproject.finalproject;

import java.util.Random;


    public class DoWork {

        private static final Random RANDOM = new Random();

        private static final String[] WORKER_TASKS = {
                "gathering nectar",
                "collecting pollen",
                ""
        };

        private static final String[] DRONE_TASKS = {
                "mate with queen"
        };

        private static final String[] QUEEN_TASKS = {
                "lay eggs"
        };

        public static String performTask(Bee bee) {
            return switch (bee) {
                case WorkerBeeActions workerBeeActions -> WORKER_TASKS[RANDOM.nextInt(WORKER_TASKS.length)];
                case DroneBeeActions droneBeeActions -> DRONE_TASKS[RANDOM.nextInt(DRONE_TASKS.length)];
                case QueenBeeActions queenBeeActions -> QUEEN_TASKS[RANDOM.nextInt(QUEEN_TASKS.length)];
                case null, default -> "This bee doesn't seem to have a task.";
            };
        }
    }


