/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Sandeep K
 */
public class PlayAlarm {

    private Clip audioClip;

    public void playAudio() {
        try {
            // Load the audio file from the package
            InputStream audioSrc = SoundPlayer.class.getResourceAsStream("/alarm.wav");
            if (audioSrc == null) {
                System.err.println("Audio file not found!");
                return;
            }

            // Wrap the InputStream in a BufferedInputStream
            InputStream bufferedIn = new BufferedInputStream(audioSrc);

            // Create an AudioInputStream from the BufferedInputStream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            // Get the audio format
            AudioFormat format = audioStream.getFormat();

            // Get a line that matches the format
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Obtain and open the line
            audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);

            // Add a listener to detect when the playback is complete
            audioClip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    audioClip.setFramePosition(0); // Reset to the beginning
                    audioClip.start(); // Loop playback
                }
            });

            // Start playing the audio
            audioClip.start();
            System.out.println("Playback started. Press 's' to stop.");

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void stopAudio() {
        System.out.println("Stop Audio");
        try {
            if (audioClip != null && audioClip.isRunning()) {
                audioClip.stop();
                audioClip.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
