import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    private Button btnExit = new Button("Exit");
    private Button btnAdd = new Button("Add");
    public MainFrame() {
        initComp();
    }
    private void initComp(){
        this.setBounds(100,120,400,300);
        this.setLayout(null);
        btnExit.setBounds(80,80,80,80);
        btnAdd.setBounds(80,160,80,80);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }});
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }});
        this.add(btnExit);
        this.add(btnAdd);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}