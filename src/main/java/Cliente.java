
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * Objeto a ser enviado via socket.
 * 
 * @author osmar
 */
public class Cliente implements Serializable {

    private int codigo;
    private String nome;
    private String endereco;
    private double salario;
    private int idade;

    public Cliente() {
        setCodigo(0);
        setNome("");
        setEndereco("");
        setSalario(0.0);
        setIdade(0);
    }

    public Cliente(int _codigo,
            String _nome,
            String _endereco,
            double _salario,
            int _idade) {
        setCodigo(_codigo);
        setNome(_nome);
        setEndereco(_endereco);
        setSalario(_salario);
        setIdade(_idade);
    }

    public void setCodigo(int _codigo) {
        codigo = _codigo;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public void setEndereco(String _Endereco) {
        endereco = _Endereco;
    }

    public void setSalario(double _salario) {
        salario = _salario;
    }

    public void setIdade(int _idade) {
        idade = _idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public void leitura() {
        setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo")));
        setNome(JOptionPane.showInputDialog("Digite o Nome"));
        setEndereco(JOptionPane.showInputDialog("Digite o Endereco"));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario")));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o Idade")));

    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Codigo     : " + getCodigo()
                + "\nNome     : " + getNome()
                + "\nEndereco : " + getEndereco()
                + "\nSalario  : " + getSalario()
                + "\nIdade    : " + getIdade());
    }

    @Override
    public String toString() {
        return ("Codigo     : " + getCodigo()
                + "\nNome     : " + getNome()
                + "\nEndereco : " + getEndereco()
                + "\nSalario  : " + getSalario()
                + "\nIdade    : " + getIdade());
    }
}