package Objetos;

import java.sql.Struct;

import App.Read;

public class Loja {
	
	String cnpj;
	String endereco;
	String nomefilial;
	
	public Loja (String cnpj_,String endereco_,String nomefilial_){
		nomefilial = nomefilial_;
		cnpj = cnpj_;
		endereco = endereco_;
	}

	public Loja() {
		super();
	}

	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomefilial() {
		return nomefilial;
	}

	public void setNomefilial(String nomefilial) {
		this.nomefilial = nomefilial;
	}
	
	public void cadastrarLoja(){
		System.out.println("Digite o nome da filial: ");
		this.setNomefilial(Read.getString());

		System.out.println("Digite o endereco: ");
		this.setEndereco(Read.getString());

		System.out.println("Digite o cnpj da loja: ");
		this.setCnpj(Read.getString());

	}

	public void editarLoja(int seletor){
		String cnpjedit;
		switch (seletor) {
			case 1:
				System.out.println("Digite o novo nome da filial: ");
				this.setNomefilial(Read.getString());
				break;

			case 2:
				System.out.println("Digite o novo endereco: ");
				this.setEndereco(Read.getString());
				break;

			case 3:
				do{
					System.out.println("Digite o novo CNPJ(XX.XXX.XXX/0001-XX): ");
					cnpjedit = Read.getString();
				
					if(cnpjedit.length() == 18){ 
						this.setCnpj(cnpjedit);
						break;
					}else{
						System.out.println();
						System.out.println("CNPJ Inválido!");
						System.out.println();
					}	
				}while(true);
				break;
				
			default:
				System.out.println("Opção Inválida!");
				break;
		}
	}


	public String toString() {
		return "Nome da Filial: " + nomefilial + "\n" 
			 + "Endereço: " + endereco + "\n" 
			 + "CNPJ: " + cnpj ;
	}
}
