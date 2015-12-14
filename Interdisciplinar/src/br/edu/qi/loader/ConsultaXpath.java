package br.edu.qi.loader;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.dto.RetornoDto;

public class ConsultaXpath extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea textArea;

	private JTextField campoBusca;

	public ConsultaXpath() {
		super("Consulta por XPath");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		GridLayout grid = new GridLayout(5, 3, 10, 10);

		setLayout(grid);

		campoBusca = new JTextField();

		this.add(campoBusca);

		textArea = new JTextArea();
		JButton btn = new JButton("buscar animal por nome");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (campoBusca.getText().isEmpty())
					return;
				filtrar("/retornoDto/animais/animal[nomeAdotivo='"
						+ campoBusca.getText() + "']");
			}
		});
		add(btn);

		btn = new JButton("buscar animal por tipo");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (campoBusca.getText().isEmpty())
					return;
				filtrar("/retornoDto/animais/animal[tipo = '" + campoBusca.getText()
						+ "']");
			}
		});
		add(btn);

		btn = new JButton("buscar animal por raça");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (campoBusca.getText().isEmpty())
					return;
				filtrar("/retornoDto/animais/animal[raca = '" + campoBusca.getText()
						+ "']");
			}
		});
		add(btn);

		btn = new JButton("cadastrar xml no banco");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cadastrarXml();
			}
		});
		add(btn);

		textArea.setText("Result");
		textArea.setEditable(false);
		add(textArea);

		setVisible(true);
	}

	void filtrar(String expression) {
		try {
			DocumentBuilderFactory domBuilder = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = domBuilder.newDocumentBuilder();
			
			String path = new java.io.File("").getAbsolutePath() + "\\src\\loadtest01.xml";
			Document doc = builder.parse(path);
			XPath xpath = XPathFactory.newInstance().newXPath();
			javax.xml.xpath.XPathExpression expr = xpath.compile(expression);
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			NodeList nodes = (NodeList) result;
			String textResult = "";
			for (int i = 0; i < nodes.getLength(); i++) {
				textResult += nodes.item(i).getTextContent() + "\n";
			}
			textArea.setText(textResult);
		} catch (Exception e) {
			e.printStackTrace();
			textArea.setText("Ocorreu um erro ao filtrar por tipo");
		}
	}

	void cadastrarXml() {
		try {
			Dao dao = new Dao();

			Loader loader = new Loader();

			for (int i = 1; i <= 3; i++) {
				String path = new java.io.File("").getAbsolutePath();
				RetornoDto modelDto = loader.Load(path + "\\src\\loadtest0" + i + ".xml");

				dao.beginTransaction();

				Parser parser = new Parser(dao);
				parser.parse(modelDto);

				dao.commit();
			}
			textArea.setText("cadastrado com sucesso");

		} catch (Exception ex) {
			textArea.setText("deu erro");
		}
	}
}
