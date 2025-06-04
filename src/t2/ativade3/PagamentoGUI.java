package t2.ativade3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PagamentoGUI extends JFrame {

    private JTextField valorField;
    private JComboBox<String> metodoPagamentoBox;
    private JLabel resultadoLabel;

    public PagamentoGUI() {
        setTitle("Pagamento");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Valor:"));
        valorField = new JTextField();
        add(valorField);

        add(new JLabel("Método de Pagamento:"));
        metodoPagamentoBox = new JComboBox<>(new String[]{"Boleto", "Crédito", "Débito"});
        add(metodoPagamentoBox);

        JButton pagarButton = new JButton("Pagar");
        add(pagarButton);

        resultadoLabel = new JLabel("Total: ");
        add(resultadoLabel);

        pagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPagamento();
            }
        });

        setVisible(true);
    }

    private void calcularPagamento() {
        try {
            float valor = Float.parseFloat(valorField.getText());
            PagamentoStrategy pagamento = new PagamentoStrategy();

            String metodoSelecionado = (String) metodoPagamentoBox.getSelectedItem();
            if (metodoSelecionado.equals("Boleto")) {
                pagamento.setTipoPagamento(new BoletoBancario());
            } else if (metodoSelecionado.equals("Crédito")) {
                pagamento.setTipoPagamento(new Credito());
            } else if (metodoSelecionado.equals("Débito")) {
                pagamento.setTipoPagamento(new Debito());
            }

            float total = pagamento.pagar(valor);
            resultadoLabel.setText("Total: R$ " + total);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um valor válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}