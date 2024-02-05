/*
package Editor;


import de.umjammer.jmp3.MP3Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicPlayer extends JFrame {

    private MP3Player mp3Player;
    private String currentSong = "path/to/your/default/song.mp3";  // 默认歌曲路径

    public MusicPlayer() {
        initUI();
    }

    private void initUI() {
        setTitle("Music Player");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 创建主面板
        JPanel mainPanel = new JPanel(new BorderLayout());

        // 创建音乐播放器控件
        JLabel nowPlayingLabel = new JLabel("Now Playing: ");
        JButton playButton = new JButton("Play");
        JButton stopButton = new JButton("Stop");
        JButton nextButton = new JButton("Next");

        // 添加音乐播放器控件到主面板
        JPanel playerPanel = new JPanel(new FlowLayout());
        playerPanel.add(nowPlayingLabel);
        playerPanel.add(playButton);
        playerPanel.add(stopButton);
        playerPanel.add(nextButton);

        mainPanel.add(playerPanel, BorderLayout.NORTH);

        // ... (略去其他部分)

        // 设置按钮动作
        playButton.addActionListener(e -> playMusic());
        stopButton.addActionListener(e -> stopMusic());
        nextButton.addActionListener(e -> playNextSong());

        // ... (略去其他部分)

        // 添加主面板到窗口
        add(mainPanel);

        setVisible(true);
    }

    private void playMusic() {
        if (mp3Player == null || !mp3Player.isPlaying()) {
            playSong(currentSong);
        } else {
            mp3Player.close();
        }
    }

    private void stopMusic() {
        if (mp3Player != null) {
            mp3Player.close();
        }
    }

    private void playNextSong() {
        // TODO: 实现播放下一首歌曲的逻辑
    }

    private void playSong(String filePath) {
        mp3Player = new MP3Player(getClass().getClassLoader().getResource(filePath));
        mp3Player.play();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MusicPlayer());
    }
}
*/
