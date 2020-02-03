package br.com.sisgete.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

@SuppressWarnings("serial")
public class ColorirLinhaStatus extends DefaultTableCellRenderer {

    private final int colunaStatus;

    public ColorirLinhaStatus(int colunaTabela) {
        this.colunaStatus = colunaTabela;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus,
            int row, int col) {
        Font font = new Font("DejaVu Sans", Font.BOLD, 16);
        switch (table.getValueAt(row, colunaStatus).toString()) {

            case "LIBERADO":
                setForeground(Color.BLACK);
                setBackground(Color.GREEN);
                setFont(font);
                setHorizontalAlignment(CENTER);
                break;

            case "EM OBSERVAÇÃO":
                setForeground(Color.BLACK);
                setBackground(Color.YELLOW);
                setFont(font);
                setHorizontalAlignment(CENTER);
                break;

            case "EM TRATAMENTO":
                setForeground(Color.BLACK);
                setBackground(Color.RED);
                setFont(font);
                setHorizontalAlignment(CENTER);
                break;

            default:
                setForeground(Color.BLACK);
                setBackground(Color.WHITE);
                setHorizontalAlignment(CENTER);
                break;
        }
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        return this;
    }

}
