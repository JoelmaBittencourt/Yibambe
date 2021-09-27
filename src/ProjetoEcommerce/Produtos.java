package ProjetoEcommerce;

public class Produtos {
//atributos
	private String nome;
	private String descricao;
	private double preco;
	private int estoque;
	private int codigo;

	// constructor,nao da pra tirar valores indicados no contructor
	public Produtos(int codigo, String nome, String descricao, double preco, int estoque) {

		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
		this.codigo = codigo;
	}

//getter e setter 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Produtos() {
		super();
	}

	// criar constructor vazio
	public void DiminuirEstoque(int venda) {
		this.estoque = this.estoque - venda;
	}

}
