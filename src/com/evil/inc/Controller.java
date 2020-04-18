package com.evil.inc;

import com.sun.org.apache.regexp.internal.RE;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.evil.inc.Phase.GREEN;
import static com.evil.inc.Phase.RED;
import static com.evil.inc.Phase.REFACTOR;

public class Controller {

    @FXML
    public Button redButton;
    @FXML
    public Button greenButton;
    @FXML
    public Button blueButton;
    @FXML
    public Button nextButton;
    @FXML
    public Text cycleText;
    @FXML
    private ImageView cycleImage;

    private Phase currentPhase;

    private Map<Phase, String> cycleLaws = new HashMap<Phase, String>() {{
        put(RED, "Create a unit tests that fails.");
        put(GREEN, "Write production code that makes that test pass.");
        put(REFACTOR, "Clean up the mess you just made.");
    }};

    private Map<Phase, String> cycleLawsImagePaths = new HashMap<Phase, String>() {{
        put(RED, "/resources/red.png");
        put(GREEN, "/resources/green.png");
        put(REFACTOR, "/resources/refactor.png");
    }};

    public void initialize() {
        cycleImage.setImage(new Image(cycleLawsImagePaths.get(RED)));
        cycleText.setText(cycleLaws.get(RED));
        currentPhase = RED;
    }

    public void toGreenPhase() {
        cycleImage.setImage(new Image(cycleLawsImagePaths.get(GREEN)));
        cycleText.setText(cycleLaws.get(GREEN));
        currentPhase = GREEN;
    }

    public void toRedPhase() {
        cycleImage.setImage(new Image(cycleLawsImagePaths.get(RED)));
        cycleText.setText(cycleLaws.get(RED));
        currentPhase = RED;
    }

    public void toRefactorPhase() {
        cycleImage.setImage(new Image(cycleLawsImagePaths.get(REFACTOR)));
        cycleText.setText(cycleLaws.get(REFACTOR));
        currentPhase = REFACTOR;
    }

    public void toNextPhase(){
        switch (currentPhase){
            case RED:
                toGreenPhase();
                break;
            case GREEN:
                toRefactorPhase();
                break;
            case REFACTOR:
                toRedPhase();
                break;
        }
    }

}
