package view;

import controller.KnowledgeController;
import model.Putusan;
import model.StatistikPutusan;
import util.InputHandler;
import util.DataTidakValidException;
import java.util.ArrayList;


public class ConsoleView {

    private KnowledgeController controller;
    private InputHandler input;

    public ConsoleView(KnowledgeController controller) {
        this.controller = controller;
        this.input = new InputHandler();
    }

}
