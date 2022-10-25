
import javax.swing.*;

class Main {
    public static void main(String[] args) {
        Marco marco = new Marco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class Marco extends JFrame {
    public Marco() {
        setBounds(300, 300, 300, 300);
        setTitle("Edit-Hotcer");
        add(new Panel());
    }
}

class Panel extends JPanel {
    public Panel() {
        tPane = new JTabbedPane();
        add(tPane);
    }

    private JTabbedPane tPane;
}