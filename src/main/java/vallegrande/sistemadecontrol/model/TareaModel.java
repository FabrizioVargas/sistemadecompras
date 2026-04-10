package vallegrande.sistemadecontrol.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TareaModel extends AbstractListModel<Tarea> {
    private final List<Tarea> tareas = new ArrayList<>();

    @Override
    public int getSize() { return tareas.size(); }

    @Override
    public Tarea getElementAt(int index) { return tareas.get(index); }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        fireIntervalAdded(this, tareas.size() - 1, tareas.size() - 1);
    }

    public void eliminarTarea(int index) {
        if (index >= 0 && index < tareas.size()) {
            tareas.remove(index);
            fireIntervalRemoved(this, index, index);
        }
    }

    public void actualizarTarea(int index) {
        fireContentsChanged(this, index, index);
    }
}