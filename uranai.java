import javax.swing.*;
import java.awt.*;
public class uranai {
	public static void main(String[] args) {
	JFrame fr = new JFrame();
	
	 BackgroundPanel bg = new BackgroundPanel("haikei.png");
     bg.setLayout(null);
     fr.setContentPane(bg);	
		
	
	fr.setSize(500, 500);
	fr.setLocationRelativeTo(null);
	fr.setVisible(true);
    fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
		
		var lbl = new JLabel();
		lbl.setBounds(530, 50, 300, 60);
		lbl.setForeground(Color.YELLOW);
		lbl.setOpaque(false);
		lbl.setBackground(Color.YELLOW);
		lbl.setFont(new Font("MSゴシック", Font.BOLD | Font.ITALIC, 40));
		lbl.setText("★占い★");
	     bg.add(lbl); 
	     
	    var tk = new JComboBox();
		tk.addItem("1月");
		tk.addItem("2月");
		tk.addItem("3月");
		tk.addItem("4月");
		tk.addItem("5月");
		tk.addItem("6月");
		tk.addItem("7月");
		tk.addItem("8月");
		tk.addItem("9月");
		tk.addItem("10月");
		tk.addItem("11月");
		tk.addItem("12月");
		tk.setBounds(500, 150, 50, 40);
		bg.add(tk); 
		
		var se = new JComboBox();
		se.addItem("男性");
		se.addItem("女性");
		se.addItem("中性");
		se.setBounds(600, 150, 50, 40);
		bg.add(se);
		
		 var ir = new JComboBox();
		ir.addItem("赤");
		ir.addItem("青");
		ir.addItem("黄");
		ir.addItem("緑");
		ir.addItem("紫");
		ir.addItem("黒");
		ir.addItem("白");
		ir.addItem("ピンク");
		ir.addItem("オレンジ");
		ir.addItem("水色");
		ir.setBounds(700, 150, 70, 40);
		bg.add(ir); 
		
		var txt = new JTextField();
		txt.setBounds(500, 500, 600, 30);
		txt.setForeground(Color.YELLOW);
		txt.setBackground(new Color(138, 43, 226));
		txt.setFont(new Font("MS明朝", Font.BOLD | Font.ITALIC, 15));
		txt.setBorder(null);
		bg.add(txt);
		
		var txt2 = new JTextField();
		txt2.setBounds(500, 525, 600, 30);
		txt2.setForeground(Color.YELLOW);
		txt2.setBackground(new Color(138, 43, 226));
		txt2.setFont(new Font("MS明朝", Font.BOLD | Font.ITALIC, 15));
		txt2.setBorder(null);
		bg.add(txt2);
		
		var txt3 = new JTextField();
		txt3.setBounds(500, 550, 600, 30);
		txt3.setForeground(Color.YELLOW);
		txt3.setBackground(new Color(138, 43, 226));
		txt3.setFont(new Font("MS明朝", Font.BOLD | Font.ITALIC, 15));
		txt3.setBorder(null);
		bg.add(txt3);
		
		txt.setEditable(false);
		txt2.setEditable(false);
		txt3.setEditable(false);
		
		txt.setOpaque(false);
		txt2.setOpaque(false);
		txt3.setOpaque(false);
		
		
		
		Container cPane = fr.getContentPane();
		cPane.setBackground(new Color(138, 43, 226));
		
		var btn =new JButton("占う");
		btn.setBounds(500, 350, 250, 50);
		btn.setFont(new Font("MSゴシック" ,Font.BOLD | Font.ITALIC, 20));
				btn.addActionListener(ae -> {
					switch((String)tk.getSelectedItem()) {
					case "1月":
						txt.setText("あなたは責任感が強く、まじめに物事に取り組むタイプです。");
						break;
					case "2月":
						txt.setText("あなたは自由な発想を持ち、独自の考えを大切にするタイプです。");
						break;
					case "3月":
						txt.setText("あなたは優しく、周囲との調和を大切にするタイプです。");
						break;
					case "4月":
						txt.setText("あなたは行動力があり、新しいことに挑戦するタイプです。");
						break;
					case "5月":
						txt.setText("あなたは粘り強く、最後までやり抜く力を持っています。");
						break;
					case "6月":
						txt.setText("あなたは気配り上手で、人を支えるのが得意なタイプです。");
						break;
					case "7月":
						txt.setText("あなたは情に厚く、仲間思いなタイプです。");
						break;
					case "8月":
						txt.setText("あなたは自信があり、周囲を引っ張る力を持っています。");
						break;
					case "9月":
						txt.setText("あなたは冷静で、物事を客観的に見られるタイプです。");
						break;
					case "10月":
						txt.setText("あなたはバランス感覚があり、調和を大切にします。");
						break;
					case "11月":
						txt.setText("あなたは探究心が強く、物事を深く考えるタイプです。");
						break;
					case "12月":
						txt.setText("あなたは明るく、周囲を楽しくするタイプです。");
						break;
					}
				
					switch((String)se.getSelectedItem()) {
					case "男性":
						txt2.setText("自分から行動することで、良い流れをつかめるでしょう。");
						break;
					case "女性":
						txt2.setText("自分の気持ちを大切にすると、良い結果につながりそうです。");
						break;
					case "中性":
						txt2.setText("無理をせず、自分らしさを大切にすると良いでしょう。");
						break;
					}
					
					switch((String)ir.getSelectedItem()) {
					case "赤":
						txt3.setText("赤を意識すると、行動力が高まりそうです。");
						break;
					case "青":
						txt3.setText("青を意識すると、落ち着いて判断できそうです。");
						break;
					case "黄":
						txt3.setText("黄色を意識すると、金運や楽しさがアップしそうです。");
						break;
					case "緑":
						txt3.setText("緑を意識すると、安心して過ごせそうです。");
						break;
					case "紫":
						txt3.setText("紫を意識すると、直感が冴えそうです。");
						break;
					case "黒":
						txt3.setText("黒を意識すると、集中力が高まりそうです。");
						break;
					case "白":
						txt3.setText("白を意識すると、気持ちを切り替えられそうです。");
						break;
					case "ピンク":
						txt3.setText("ピンクを意識すると、人間関係が良くなりそうです。");
						break;
					case "オレンジ":
						txt3.setText("オレンジを意識すると、元気が出そうです。");
						break;
					case "水色":
						txt3.setText("水色を意識すると、会話がうまく進みそうです。");
						break;
					}
					
				
				});
				
			bg.add(btn);
		
			JButton clearBtn = new JButton("リセット");
			clearBtn.setBounds(780, 350, 150, 50);

			clearBtn.addActionListener(ae -> {
    		txt.setText("");
   			 txt2.setText("");
   			 txt3.setText("");
			});

			bg.add(clearBtn);
	}
}
		
			class BackgroundPanel extends JPanel {
    private Image image;

    public BackgroundPanel(String path) {
        image = new ImageIcon(path).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}
		