import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList; 

class Funcoes {
  private static ArrayList<Motorista> motoristas = new ArrayList<>();
  private static ArrayList<Usuario> usuarios = new ArrayList<>();

//.
  public static int menu(Scanner sc){
    System.out.println("🔸🔸Bem-vindo ao Mototaxos!🔸🔸 ");
    System.out.println("\n➡️ Selecione uma opção:");
    System.out.println("1 - Cadastro de Usuário");
    System.out.println("2 - Cadastro de Motorista\n");
    int opcao = sc.nextInt();
    return opcao;
  }
//.
  public static String cadastroDeUsuario(Scanner sc){
    System.out.println("\nCADASTRAR-SE COMO USUÁRIO");
    sc.nextLine();
    System.out.println("\nInforme seu nome: ");
    String nome = sc.nextLine();
    
    System.out.println("\nInforme seu endereço: ");
    String endereco = sc.nextLine();
    
    System.out.println("\nInforme seu número de telefone: ");
    String numeroDeTelefone = sc.nextLine();
    
    System.out.println("\nInforme seu email: ");
    String email = sc.nextLine();
    
    System.out.println("\nInforme sua senha:");
    String senha = sc.nextLine();
    
    Usuario usuario = new Usuario(nome, endereco, numeroDeTelefone, email, senha);
    usuarios.add(usuario);
    System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO ✅\n ");

    return nome + " " + endereco + " " + numeroDeTelefone;
  }

//.
    public static String cadastroDeMotorista(Scanner sc){
      System.out.println("\nCADASTRAR-SE COMO MOTORISTA");
      sc.nextLine();
      System.out.println("\nInforme seu nome: ");
      String nome = sc.nextLine();

      System.out.println("\nInforme a placa da sua moto: ");
      String placaMoto = sc.nextLine();

      System.out.println("\nInforme seu número de telefone: ");
      String numeroDeTelefone = sc.nextLine();

      System.out.println("\nInforme seu email: ");
      String email = sc.nextLine();

      System.out.println("\nInforme sua senha: ");
      String senha = sc.nextLine();

      Motorista motorista = new Motorista(nome, placaMoto, numeroDeTelefone, email, senha);
      motoristas.add(motorista);
      System.out.println("\nMOTORISTA CADASTRADO COM SUCESSO ✅\n");
      return nome + " " + placaMoto + " " + numeroDeTelefone + " " + email;
    }

//.
  public static String menuUsuario(Scanner sc){
    System.out.println("\n👤|Seja bem-vindo!");
    System.out.println("\nO QUE VOCÊ DESEJA FAZER?");
    System.out.println("A - Viajar 🛣️");
    System.out.println("B - Avaliar viagem ⭐\n");
    String escolhaUsuario = sc.nextLine();
    return escolhaUsuario; 
  }
//.
  public static String menuMotorista(Scanner sc){
    System.out.println("\n🏍️ |Seja bem-vindo!");
    System.out.println("\nO QUE VOCÊ DESEJA FAZER?");
    System.out.println("A - Mudar status de disponibilidade 📳");
    System.out.println("B - Chamadas 📞\n");
    String escolhaMotorista = sc.nextLine();
    return escolhaMotorista;
  }
//.
  public static String viajarComMotoristaEspecifico(Scanner sc) {
      System.out.println("\n🔔|MOTORISTAS DISPONÍVEIS:");
      System.out.println("\nA - Roberto Carlos - (83) 99237-8429");
      System.out.println("----------------------------------------");
      System.out.println("B - Maria Eduarda - (83) 99237-8429");
      System.out.println("----------------------------------------");
      System.out.println("C - João Pedro - (83) 99237-8429");
      System.out.println("----------------------------------------");
      System.out.println("D - Maria Clara - (83) 99237-8429\n");
      String motoristaEspecifico = sc.nextLine();
      return motoristaEspecifico;
  }

  public static void escolherMotoristaAleatorio() {
      ArrayList<String> motoristas = new ArrayList<>();
      motoristas.add(0, "Roberto Carlos - (83) 99237-8429");
      motoristas.add(1, "Maria Eduarda - (83) 99237-8429");
      motoristas.add(2, "João Pedro - (83) 99237-8429");
      motoristas.add(3, "Maria Clara - (83) 99237-8429");
      Random random = new Random();
      int indiceAleatorio = random.nextInt(motoristas.size());
      String motorista = motoristas.get(indiceAleatorio);
      System.out.println("\nMotorista escolhido: " + motorista);
  }

//.
  public static void avaliacaoUsuario(Scanner sc){
    System.out.println("\nAVALIAÇÃO DA ULTIMA VIAGEM");
    System.out.println("⭐|Quantas estrelas (1-5)?\n");
    int estrela = sc.nextInt();
    if (estrela == 1) {
      System.out.println("\n★☆☆☆☆");
    } else if(estrela == 2) {
      System.out.println("\n★★☆☆☆");
    } else if(estrela == 3){
      System.out.println("\n★★★☆☆");
    } else if(estrela == 4) {
      System.out.println("\n★★★★☆");
    } else if(estrela == 5){
      System.out.println("\n★★★★★");
    } else {
      System.out.println("\nErro");
    }
  }
//.
  public static String statusMotorista(Scanner sc){
    System.out.println("Qual é o seu Status atual?");
    System.out.println("A - Disponível 🔔");
    System.out.println("B - Ocupado 🔕\n");
    String status = sc.nextLine();
    System.out.println(status);
    return status;
  }
//. 
    
    
    public static void chamadas(){
        System.out.println("\n📞|Chamadas feitas:");
        System.out.println("\n1 - Danilo Barbosa, (83) 93355-7131");
        System.out.println("2 - Lucas Rodrigues, (83) 98877-6686");
    }
  
  
}