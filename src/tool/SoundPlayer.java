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
import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class SoundPlayer extends JFrame implements KeyListener {

    private Clip audioClip;

    public SoundPlayer() {
        // Set up the JFrame
        setTitle("Sound Player");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setVisible(true);
    }

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

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_S) {
            if (audioClip != null && audioClip.isRunning()) {
                audioClip.stop();
                audioClip.close();
                System.out.println("Playback stopped.");
                System.exit(0); // Exit the program
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    public static void main(String[] args) {
        SoundPlayer player = new SoundPlayer();
        player.playAudio();
    }
}
