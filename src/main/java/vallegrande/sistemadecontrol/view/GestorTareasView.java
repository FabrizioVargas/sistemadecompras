package vallegrande.sistemadecontrol.view;

import vallegrande.sistemadecontrol.model.TareaModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GestorTareasView extends JFrame {
    // 1. Declaración de variables (Atributos)
    private final JTextField tareaField = new JTextField();
    private final JButton agregarBtn = new JButton("Agregar");
    private final JButton completarBtn = new JButton("Completar");
    private final JButton eliminarBtn = new JButton("Eliminar");
    private final JTable tareaTable;
    private final DefaultTableModel tableModel;

    // 2. Constructor (Donde se arma la interfaz)
    public GestorTareasView(TareaModel model) {
        super("Gestor de Tareas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 450);
        setLocationRelativeTo(null);

        // --- PANEL SUPERIOR ---
        JPanel panelSuperior = new JPanel(new BorderLayout(10, 10));
        panelSuperior.setBorder(BorderFactory.createTitledBorder(null, "Mis Tareas", 0, 0, new Font("Arial", Font.BOLD, 18)));

        estilizarBoton(agregarBtn, new Color(92, 107, 232));

        panelSuperior.add(tareaField, BorderLayout.CENTER);
        panelSuperior.add(agregarBtn, BorderLayout.EAST);

        // --- PANEL CENTRAL ---
        String[] columnas = {"Tarea", "Estado"};
        tableModel = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        tareaTable = new JTable(tableModel);
        tareaTable.setRowHeight(30);
        JScrollPane scrollPane = new JScrollPane(tareaTable);

        // --- PANEL INFERIOR ---
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        estilizarBoton(completarBtn, new Color(40, 190, 110));
        estilizarBoton(eliminarBtn, new Color(230, 70, 70));

        panelInferior.add(completarBtn);
        panelInferior.add(eliminarBtn);

        // ENSAMBLAJE FINAL
        setLayout(new BorderLayout(15, 15));
        add(panelSuperior, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
        ((JPanel)getContentPane()).setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    }

    // 3. Método para dar color y estilo sólido a los botones
    private void estilizarBoton(JButton boton, Color colorFondo) {
        boton.setBackground(colorFondo);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 12));
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(true);
        boton.setOpaque(true);
    }

    // 4. Getters (Para que el controlador pueda acceder)
    public JTextField getTareaField() {
        return tareaField;
    }

    public JButton getAgregarBtn() {
        return agregarBtn;
    }

    public JButton getCompletarBtn() {
        return completarBtn;
    }

    public JButton getEliminarBtn() {
        return eliminarBtn;
    }

    public JTable getTareaTable() {
        return tareaTable;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
}