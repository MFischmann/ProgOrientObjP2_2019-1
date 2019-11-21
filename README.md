# ProgOrientObjP2_2019-1
Resolucao da prova do semestre 2019-1
Programação Orientada a Objetos
Prof. Bernardo Copstein
Prova 1

Nas questões de 1 a 6 considere o diagrama de classes e o código da classe Animal que seguem:

```
public class Animal {
  
  private String nome;
  private float peso;
  private boolean pet;

  public Animal(int id,String nome,float peso,boolean pet){
    this.id = id;
    this.nome = nome;
    this.peso = peso;
    this.pet = pet;
  }

  public int getId() { return id; }
  public String getNome() { return nome; }
  public float getPeso() { return peso; }
  public boolean isPet() {  return pet; }

  public boolean mesmaCategoria(Animal outro){
    if (Math.abs(this.getPeso() - outro.getPeso())>5){
      return false;
    }else{
      return true;
    }
  }

  public String toString{
    String str = getNome()+", "+getPeso()+"kgs";
    if (isPet() == true){
      str = str + ", é um pet";
    }
    return str;
  }
}
```

Questões


1. O Tamanduá é um mamífero protegido pelo Ibama. Como se alimenta de formigas e cupins vamos considera-lo como sendo carnívoro. Sabendo disso e considerando as classes e interface apresentadas, escreva o código Java de uma classe que modele adequadamente um Tamanduá. [2,0 pontos]

2. Apresente o código Java de um método que recebe um “List<Protegido>” por parâmetro e retorne à quantidade de pássaros (instâncias de “Passaro”) armazenados nesta lista. [2,0 pontos]

3. Usando Java, implemente a classe “PesoInvalidoException” derivada de “Exception” para representar uma exceção que indica que o valor informado como peso para um animal é inválido. Altere o construtor da classe Animal de maneira que a seja capaz de lançar “PesoInvalidoException” caso o valor do parâmetro “peso” seja negativo. [2,0 pontos]

4. Por uma questão de economia varias PetShops se organizaram e mantém um depósito único para abrigar os animais que estão a venda. Como são lojas pequenas localizadas em regiões com difícil acesso a internet, devem manter catálogos independentes de maneira a não correr o risco do mesmo animal ser vendido por mais de uma loja. Entretanto aparentemente foram feitas confusões. Para solucionar este problema, escreva um método Java que recebe as listas de animais a venda em duas lojas distintas e retorne uma terceira lista de onde constem apenas aquele que aparecem nas listas das duas lojas simultaneamente. Observação: obrigatório explorar conjuntos (interface Set da API de coleções). [2,0 pontos]

5. Explorando “streams”, funções agregadas e funções lambda, apresente o código de um método Java que recebe por parâmetro um “List<Animal>” e imprime na tela os nomes dos pets que pesam mais de 50Kg. [2,0 pontos]

6. Questão bônus: considere que o método Java “seleciona”, cuja assinatura segue, retorna uma lista apenas com os elementos do parâmetro “lst” que atendem a condição definida em “f”.  Sabendo que a lista “animaisDoZoo” armazena a relação de todos os animais do zoológico de uma cidade, demonstre o uso do método “seleciona” de maneira que ele retorne a lista dos peixes de água doce mantidos neste zoológico: [1,0 ponto]
```
List<Animal> seleciona(List<Animal> lst,Predicate f)
```
Boa prova !!
