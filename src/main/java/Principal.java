
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * Cliente que escreve objetos cliente no socket.
 *
 * @author osmar
 */
public class Principal {

    public static void main(String args[]) {
        try {
            Socket socket = new Socket("localhost", 4444);//endereco e porta
            OutputStream dadossaida = socket.getOutputStream();//obtem o fluxo de saida
            ObjectOutputStream saida = new ObjectOutputStream(dadossaida);// cria o objeto de saida para o fluxo
            System.out.println("Inicio cliente");

            String opcao = "";
            while (!opcao.equals("9")) {
                opcao = JOptionPane.showInputDialog("1-Leitura 9 - Sair");
                if (opcao.equals("1")) {
                    Cliente cliente = new Cliente();
                    cliente.leitura();
                    saida.writeObject(cliente);
                }
            }
            System.out.println("fim cliente");
        } catch (EOFException eoe) {//fim conexao cliente
             System.out.println("Excecao: " + eoe.getMessage());
            System.out.println("");
        } catch (IOException ioe) {//problema de io
             System.out.println("Excecao: " + ioe.getMessage());
        }
    }
}