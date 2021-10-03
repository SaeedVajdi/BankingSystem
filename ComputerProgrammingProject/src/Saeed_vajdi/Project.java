package Saeed_vajdi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

class Pages {
    private ArrayList<User> arrayList = new ArrayList();

    private JFrame frame = new JFrame();
    private JTextField t;
    private JPasswordField p;
    private String v1, v2;
    private int c = 0, c1 = 0;

    private void login() {
        load();
        frame.setTitle("صفحه ورود");
        frame.setBounds(470, 100, 600, 700);
        frame.setLayout(null);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Logo.png"));

        JLabel L1 = new JLabel(new ImageIcon("Logo.png"));
        L1.setBounds(45, 0, 500, 350);

        JLabel L2 = new JLabel("بانک پارسیان");
        L2.setBounds(180, 350, 300, 50);
        L2.setFont(new Font(L2.getName(), Font.BOLD, 50));

        JLabel L3 = new JLabel("کد ملی :");
        L3.setBounds(360, 420, 100, 30);
        t = new JTextField();
        t.setBounds(200, 420, 150, 28);
        t.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                v1 = t.getText();
            }
        });

        JLabel L4 = new JLabel("کلمه عبور :");
        L4.setBounds(355, 450, 100, 30);
        p = new JPasswordField();
        p.setBounds(200, 450, 150, 28);
        p.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                v2 = p.getText();
            }
        });

        JButton B1 = new JButton("ورود");
        B1.setBounds(250, 490, 100, 30);
        B1.addActionListener(e -> {
            try {
                boolean a1 = false;
                if (v1.equals("") || v2.equals("")) {
                    throw new NullPointerException();
                }
                for (User h : arrayList) {
                    if (h.nationalcode.equals(v1) && h.password.equals(v2)) {
                        a1 = true;
                        break;
                    } else {
                        a1 = false;
                    }
                }
                if (a1) {
                    for (User i : arrayList) {
                        if (i.nationalcode.equals(v1) && i.password.equals(v2)) {
                            frame.setVisible(false);
                            if (c1 == 0) {
                                home();
                            } else {
                                frame2.setVisible(true);
                            }
                            t1.setText(i.name);
                            t2.setText(i.family);
                            t3.setText(i.nationalcode);
                            t4.setText(i.creditcode);
                            t5.setText(i.password);
                            t6.setText(i.stock);
                            t.setText("");
                            p.setText("");
                            t8.setText("");
                            t9.setText("");
                            t11.setText("");
                            t12.setText("");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "کد ملی یا کلمه عبور اشتباه است!");
                }
            } catch (NullPointerException e1) {
                JOptionPane.showMessageDialog(null, "لطفا کد ملی و کلمه عبور را وارد کنید!");
            }
        });

        JLabel L5 = new JLabel("تاکنون حسابی نداشته اید ؟");
        L5.setBounds(330, 550, 200, 20);
        JButton B2 = new JButton("ثبت نام");
        B2.setBounds(190, 550, 100, 20);
        B2.addActionListener(e -> {
            frame.setVisible(false);
            if (c == 0) {
                register();
            } else {
                frame1.setVisible(true);
            }
        });

        frame.add(L1);
        frame.add(L2);
        frame.add(L3);
        frame.add(t);
        frame.add(L4);
        frame.add(p);
        frame.add(B1);
        frame.add(L5);
        frame.add(B2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private JFrame frame1 = new JFrame();
    private JTextField T1, T2, T3, T4, T5;
    private String s1, s2, s3, s4, s5;
    private int s6 = 0;

    private void register() {
        c++;
        frame1.setTitle("صفحه ثبت نام");
        frame1.setBounds(470, 100, 600, 700);
        frame1.setLayout(null);
        frame1.setIconImage(Toolkit.getDefaultToolkit().getImage("Logo.png"));

        JLabel L1 = new JLabel("نام :");
        L1.setBounds(345, 100, 150, 25);
        T1 = new JTextField();
        T1.setBounds(190, 100, 150, 25);
        T1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                s1 = T1.getText();
            }
        });

        JLabel L2 = new JLabel("نام خانوادگی :");
        L2.setBounds(348, 150, 150, 25);
        T2 = new JTextField();
        T2.setBounds(190, 150, 150, 25);
        T2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                s2 = T2.getText();
            }
        });

        JLabel L3 = new JLabel("کد ملی :");
        L3.setBounds(347, 200, 150, 25);
        T3 = new JTextField();
        T3.setBounds(190, 200, 150, 25);
        T3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                s3 = T3.getText();
            }
        });

        JLabel L4 = new JLabel("شماره حساب :");
        L4.setBounds(348, 250, 150, 25);
        T4 = new JTextField();
        T4.setBounds(190, 250, 150, 25);
        T4.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                s4 = T4.getText();
            }
        });

        JLabel L5 = new JLabel("کلمه عبور :");
        L5.setBounds(348, 300, 150, 25);
        T5 = new JTextField();
        T5.setBounds(190, 300, 150, 25);
        T5.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                s5 = T5.getText();
            }
        });

        JButton B1 = new JButton("ثبت نام");
        B1.setBounds(230, 370, 100, 30);
        B1.addActionListener(e -> {
            try {
                boolean a1 = false, b1 = false, c1 = false, d1 = false, e1 = false, f1 = false;
                for (char a : s1.toCharArray()) {
                    if (a != 'a' && a != 'b' && a != 'c' && a != 'd' && a != 'e' && a != 'f' && a != 'g' && a != 'h' &&
                            a != 'i' && a != 'j' && a != 'k' && a != 'l' && a != 'm' && a != 'n' && a != 'o' && a != 'p' &&
                            a != 'q' && a != 'r' && a != 's' && a != 't' && a != 'u' && a != 'v' && a != 'w' && a != 'x' &&
                            a != 'y' && a != 'z' && a != 'A' && a != 'B' && a != 'C' && a != 'D' && a != 'E' && a != 'F' && a != 'G' && a != 'H' &&
                            a != 'I' && a != 'J' && a != 'K' && a != 'L' && a != 'M' && a != 'N' && a != 'O' && a != 'P' &&
                            a != 'Q' && a != 'R' && a != 'S' && a != 'T' && a != 'U' && a != 'V' && a != 'W' && a != 'X' &&
                            a != 'Y' && a != 'Z' && a != ' ') {
                        a1 = true;
                        break;
                    }
                }
                for (char a : s2.toCharArray()) {
                    if (a != 'a' && a != 'b' && a != 'c' && a != 'd' && a != 'e' && a != 'f' && a != 'g' && a != 'h' &&
                            a != 'i' && a != 'j' && a != 'k' && a != 'l' && a != 'm' && a != 'n' && a != 'o' && a != 'p' &&
                            a != 'q' && a != 'r' && a != 's' && a != 't' && a != 'u' && a != 'v' && a != 'w' && a != 'x' &&
                            a != 'y' && a != 'z' && a != 'A' && a != 'B' && a != 'C' && a != 'D' && a != 'E' && a != 'F' && a != 'G' && a != 'H' &&
                            a != 'I' && a != 'J' && a != 'K' && a != 'L' && a != 'M' && a != 'N' && a != 'O' && a != 'P' &&
                            a != 'Q' && a != 'R' && a != 'S' && a != 'T' && a != 'U' && a != 'V' && a != 'W' && a != 'X' &&
                            a != 'Y' && a != 'Z' && a != ' ') {
                        b1 = true;
                        break;
                    }
                }
                for (char a : s3.toCharArray()) {
                    if (a != '0' && a != '1' && a != '2' && a != '3' && a != '4' && a != '5' && a != '6' && a != '7' && a != '8' && a != '9') {
                        c1 = true;
                        break;
                    }
                }
                for (char a : s4.toCharArray()) {
                    if (a != '0' && a != '1' && a != '2' && a != '3' && a != '4' && a != '5' && a != '6' && a != '7' && a != '8' && a != '9') {
                        d1 = true;
                        break;
                    }
                }
                for (User i : arrayList) {
                    if (i.nationalcode.equals(s3)) {
                        e1 = true;
                    }
                    if (i.creditcode.equals(s4)) {
                        f1 = true;
                    }
                }
                if (a1) {
                    JOptionPane.showMessageDialog(null, "نام را با حروف لاتین وارد کنید!");
                } else if (b1) {
                    JOptionPane.showMessageDialog(null, "نام خانوادگی را با حروف لاتین وارد کنید!");
                } else if (s3.length() != 10 || c1) {
                    JOptionPane.showMessageDialog(null, "کد ملی باید عددی 10 رقمی باشد!");
                } else if (s5.length() < 4) {
                    JOptionPane.showMessageDialog(null, "رمز عبور باید حداقل شامل 4 کاراکتر باشد!");
                } else if (s4.length() < 4 || d1) {
                    JOptionPane.showMessageDialog(null, "شماره حساب باید حداقل شامل 4 عدد باشد!");
                } else if (e1) {
                    JOptionPane.showMessageDialog(null, "این کد ملی موجود است!");
                } else if (f1) {
                    JOptionPane.showMessageDialog(null, "این شماره حساب موجود است!");
                } else {
                    frame1.setVisible(false);
                    frame.setVisible(true);
                    arrayList.add(new User(s1, s2, s3, s4, s5, String.valueOf(s6)));
                    save();
                    T1.setText("");
                    T2.setText("");
                    T3.setText("");
                    T4.setText("");
                    T5.setText("");
                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                }
            } catch (NullPointerException e1) {
                JOptionPane.showMessageDialog(null, "لطفا موارد خواسته شده را وارد کنید!");

            }
        });

        JLabel L7 = new JLabel("بانک پارسیان");
        L7.setBounds(180, 500, 300, 50);
        L7.setFont(new Font(L2.getName(), Font.BOLD, 50));

        frame1.add(L1);
        frame1.add(T1);
        frame1.add(L2);
        frame1.add(T2);
        frame1.add(L3);
        frame1.add(T3);
        frame1.add(L4);
        frame1.add(T4);
        frame1.add(L5);
        frame1.add(T5);
        frame1.add(B1);
        frame1.add(L7);


        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JFrame frame2 = new JFrame();
    private JTextField t1, t2, t3, t4, t5, t6, t8, t9, t11, t12;
    private String a1, b, k1, k2;

    private void home() {
        c1++;
        frame2.setTitle("صفحه کاربری");
        frame2.setBounds(270, 80, 1000, 700);
        frame2.setLayout(null);
        frame2.setIconImage(Toolkit.getDefaultToolkit().getImage("Logo.png"));

        JLabel L1 = new JLabel("نام :");
        L1.setBounds(845, 100, 150, 25);
        t1 = new JTextField();
        t1.setBounds(690, 100, 150, 25);
        t1.setEditable(false);

        JLabel L2 = new JLabel("نام خانوادگی :");
        L2.setBounds(848, 150, 150, 25);
        t2 = new JTextField();
        t2.setBounds(690, 150, 150, 25);
        t2.setEditable(false);

        JLabel L3 = new JLabel("کد ملی :");
        L3.setBounds(847, 200, 150, 25);
        t3 = new JTextField();
        t3.setBounds(690, 200, 150, 25);
        t3.setEditable(false);

        JLabel L4 = new JLabel("شماره حساب :");
        L4.setBounds(848, 250, 150, 25);
        t4 = new JTextField();
        t4.setBounds(690, 250, 150, 25);
        t4.setEditable(false);

        JLabel L5 = new JLabel("کلمه عبور :");
        L5.setBounds(848, 300, 150, 25);
        t5 = new JTextField();
        t5.setBounds(690, 300, 150, 25);
        t5.setEditable(false);

        JLabel L6 = new JLabel("موجودی :");
        L6.setBounds(847, 350, 150, 25);
        t6 = new JTextField();
        t6.setBounds(690, 350, 150, 25);
        t6.setEditable(false);

        JLabel L7 = new JLabel("بانک پارسیان");
        L7.setBounds(600, 430, 400, 80);
        L7.setFont(new Font(L2.getName(), Font.BOLD, 65));

        JLabel L8 = new JLabel("مبلغ :");
        L8.setBounds(255, 60, 150, 25);
        t8 = new JTextField();
        t8.setBounds(100, 50, 150, 50);
        t8.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                a1 = t8.getText();
            }
        });

        JButton B1 = new JButton("دریافت وجه");
        B1.setBounds(50, 125, 100, 30);
        B1.addActionListener(e -> {
            boolean flag = false;
            for (User i : arrayList) {
                if (i.nationalcode.equals(v1)) {
                    try {
                        if (a1.equals("")) {
                            throw new NullPointerException();
                        }
                        int z1 = Integer.parseInt(i.stock);
                        int z2 = Integer.parseInt(a1);
                        int z = z1 - z2;
                        if (z < 0) {
                            throw new ArithmeticException();
                        }
                        i.stock = String.valueOf(z);
                        t6.setText(String.valueOf(z));
                        t8.setText("");
                        flag = true;
                        save();
                    } catch (ArithmeticException e2) {
                        t8.setText("");
                        JOptionPane.showMessageDialog(null, "موجودی کافی نیست!");
                    } catch (NullPointerException e1) {
                        JOptionPane.showMessageDialog(null, "مبلغ را وارد کنید!");
                    } catch (Exception e1) {
                        t8.setText("");
                        JOptionPane.showMessageDialog(null, "مبلغ وارد شده صحیح نمی باشد!");
                    }
                }
            }
            if (flag) {
                a1 = "";
                JOptionPane.showMessageDialog(null, "دریافت وجه با موفقیت انجام شد!");
            }
        });

        JButton B2 = new JButton("پرداخت وجه");
        B2.setBounds(200, 125, 100, 30);
        B2.addActionListener(e -> {
            boolean flag = false;
            for (User i : arrayList) {
                if (i.nationalcode.equals(v1)) {
                    try {
                        if (a1.equals("")) {
                            throw new NullPointerException();
                        }
                        int z1 = Integer.parseInt(i.stock);
                        int z2 = Integer.parseInt(a1);
                        int z = z1 + z2;
                        i.stock = String.valueOf(z);
                        t6.setText(String.valueOf(z));
                        t8.setText("");
                        flag = true;
                        save();
                    } catch (NullPointerException e1) {
                        JOptionPane.showMessageDialog(null, "مبلغ را وارد کنید!");
                    } catch (Exception e1) {
                        t8.setText("");
                        JOptionPane.showMessageDialog(null, "مبلغ وارد شده صحیح نمی باشد!");
                    }
                }
            }
            if (flag) {
                a1 = "";
                JOptionPane.showMessageDialog(null, "پرداخت وجه با موفقیت انجام شد!");
            }
        });

        JLabel L9 = new JLabel("رمز عبور جدید :");
        L9.setBounds(255, 210, 150, 25);
        t9 = new JTextField();
        t9.setBounds(100, 200, 150, 50);
        t9.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                b = t9.getText();
            }
        });

        JButton B3 = new JButton("تغییر رمز");
        B3.setBounds(130, 275, 100, 30);
        B3.addActionListener(e -> {
            boolean flag = false;
            try {
                if (b.equals("")) {
                    throw new NullPointerException();
                }
                for (User i : arrayList) {
                    if (b.length() < 4) {
                        t9.setText("");
                        JOptionPane.showMessageDialog(null, "رمز عبور باید حداقل شامل 4 کاراکتر باشد!");
                    } else if (i.nationalcode.equals(v1)) {
                        i.password = b;
                        t5.setText(b);
                        t9.setText("");
                        flag = true;
                        save();
                    }
                }
            } catch (NullPointerException e1) {
                JOptionPane.showMessageDialog(null, "رمز عبور جدید را وارد کنید!");
            }
            if (flag) {
                b = "";
                JOptionPane.showMessageDialog(null, "رمز عبور با موفقیت تغییر یافت!");
            }
        });

        JLabel L10 = new JLabel(new ImageIcon("Logo.png"));
        L10.setBounds(50, 300, 500, 350);

        JButton B4 = new JButton("خروج");
        B4.setBounds(690, 550, 150, 40);
        B4.addActionListener(e -> {
            save();
            v1 = "";
            v2 = "";
            frame2.setVisible(false);
            frame.setVisible(true);
        });

        JLabel L11 = new JLabel("مبلغ :");
        L11.setBounds(535, 60, 150, 25);
        t11 = new JTextField();
        t11.setBounds(380, 50, 150, 50);
        t11.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                k1 = t11.getText();
            }
        });


        JLabel L12 = new JLabel("شماره حساب :");
        L12.setBounds(534, 135, 150, 25);
        t12 = new JTextField();
        t12.setBounds(380, 125, 150, 50);
        t12.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                k2 = t12.getText();
            }
        });

        JButton B5 = new JButton("انتقال وجه");
        B5.setBounds(410, 200, 100, 30);
        B5.addActionListener(e -> {
            boolean a0 = false, a1 = false, flag = false;
            int z, z1, z2, z3;
            for (User i : arrayList) {
                try {
                    if (k1.equals("") || k2.equals("")) {
                        throw new NullPointerException();
                    }
                    if (i.nationalcode.equals(v1)) {
                        for (char a : k1.toCharArray()) {
                            if (a != '0' && a != '1' && a != '2' && a != '3' && a != '4' && a != '5' && a != '6' && a != '7' && a != '8' && a != '9') {
                                a0 = true;
                                break;
                            }
                        }
                        for (char a : k2.toCharArray()) {
                            if (a != '0' && a != '1' && a != '2' && a != '3' && a != '4' && a != '5' && a != '6' && a != '7' && a != '8' && a != '9') {
                                a1 = true;
                                break;
                            }
                        }
                        for (User h : arrayList) {
                            if (h.creditcode.equals(k2)) {
                                a1 = false;
                                break;
                            } else {
                                a1 = true;
                            }
                        }

                        if (a0) {
                            JOptionPane.showMessageDialog(null, "مبلغ وارد شده صحیح نمی باشد!");
                        } else if (a1) {
                            JOptionPane.showMessageDialog(null, "شماره حساب وارد شده صحیح نمی باشد!");
                        } else if (k2.length() < 4) {
                            JOptionPane.showMessageDialog(null, "شماره حساب باید حداقل شامل 4 عدد باشد!");
                        } else if (Integer.parseInt(k1) > Integer.parseInt(i.stock)) {
                            JOptionPane.showMessageDialog(null, "موجودی  کافی نیست!");
                        } else {
                            z1 = Integer.parseInt(i.stock);
                            z2 = Integer.parseInt(k1);
                            z = z1 - z2;
                            i.stock = String.valueOf(z);
                            for (User h : arrayList) {
                                if (h.creditcode.equals(k2)) {
                                    z3 = Integer.parseInt(h.stock) + z2;
                                    h.stock = String.valueOf(z3);
                                }
                            }
                            t6.setText(i.stock);
                            t11.setText("");
                            t12.setText("");
                            save();
                            flag = true;
                        }
                    }

                } catch (NullPointerException e1) {
                    JOptionPane.showMessageDialog(null, "لطفا مبلغ و شماره حساب را وارد کنید!");
                }
            }
            if (flag) {
                k1 = "";
                k2 = "";
                JOptionPane.showMessageDialog(null, "انتقال با موفقیت انجام شد!");
            }
        });
        frame2.add(L1);
        frame2.add(t1);
        frame2.add(L2);
        frame2.add(t2);
        frame2.add(L3);
        frame2.add(t3);
        frame2.add(L4);
        frame2.add(t4);
        frame2.add(L5);
        frame2.add(t5);
        frame2.add(L6);
        frame2.add(t6);
        frame2.add(L7);
        frame2.add(L8);
        frame2.add(t8);
        frame2.add(B1);
        frame2.add(B2);
        frame2.add(L9);
        frame2.add(t9);
        frame2.add(B3);
        frame2.add(L10);
        frame2.add(B4);
        frame2.add(L11);
        frame2.add(t11);
        frame2.add(L12);
        frame2.add(t12);
        frame2.add(B5);

        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void save() {
        try {
            FileWriter fw = new FileWriter("UserSaver.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(arrayList));
            bw.close();
        } catch (IOException ignored) {

        }
    }

    private void load() {
        try {
            int temp = 0;
            FileReader fr = new FileReader("UserSaver.txt");
            BufferedReader br = new BufferedReader(fr);
            String input = "";
            do {
                input += br.readLine();
            } while (br.ready());
            for (int i = 0; i < input.length(); ++i) {
                if (input.charAt(i) == '(') {
                    temp = i;
                    while (input.charAt(i) != ')' && i < input.length() - 1) {
                        i++;
                    }
                    String tempString = input.substring(temp + 1, i);
                    String[] studentDatas = tempString.split(",");
                    arrayList.add(new User(studentDatas[0], studentDatas[1], studentDatas[2], studentDatas[3], studentDatas[4], studentDatas[5]));
                }
            }
            br.close();
        } catch (IOException ignored) {
        }
    }

    public static void main(String[] args) {
        Pages pages = new Pages();
        pages.login();
    }
}

class User {
    String name;
    String family;
    String nationalcode;
    String creditcode;
    String password;
    String stock;

    User(String name, String family, String nationalcode, String creditcode, String password, String stock) {
        this.name = name;
        this.family = family;
        this.nationalcode = nationalcode;
        this.creditcode = creditcode;
        this.password = password;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "(" + this.name + "," + this.family + "," + this.nationalcode + "," + this.creditcode + "," + this.password + "," + this.stock + ")";
    }
}