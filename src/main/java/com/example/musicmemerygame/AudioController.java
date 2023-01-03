package com.example.musicmemerygame;

import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

import java.io.IOException;


public class AudioController {
    private Media turtle, octopus, porcupine, jellyfish;

    private MediaPlayer player;

    public AudioController() throws IOException {
        this.jellyfish = new Media(MainApp.class.getResource("sound/jellyfish.wav").toExternalForm());
        this.turtle = new Media(MainApp.class.getResource("sound/turtle.wav").toExternalForm());
        this.porcupine = new Media(MainApp.class.getResource("sound/porcupine.wav").toExternalForm());
        this.octopus = new Media(MainApp.class.getResource("sound/octopus.wav").toExternalForm());
    }

    private soundEffectEnums soundEffect;
    public enum soundEffectEnums {
        TURTLE,
        OCTOPUS,
        PORCUPINE,
        JELLYFISH
    }

    public void play(soundEffectEnums soundEffect) {
        switch (soundEffect) {
            case TURTLE:
                player = new MediaPlayer(this.turtle);
                player.play();
                break;
            case OCTOPUS:
                player = new MediaPlayer(this.octopus);
                player.play();
                break;
            case PORCUPINE:
                player = new MediaPlayer(this.porcupine);
                player.play();
                break;
            case JELLYFISH:
                player = new MediaPlayer(this.jellyfish);
                player.play();
                break;

        }
    }
}
