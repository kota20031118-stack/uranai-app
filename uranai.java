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
		lbl.setFont(new Font("MS�S�V�b�N", Font.BOLD | Font.ITALIC, 40));
		lbl.setText("���肢��");
	     bg.add(lbl); 
	     
	    var tk = new JComboBox();
		tk.addItem("1��");
		tk.addItem("2��");
		tk.addItem("3��");
		tk.addItem("4��");
		tk.addItem("5��");
		tk.addItem("6��");
		tk.addItem("7��");
		tk.addItem("8��");
		tk.addItem("9��");
		tk.addItem("10��");
		tk.addItem("11��");
		tk.addItem("12��");
		tk.setBounds(500, 150, 50, 40);
		bg.add(tk); 
		
		var se = new JComboBox();
		se.addItem("�j��");
		se.addItem("����");
		se.addItem("����");
		se.setBounds(600, 150, 50, 40);
		bg.add(se);
		
		 var ir = new JComboBox();
		ir.addItem("��");
		ir.addItem("��");
		ir.addItem("��");
		ir.addItem("��");
		ir.addItem("��");
		ir.addItem("��");
		ir.addItem("��");
		ir.addItem("�s���N");
		ir.addItem("�I�����W");
		ir.addItem("���F");
		ir.setBounds(700, 150, 70, 40);
		bg.add(ir); 
		
		var txt = new JTextField();
		txt.setBounds(500, 500, 600, 30);
		txt.setForeground(Color.YELLOW);
		txt.setBackground(new Color(138, 43, 226));
		txt.setFont(new Font("MS����", Font.BOLD | Font.ITALIC, 15));
		txt.setBorder(null);
		bg.add(txt);
		
		var txt2 = new JTextField();
		txt2.setBounds(500, 525, 600, 30);
		txt2.setForeground(Color.YELLOW);
		txt2.setBackground(new Color(138, 43, 226));
		txt2.setFont(new Font("MS����", Font.BOLD | Font.ITALIC, 15));
		txt2.setBorder(null);
		bg.add(txt2);
		
		var txt3 = new JTextField();
		txt3.setBounds(500, 550, 600, 30);
		txt3.setForeground(Color.YELLOW);
		txt3.setBackground(new Color(138, 43, 226));
		txt3.setFont(new Font("MS����", Font.BOLD | Font.ITALIC, 15));
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
		
		var btn =new JButton("�肤");
		btn.setBounds(500, 350, 250, 50);
		btn.setFont(new Font("MS�S�V�b�N" ,Font.BOLD | Font.ITALIC, 20));
				btn.addActionListener(ae -> {
					switch((String)tk.getSelectedItem()) {
					case "1��":
						txt.setText("���Ȃ��͐ӔC���������A�܂��߂ɕ����Ɏ��g�ރ^�C�v�ł��B");
						break;
					case "2��":
						txt.setText("���Ȃ��͎��R�Ȕ��z�������A�Ǝ��̍l�����؂ɂ���^�C�v�ł��B");
						break;
					case "3��":
						txt.setText("���Ȃ��͗D�����A���͂Ƃ̒��a���؂ɂ���^�C�v�ł��B");
						break;
					case "4��":
						txt.setText("���Ȃ��͍s���͂�����A�V�������Ƃɒ��킷��^�C�v�ł��B");
						break;
					case "5��":
						txt.setText("���Ȃ��͔S�苭���A�Ō�܂ł�蔲���͂������Ă��܂��B");
						break;
					case "6��":
						txt.setText("���Ȃ��͋C�z����ŁA�l���x����̂����ӂȃ^�C�v�ł��B");
						break;
					case "7��":
						txt.setText("���Ȃ��͏�Ɍ����A���Ԏv���ȃ^�C�v�ł��B");
						break;
					case "8��":
						txt.setText("���Ȃ��͎��M������A���͂���������͂������Ă��܂��B");
						break;
					case "9��":
						txt.setText("���Ȃ��͗�ÂŁA�������q�ϓI�Ɍ�����^�C�v�ł��B");
						break;
					case "10��":
						txt.setText("���Ȃ��̓o�����X���o������A���a���؂ɂ��܂��B");
						break;
					case "11��":
						txt.setText("���Ȃ��͒T���S�������A������[���l����^�C�v�ł��B");
						break;
					case "12��":
						txt.setText("���Ȃ��͖��邭�A���͂��y��������^�C�v�ł��B");
						break;
					}
				
					switch((String)se.getSelectedItem()) {
					case "�j��":
						txt2.setText("��������s�����邱�ƂŁA�ǂ���������߂�ł��傤�B");
						break;
					case "����":
						txt2.setText("�����̋C�������؂ɂ���ƁA�ǂ����ʂɂȂ��肻���ł��B");
						break;
					case """
                                 ����""":
						txt2.setText("�����������A�����炵�����؂ɂ���Ɨǂ��ł��傤�B");
						break;
					}
					
					switch((String)ir.getSelectedItem()) {
					case "��":
						txt3.setText("�Ԃ��ӎ�����ƁA�s���͂����܂肻���ł��B");
						break;
					case "��":
						txt3.setText("���ӎ�����ƁA���������Ĕ��f�ł������ł��B");
						break;
					case "��":
						txt3.setText("���F���ӎ�����ƁA���^��y�������A�b�v�������ł��B");
						break;
					case "��":
						txt3.setText("�΂��ӎ�����ƁA���S���ĉ߂��������ł��B");
						break;
					case "��":
						txt3.setText("�����ӎ�����ƁA�������Ⴆ�����ł��B");
						break;
					case "��":
						txt3.setText("�����ӎ�����ƁA�W���͂����܂肻���ł��B");
						break;
					case "��":
						txt3.setText("�����ӎ�����ƁA�C������؂�ւ���ꂻ���ł��B");
						break;
					case "�s���N":
						txt3.setText("�s���N���ӎ�����ƁA�l�Ԋ֌W���ǂ��Ȃ肻���ł��B");
						break;
					case "�I�����W":
						txt3.setText("�I�����W���ӎ�����ƁA���C���o�����ł��B");
						break;
					case "���F":
						txt3.setText("���F���ӎ�����ƁA��b�����܂��i�݂����ł��B");
						break;
					}
					
				
				});
				
			bg.add(btn);
		
			JButton clearBtn = new JButton("���Z�b�g");
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
		