package lutadores;

public class Lutador {
	
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;
	
	public void apresentar() {
		System.out.println("-------------------------------------------");
		System.out.println("Chegou a hora! Apresentamos o lutador: "+this.getNome());
		System.out.println("Diretamente de "+this.getNacionalidade());
		System.out.println("Com "+this.getIdade()+" anos e "+this.getAltura()+" de altura");
		System.out.println("Pesando "+this.getPeso()+" kilos");
		System.out.println(this.getVitorias()+" vitórias");
		System.out.println(this.getDerrotas()+" derrotas");
		System.out.println(this.getEmpates()+" empates");
	}
	public void status() {
		System.out.println("-------------------------------------------");
		System.out.println(this.getNome()+" é um peso "+this.getCategoria());
		System.out.println("Ganhou "+this.getVitorias()+ " vezes");
		System.out.println("Perdeu "+this.getDerrotas()+ " vezes");
		System.out.println("Empatou "+this.getEmpates()+ " vezes");
	}
	public void ganharLuta() {this.setVitorias(this.getVitorias()+1);}
	public void perderLuta() {this.setDerrotas(this.getDerrotas()+1);}
	public void empatarLuta() {this.setEmpates(this.getEmpates()+1);}
	
	public Lutador(String nm, String nc, int id, float al, float ps, int vt,int dr,int em) {
		this.nome = nm;
		this.nacionalidade = nc;
		this.idade = id;
		this.altura = al;
		this.setPeso(ps);
		this.vitorias = vt;
		this.derrotas = dr;
		this.empates = em;
	}
	
	public String getNome() {return this.nome;}
	public void setNome(String nm) {this.nome =nm;}
	
	public String getNacionalidade() {return this.nacionalidade;}
	public void setNacionalidade(String nc) {this.nacionalidade =nc;}
	
	public String getCategoria() {return this.categoria;}
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}
		else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}
		else if(this.peso <= 83.9) {
			this.categoria = "Médio";
		}
		else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}
		else{
			this.categoria = "Inválido";
		}
	}
	
	public int getIdade() {return this.idade;}
	public void setIdade(int id) {this.idade =id;}
	
	public float getAltura() {return this.altura;}
	public void setAltura(float al) {this.altura =al;}
	
	public float getPeso() {return this.peso;}
	public void setPeso(float ps) {this.peso =ps;this.setCategoria();}
	
	public int getVitorias() {return this.vitorias;}
	public void setVitorias(int vt) {this.vitorias =vt;}
	
	public int getDerrotas() {return this.derrotas;}
	public void setDerrotas(int dr) {this.derrotas =dr;}
	
	public int getEmpates() {return this.empates;}
	public void setEmpates(int em) {this.empates =em;}

	
}


