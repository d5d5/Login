package chapter.seven;

        import java.awt.LayoutManager;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JPanel;
        import javax.swing.JPasswordField;
        import javax.swing.JTextField;


    public class Login {
        public Login() {
        }
        public static void main(String[] args) {
            JFrame frame = new JFrame("登录界面");
            frame.setSize(350, 200);
            frame.setDefaultCloseOperation(3);
            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel);
            frame.setVisible(true);
        }
        private static void placeComponents(JPanel panel) {
            panel.setLayout((LayoutManager)null);
            JLabel userLabel = new JLabel("用户名:");
            userLabel.setBounds(10, 20, 80, 25);
            panel.add(userLabel);
            JTextField userText = new JTextField(20);
            userText.setBounds(100, 20, 165, 25);
            panel.add(userText);
            JLabel userMail = new JLabel("用户邮箱:");
            userMail.setBounds(10, 50, 80, 25);
            panel.add(userMail);
            JTextField userBig = new JTextField(20);
            userBig.setBounds(100, 50, 165, 25);
            panel.add(userBig);
            JLabel passwordLabel = new JLabel("用户密码:");
            passwordLabel.setBounds(10, 80, 80, 25);
            panel.add(passwordLabel);
            JPasswordField passwordText = new JPasswordField(20);
            passwordText.setBounds(100, 80, 165, 25);
            panel.add(passwordText);
            JButton loginButton = new JButton("登录");
            loginButton.setBounds(10, 120, 80, 25);
            panel.add(loginButton);
        }
    }

