package vallegrande.sistemadecontrol.controller;

import vallegrande.sistemadecontrol.model.Tarea;
import vallegrande.sistemadecontrol.model.TareaModel;
import vallegrande.sistemadecontrol.view.GestorTareasView;
import javax.swing.*;

public class GestorTareasController {
    private final TareaModel model;
    private final GestorTareasView view;

    public GestorTareasController(TareaModel model, GestorTareasView view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {
        view.getAgregarBtn().addActionListener(e -> agregar());
        view.getCompletarBtn().addActionListener(e -> completar());
        view.getEliminarBtn().addActionListener(e -> eliminar());
    }

    private void agregar() {
        String texto = view.getTareaField().getText().trim();
        if (!texto.isEmpty()) {
            model.agregarTarea(new Tarea(texto));
            view.getTareaField().setText("");
            actualizarTabla();
        }
    }

    private void completar() {
        int fila = view.getTareaTable().getSelectedRow();
        if (fila != -1) {
            Tarea t = model.getElementAt(fila);
            t.setCompletada(true);
            model.actualizarTarea(fila);
            actualizarTabla();
        }
    }

    private void eliminar() {
        int fila = view.getTareaTable().getSelectedRow();
        if (fila != -1) {
            model.eliminarTarea(fila);
            actualizarTabla();
        }
    }

    private void actualizarTabla() {
        view.getTableModel().setRowCount(0);
        for (int i = 0; i < model.getSize(); i++) {
            Tarea t = model.getElementAt(i);
            String estado = t.isCompletada() ? "Completada" : "Pendiente";
            view.getTableModel().addRow(new Object[]{t.getNombre(), estado});
        }
    }
}