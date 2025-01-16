/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

/**
 *
 * @author Sandeep K
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AlarmPlayer {

    private static volatile Clip sound;
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void playAlarm() {
        if (!Variable.alarm_running && !executor.isShutdown()) {
            executor.submit(() -> {
                synchronized (AlarmPlayer.class) {
                    if (Variable.alarm_running) {
                        return; // Double-check inside the synchronized block
                    }
                    try (InputStream rawStream = AlarmPlayer.class.getResourceAsStream("/alarm.wav");
                            InputStream bufferedStream = new BufferedInputStream(rawStream)) {

                        if (rawStream == null) {
                            throw new IOException("Alarm tone resource not found in package.");
                        }

                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bufferedStream);
                        sound = AudioSystem.getClip();
                        sound.open(audioInputStream);
                        sound.loop(Clip.LOOP_CONTINUOUSLY);
                        Variable.alarm_running = true;

                    } catch (UnsupportedAudioFileException e) {
                        System.err.println("Unsupported audio file: " + e.getMessage());
                    } catch (LineUnavailableException e) {
                        System.err.println("Audio line unavailable: " + e.getMessage());
                    } catch (IOException e) {
                        System.err.println("Error loading alarm sound: " + e.getMessage());
                    }
                }
            });
        }
    }

    public static void pauseAlarm() {
        if (!executor.isShutdown()) {
            executor.submit(() -> {
                synchronized (AlarmPlayer.class) {
                    if (sound != null && sound.isRunning()) {
                        sound.stop();
                        sound.close(); // Optional: Remove if reusing the clip
                    }
                    Variable.alarm_running = false;
                }
            });
        } else {
            System.err.println("Executor is shut down; cannot pause the alarm.");
        }
    }

//    public static void shutdownExecutor() {
//        try {
//            executor.shutdownNow();
//            System.out.println("Executor has been shut down.");
//        } catch (Exception e) {
//            System.err.println("Error shutting down executor: " + e.getMessage());
//        }
//    }
}
