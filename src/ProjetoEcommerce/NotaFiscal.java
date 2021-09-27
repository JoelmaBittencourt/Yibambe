package ProjetoEcommerce;

//atributos
public class NotaFiscal extends Produtos {// subclasse de produtos
	private String cpf;
	public double valorTotal;
	private String dataDaCompra;
	public int cnpj;
	private int imposto;
	public String nomeCliente;

	// constructor
	public NotaFiscal(int codigo, String nome, String descricao, double preco, int estoque, String cpf, int valorTotal,
			String dataDaCompra, int cnpj, int imposto, String nomeCliente) {
		super(codigo, nome, descricao, preco, estoque);
		this.cpf = cpf;
		this.valorTotal = valorTotal;
		this.dataDaCompra = dataDaCompra;
		this.cnpj = cnpj;
		this.imposto = imposto;
		this.nomeCliente = nomeCliente;
	}
	// getter e setter

	public NotaFiscal() {

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getDataDaCompra() {
		return dataDaCompra;
	}

	public void setDataDaCompra(String dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
