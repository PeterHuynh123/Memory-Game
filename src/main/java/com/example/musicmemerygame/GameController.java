package com.example.musicmemerygame;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.IOException;
import com.example.musicmemerygame.AudioController.soundEffectEnums;

public class GameController {
    private AudioController audioController;
    @FXML
    private ImageView IVturtle, IVporcupineFish, IVjellyFish, IVoctopus;

    public GameController() throws IOException {
        audioController = new AudioController();
    }

    @FXML
    protected void onClickHandler(MouseEvent e) {
        final String id = ((Node) e.getSource()).getId();
        switch (id) {
            case "IVturtle":
                this.audioController.play(soundEffectEnums.TURTLE);
                break;
            case "IVporcupineFish":
                this.audioController.play(soundEffectEnums.PORCUPINE);
                break;
            case "IVjellyFish":
                this.audioController.play(soundEffectEnums.JELLYFISH);
                break;
            case "IVoctopus":
                this.audioController.play(soundEffectEnums.OCTOPUS);
                break;
        }
    }

    private final String handPath = "file:src/main/resources/com/example/musicmemerygame/img/hand.png";
    private final Image newCursor = new Image(handPath);

    @FXML
    protected void onMouseEntered(MouseEvent e) throws IOException {

        ((Node) e.getSource()).setCursor(new ImageCursor(newCursor));
        final String id = ((Node) e.getSource()).getId();
        switch (id) {
            case "IVturtle":
                increaseImageSize(IVturtle);
                break;
            case "IVporcupineFish":
                increaseImageSize(IVporcupineFish);
                break;
            case "IVjellyFish":
                increaseImageSize(IVjellyFish);
                break;
            case "IVoctopus":
                increaseImageSize(IVoctopus);
                break;
        }
    }

    @FXML
    protected void onMouseExited(MouseEvent e) {
        ((Node) e.getSource()).setCursor(Cursor.DEFAULT);
        final String id = ((Node) e.getSource()).getId();
        switch (id) {
            case "IVturtle":
                decreaseImageSize(IVturtle);
                break;
            case "IVporcupineFish":
                decreaseImageSize(IVporcupineFish);
                break;
            case "IVjellyFish":
                decreaseImageSize(IVjellyFish);
                break;
            case "IVoctopus":
                decreaseImageSize(IVoctopus);
                break;
        };
    }

    private void increaseImageSize (ImageView id) {
        double increasedSize = 230;
        double translatePos = -5;
        id.setFitWidth(increasedSize);
        id.setFitHeight(increasedSize);
        id.setTranslateX(translatePos);
        id.setTranslateY(translatePos);
    }

    private void decreaseImageSize (ImageView id) {
        double decreasedSize = 200;
        double translatePos = 5;
        id.setFitWidth(decreasedSize);
        id.setFitHeight(decreasedSize);
        id.setTranslateX(translatePos);
        id.setTranslateY(translatePos);
    }

}
