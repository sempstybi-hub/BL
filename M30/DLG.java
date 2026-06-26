import javax.swing.*;

public class DLG extends JDialog {
    private JPanel contentPane;

    public DLG() {
        setContentPane(contentPane);
        setModal(true);

        startOfficeFlow();
    }

    private void startOfficeFlow() {

        Runtime rt = Runtime.getRuntime();

        int ans1 = askUser("Open Word?");
        if (ans1 == JOptionPane.YES_OPTION) {
            openApp(rt, "WINWORD.EXE", "Word");
            return;
        }

        int ans2 = askUser("Open Excel?");
        if (ans2 == JOptionPane.YES_OPTION) {
            openApp(rt, "EXCEL.EXE", "Excel");
            return;
        }

        int ans3 = askUser("Open PowerPoint?");
        if (ans3 == JOptionPane.YES_OPTION) {
            openApp(rt, "POWERPNT.EXE", "PowerPoint");
            return;
        }

        JOptionPane.showMessageDialog(this, "Nothing opened");
    }

    private int askUser(String text) {
        return JOptionPane.showConfirmDialog(
                this,
                text,
                "Office Launcher",
                JOptionPane.YES_NO_OPTION
        );
    }

    private void openApp(Runtime rt, String exe, String name) {
        try {
            rt.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\" + exe);
            JOptionPane.showMessageDialog(this, name + " opened");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cannot open " + name);
        }
    }
}