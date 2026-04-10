package vallegrande.sistemadecontrol;

import vallegrande.sistemadecontrol.controller.GestorTareasController;
import vallegrande.sistemadecontrol.model.TareaModel;
import vallegrande.sistemadecontrol.view.GestorTareasView;
import javax.swing.*;

public class GestorTareasApp {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { e.printStackTrace(); }

        SwingUtilities.invokeLater(() -> {
            TareaModel model = new TareaModel();
            GestorTareasView view = new GestorTareasView(model);
            new GestorTareasController(model, view);
            view.setVisible(true);
        });
    }
}
