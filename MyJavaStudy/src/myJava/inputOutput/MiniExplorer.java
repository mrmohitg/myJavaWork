package myJava.inputOutput;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;

class MiniExplorer extends JFrame implements ActionListener {
	public static void main(String s[]) {
		new MiniExplorer();
	}

	JLabel l1;
	JTextField t;
	JButton b;
	JPanel p1, p2;
	JTree jt;
	JScrollPane jp, jp1;
	DefaultMutableTreeNode root;
	JTable jtable;
	String[] headings = { "Name", "Size", "Readable", "Writeable", "Headden" };
	String[][] items = {};
	File f;

	MiniExplorer() {
		super("MiniExplorer");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(null);

		l1 = new JLabel("ENTER THE DRIVE/DIRECTORY PATH");
		l1.setBounds(80, 20, 240, 30);
		t = new JTextField();
		t.setBounds(310, 20, 300, 30);
		b = new JButton("OK");
		b.setBounds(620, 18, 60, 35);
		b.addActionListener(this);
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setBounds(5, 70, 200, 480);
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setBounds(250, 70, 500, 480);

		jtable = new JTable(items, headings);
		jp1 = new JScrollPane(jtable);
		jp1.setBounds(5, 5, 490, 470);
		p2.add(jp1);

		jt = new JTree(root);
		jp = new JScrollPane(jt);
		jp.setBounds(5, 5, 190, 470);
		p1.add(jp);
		add(l1);
		add(t);
		add(b);
		add(p1);
		add(p2);
		this.setBounds(200, 50, 800, 600);
		this.setVisible(true);
		// makeTree(new File("D:\\SOFTWARE\\COMPAC CQ50-A106AU DRIVERS"));
	}

	public void addChildNode(File f, DefaultMutableTreeNode d) {
		String list[] = f.list();
		File fileList[] = new File[list.length];
		DefaultMutableTreeNode dm[] = new DefaultMutableTreeNode[list.length];
		for (int i = 0; i < list.length; i++) {
			fileList[i] = new File(f.getAbsolutePath() + "/" + list[i]);
			dm[i] = new DefaultMutableTreeNode(fileList[i].getName());
			// System.out.println(dm[i].getDepth());
			d.add(dm[i]);
			if (fileList[i].list() != null)
				addChildNode(fileList[i], dm[i]);
		}
	}

	public void makeTable(String[][] items) {
		p2.remove(jp1);
		jtable = new JTable(items, headings);
		jtable.setEnabled(false);
		jp1 = new JScrollPane(jtable);
		jp1.setBounds(5, 5, 490, 470);
		p2.add(jp1);
		this.setVisible(true);
	}

	public void makeTree(File f) {
		if (f.exists()) {
			p1.remove(jp);
			root = new DefaultMutableTreeNode(f.getName());
			if (f.list() != null)
				this.addChildNode(f, root);

			jt = new JTree(root);
			jt.addMouseListener(new MyMouseAdapter(this));
			jp = new JScrollPane(jt);
			jp.setBounds(5, 5, 190, 470);
			p1.add(jp);
			this.setVisible(true);
		} else {
			System.out.println("FILE OR FOLDER DOES NOT EXIST.");
		}
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("OK")) {
			f = new File(t.getText());
			System.out.println(f.getAbsolutePath());
			makeTree(f);
			p2.remove(jp1);
			jtable = new JTable(items, headings);
			jp1 = new JScrollPane(jtable);
			jp1.setBounds(5, 5, 490, 470);
			p2.add(jp1);
		}
	}
}

class MyMouseAdapter extends MouseAdapter {
	MiniExplorer me;

	MyMouseAdapter(MiniExplorer me) {
		this.me = me;
	}

	String Path;

	public void mouseClicked(MouseEvent event) {
		if (event != null) {
			Point p = event.getPoint();
			int selRow = me.jt.getRowForLocation(p.x, p.y);
			TreeCellRenderer r = me.jt.getCellRenderer();
			if (selRow != -1 && r != null) {
				TreePath path = me.jt.getPathForRow(selRow);
				Object lastPath = path.getLastPathComponent();

				getsNode(me.f, lastPath.toString());

				File ff = new File(Path);
				if (ff.isDirectory()) {
					String ch[] = ff.list();
					String itmes[][] = new String[ch.length][5];
					if (ch != null) {
						for (int i = 0; i < itmes.length; i++) {
							for (int j = 0; j < 5; j++) {
								File fc = new File(ff.getAbsolutePath() + "/" + ch[i]);
								itmes[i][0] = fc.getName();
								itmes[i][1] = fc.length() + "";
								itmes[i][2] = fc.canRead() + "";
								itmes[i][3] = fc.canWrite() + "";
								itmes[i][4] = fc.isHidden() + "";
							}
						}
					}
					me.makeTable(itmes);
				}

				else if (ff.isFile()) {
					String itmes[][] = new String[1][5];
					File fc = new File(ff.getAbsolutePath());
					itmes[0][0] = fc.getName();
					itmes[0][1] = fc.length() + "";
					itmes[0][2] = fc.canRead() + "";
					itmes[0][3] = fc.canWrite() + "";
					itmes[0][4] = fc.isHidden() + "";
					me.makeTable(itmes);
				}
				System.out.println(lastPath);
			}
		}
	}

	public void getsNode(File f, String s) {
		String[] list = f.list();
		Path = f.getAbsolutePath();
		if (f.list() != null) {
			for (int i = 0; i < list.length; i++) {
				if (list[i].equals(s)) {
					Path += "/" + list[i];
					break;
				} else {
					for (int j = 0; j < list.length; j++) {
						// File ff=new File(Path+"/"+list[i]);
						// getsNode(ff,s);
					}
				}
			}
		}
	}
}