public class Main {
    public static void main(String[] args) {
        DLG dlg = new DLG();

        dlg.setBounds(300,300,300,300);
        dlg.setResizable(false);
        dlg.setLayout(null);
        dlg.setTitle("Класс JMenuBar Сталина");
        dlg.setJMenuBar(dlg.MenuBar);
        dlg.setVisible(true);
        System.exit(0);
    }
}