package com.Gaoju.Photo;

import com.Gaoju.Dao.StudentDaoImpl;
import com.Gaoju.School.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.List;

/**
 * @ClassName: HomeworkPhone
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/26 16:47
 * @URL：https://github.com/GaoHaiNB
 */
public class HomeworkPhone {
    public static void main(String[] args) {
        JFrame frame = new JFrame("学生信息录入");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        //姓名
        JLabel nameLabel = new JLabel("姓 名");
        nameLabel.setBounds(20, 20, 60, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(80, 20, 100, 25);
        panel.add(nameText);
        //地址
        JLabel addressLabel = new JLabel("地 址");
        addressLabel.setBounds(300, 20, 60, 25);
        panel.add(addressLabel);

        JTextField addressText = new JTextField(20);
        addressText.setBounds(360, 20, 100, 25);
        panel.add(addressText);

        //班级
        JLabel classLabel = new JLabel("班 级");
        classLabel.setBounds(20, 50, 60, 25);
        panel.add(classLabel);

        JTextField classText = new JTextField(20);
        classText.setBounds(80, 50, 100, 25);
        panel.add(classText);

        //学号
        JLabel idLabel = new JLabel("学 号");
        idLabel.setBounds(300, 50, 60, 25);
        panel.add(idLabel);

        JTextField idText = new JTextField(20);
        idText.setBounds(360, 50, 100, 25);
        panel.add(idText);
        //分数
        JLabel scoreLabel = new JLabel("分 数");
        scoreLabel.setBounds(20, 80, 60, 25);
        panel.add(scoreLabel);

        JTextField scoreText = new JTextField(20);
        scoreText.setBounds(80, 80, 100, 25);
        panel.add(scoreText);
        //提交
        JButton submitButton = new JButton("提交");
        submitButton.setBounds(40, 110, 150, 25);
        panel.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String address = addressText.getText();
                String classes = classText.getText();
                String id = idText.getText();
                int score = Integer.parseInt(scoreText.getText());
                Student student = new Student(name, address, classes, id, score);
                StudentDaoImpl studentDao = new StudentDaoImpl();
                try {
                    studentDao.submitStudent(student);
                } catch (Exception exception) {
                    System.out.println("提交失败");
                }

            }
        });
        //按学号修改
        JButton updateButton = new JButton("按学号修改");
        updateButton.setBounds(220, 110, 150, 25);
        panel.add(updateButton);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String address = addressText.getText();
                String classes = classText.getText();
                String id = idText.getText();
                int score = Integer.parseInt(scoreText.getText());
                Student student = new Student(name, address, classes, id, score);
                StudentDaoImpl studentDao = new StudentDaoImpl();
                try {
                    studentDao.updateStudent(student);
                } catch (Exception exception) {
                    System.out.println("修改失败");
                }
            }
        });
        //按学号查询
        JButton selectButton = new JButton("按学号查询");
        selectButton.setBounds(400, 110, 150, 25);
        panel.add(selectButton);

        //查询结果
        JLabel resultLabel = new JLabel("查询结果");
        resultLabel.setBounds(20, 160, 400, 25);
        panel.add(resultLabel);

        JTextField resultText = new JTextField(20);
        resultText.setBounds(80, 160, 400, 25);
        panel.add(resultText);
        //点击查询，将查询放到查询结果中
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentDaoImpl studentDao = new StudentDaoImpl();
                String sid = idText.getText();
                try {
                    ResultSet rs = studentDao.selectStudent(sid);
                    while (rs.next()){
                        String name=rs.getString("name");
                        String address = rs.getString("address");
                        String classes = rs.getString("classes");
                        String id = rs.getString("id");
                        int score = rs.getInt("score");
                        resultText.setText(name+" "+address+" "+classes+" "+id+" "+score);
                    }
                } catch (Exception exception) {
                    System.out.println("查询失败");
                }
            }
        });
    }
}
