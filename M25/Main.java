public class Main {
    public static void main(String[] args) {
        DLG dlg = new DLG();

        dlg.setLayout(null);
        dlg.add(dlg.sp);
        dlg.setBounds(300,300,300,300);
        dlg.setResizable(false);
        dlg.setTitle("Листбоксы Сталина");
        dlg.setVisible(true);
        System.exit(0);
    }
}m