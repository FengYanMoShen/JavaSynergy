package musicplayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author FengYanMoShen
 */
public class FileEncryptor extends JFrame {
    private JFileChooser fileChooser;
    private File[] selectedFiles;
    private File selectedDirectory;

    public FileEncryptor() {
        super("文件解密器");

        // 设置文件选择器允许选择多个文件
        fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);

        // 创建打开和保存按钮
        JButton openButton = new JButton("选择文件");
        JButton saveButton = new JButton("选择输出目录并解密");

        // 添加打开按钮的事件监听
        openButton.addActionListener(e -> {
            int returnVal = fileChooser.showOpenDialog(FileEncryptor.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                selectedFiles = fileChooser.getSelectedFiles();
                JOptionPane.showMessageDialog(FileEncryptor.this, "文件已选择。");
            }
        });

        // 添加保存按钮的事件监听
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnVal = fileChooser.showSaveDialog(FileEncryptor.this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    selectedDirectory = fileChooser.getSelectedFile();
                    for (File file : selectedFiles) {
                        decryptFile(file, selectedDirectory);
                    }
                    JOptionPane.showMessageDialog(FileEncryptor.this, "文件解密完成。");
                }
            }
        });

        // 将组件添加到窗口
        getContentPane().add(openButton, BorderLayout.NORTH);
        getContentPane().add(saveButton, BorderLayout.SOUTH);

        // 设置窗口属性
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void decryptFile(File file, File directory) {
        try {
            // 读取文件数据
            byte[] fileContent = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
            // 对文件数据进行XOR操作以解密
            for (int i = 0; i < fileContent.length; i++) {
                fileContent[i] ^= 163; // XOR操作，与加密使用同样的数值
            }
            // 将解密后的文件保存到指定目录
            File outputFile = new File(directory, file.getName().replaceAll(".mp3$", ""));
            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                fos.write(fileContent);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 使用SwingUtilities.invokeLater来确保GUI更新在事件调度线程中执行
        SwingUtilities.invokeLater(() -> new FileEncryptor());
    }
}
