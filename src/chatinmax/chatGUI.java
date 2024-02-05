package chatinmax;

import javax.swing.*;
import java.awt.*;

public class chatGUI {
    private JFrame frame;
    private JTextArea messageArea;
    private JTextField inputField;
    private JButton sendButton;

    public chatGUI() {
        // 初始化窗口
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Chat Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建面板和组件
        JPanel panel = new JPanel();
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageArea);

        inputField = new JTextField();
        sendButton = new JButton("Send");

        // 添加组件到面板
        panel.add(scrollPane);
        panel.add(inputField);
        panel.add(sendButton);

        // 设置布局并添加面板到窗口
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);

        // 添加按钮事件监听器（这里仅做演示，未实现具体发送消息逻辑）
        sendButton.addActionListener(e -> {
            String message = inputField.getText();
            if (!message.isEmpty()) {
                messageArea.append("You: " + message + "\n");
                inputField.setText("");
            }
        });

        // 显示窗口
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(chatGUI::new);
    }
}
