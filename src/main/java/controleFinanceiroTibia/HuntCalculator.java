package controleFinanceiroTibia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HuntCalculator extends JFrame {
    private JTextField tempoField, profitField, cotacaoField;
    private JTextArea resultadoArea;

    public HuntCalculator() {
        setTitle("Controle de Hunts - Tibia");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel tempoLabel = new JLabel("Tempo de Hunt (horas):");
        tempoField = new JTextField();

        JLabel profitLabel = new JLabel("Profit da Hunt (em KK):");
        profitField = new JTextField();

        JLabel cotacaoLabel = new JLabel("Cotação 1kk → R$:"); 
        cotacaoField = new JTextField();

        JButton calcularButton = new JButton("Calcular");

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        add(tempoLabel);
        add(tempoField);

        add(profitLabel);
        add(profitField);

        add(cotacaoLabel);
        add(cotacaoField);

        add(calcularButton);
        add(new JLabel()); 

        add(new JScrollPane(resultadoArea));

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int tempo = Integer.parseInt(tempoField.getText());
                    double profitKK = Double.parseDouble(profitField.getText());
                    double cotacao = Double.parseDouble(cotacaoField.getText());

                    double profitReais = profitKK * cotacao;

                    resultadoArea.setText("📊 Resultado da Hunt:\n");
                    resultadoArea.append("⏳ Tempo: " + tempo + " horas\n");
                    resultadoArea.append("💰 Profit: " + profitKK + " KK\n");
                    resultadoArea.append("🇧🇷 Em Reais: R$ " + String.format("%.2f", profitReais));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HuntCalculator().setVisible(true));
    }
}
