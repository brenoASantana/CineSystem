package src;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

import enumetation.EnumCategoryTicket;
import enumetation.EnumGenderMovie;
import enumetation.EnumTypeTicket;

public class MainGUI extends JFrame {
    // Componentes da interface
    private JTextArea logArea;
    private JMenuBar menuBar;

    public MainGUI() {
        configurarJanela();
        inicializarComponentes();
    }

    private void configurarJanela() {
        setTitle("CineSystem");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        // Área de log
        logArea = new JTextArea();
        logArea.setEditable(false);
        add(new JScrollPane(logArea), BorderLayout.CENTER);

        // Menu Bar
        menuBar = new JMenuBar();
        criarMenus();
        setJMenuBar(menuBar);
    }

    private void criarMenus() {
        // Menu Cadastro
        JMenu menuCadastro = new JMenu("Cadastros");
        adicionarMenuItem(menuCadastro, "Salas", e -> mostrarDialogoSala());
        adicionarMenuItem(menuCadastro, "Filmes", e -> mostrarDialogoFilme());
        adicionarMenuItem(menuCadastro, "Sessões", e -> mostrarDialogoSessao());
        adicionarMenuItem(menuCadastro, "Atores", e -> mostrarDialogoAtor());
        adicionarMenuItem(menuCadastro, "Ingressos", e -> mostrarDialogoIngresso());
        menuBar.add(menuCadastro);

        // Menu Relatórios
        JMenu menuRelatorios = new JMenu("Relatórios");
        adicionarMenuItem(menuRelatorios, "Vendas", e -> mostrarRelatorioVendas());
        adicionarMenuItem(menuRelatorios, "Ocupação Salas", e -> mostrarOcupacaoSalas());
        menuBar.add(menuRelatorios);
    }

    private void adicionarMenuItem(JMenu menu, String texto, ActionListener listener) {
        JMenuItem item = new JMenuItem(texto);
        item.addActionListener(listener);
        menu.add(item);
    }

    // Métodos para mostrar os diálogos de cadastro
    private void mostrarDialogoSala() {
        JDialog dialog = new JDialog(this, "Cadastro de Sala", true);
        JPanel panel = new JPanel(new GridLayout(3, 2));

        panel.add(new JLabel("Número:"));
        JTextField numeroField = new JTextField();
        panel.add(numeroField);

        panel.add(new JLabel("Capacidade:"));
        JTextField capacidadeField = new JTextField();
        panel.add(capacidadeField);

        panel.add(new JLabel("Tipo:"));

        // TODO: Criar enum dos tipos da sala
        JComboBox<String> tipoCombo = new JComboBox<>(new String[] { "Normal", "3D", "VIP" });
        panel.add(tipoCombo);

        if (JOptionPane.showConfirmDialog(dialog, panel, "Cadastrar Sala",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            // Aqui você implementaria a lógica de cadastro
            logArea.append("Sala cadastrada: " + numeroField.getText() + "\n");
        }
    }

    private void mostrarDialogoFilme() {
        JDialog dialog = new JDialog(this, "Cadastro de Filme", true);
        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Título:"));
        JTextField tituloField = new JTextField();
        panel.add(tituloField);

        panel.add(new JLabel("Diretor:"));
        JTextField diretorField = new JTextField();
        panel.add(diretorField);

        panel.add(new JLabel("Gênero:"));
        JComboBox<EnumGenderMovie> generoCombo = new JComboBox<>(EnumGenderMovie.values());
        panel.add(generoCombo);

        panel.add(new JLabel("Duração (min):"));
        JSpinner duracaoSpinner = new JSpinner(new SpinnerNumberModel(120, 1, 300, 1));
        panel.add(duracaoSpinner);

        panel.add(new JLabel("Atores:"));
        JButton atoresButton = new JButton("Selecionar Atores");
        panel.add(atoresButton);

        if (JOptionPane.showConfirmDialog(dialog, panel, "Cadastrar Filme",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            // Lógica de cadastro do filme
            logArea.append("Filme cadastrado: " + tituloField.getText() + "\n");
        }
    }

    private void mostrarDialogoSessao() {
        // Implementação similar para sessões
    }

    private void mostrarDialogoAtor() {
        // Implementação similar para atores
    }

    private void mostrarDialogoIngresso() {
        JDialog dialog = new JDialog(this, "Venda de Ingresso", true);
        JPanel panel = new JPanel(new GridLayout(4, 2));

        panel.add(new JLabel("Categoria:"));
        JComboBox<EnumCategoryTicket> categoriaCombo = new JComboBox<>(EnumCategoryTicket.values());
        panel.add(categoriaCombo);

        panel.add(new JLabel("Tipo:"));
        // TODO: Se o ingresso for meia, conferir se realmente tem direito ao desconto
        JComboBox<EnumTypeTicket> tipoCombo = new JComboBox<>(EnumTypeTicket.values());
        panel.add(tipoCombo);

        panel.add(new JLabel("Sessão:"));
        // TODO: Consultar as sessões disponíveis
        JComboBox<String> sessaoCombo = new JComboBox<>(new String[] { "Sessão 1", "Sessão 2" });
        panel.add(sessaoCombo);

        panel.add(new JLabel("Quantidade:"));
        JSpinner quantidadeSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        panel.add(quantidadeSpinner);

        if (JOptionPane.showConfirmDialog(dialog, panel, "Vender Ingresso",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            // Lógica de venda de ingresso
            logArea.append("Ingresso vendido: " + quantidadeSpinner.getValue() + " unidades\n");
        }
    }

    private void mostrarRelatorioVendas() {
        // Implementação de relatório
    }

    private void mostrarOcupacaoSalas() {
        // Implementação de ocupação
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }
}