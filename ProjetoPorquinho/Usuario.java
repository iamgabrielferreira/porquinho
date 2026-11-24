import java.time.LocalDateTime;

public class Usuario {
    private static int proximoId = 1; // provisório
    private int id; // atributo
    private String nome;
    private static final String codPais = "+55";
    private String telefone;
    private String email;
    private LocalDateTime dataAcesso;
    private Porquinho porquinho;


    public Porquinho getPorquinho() {
        return porquinho;
    }

    public Usuario(String nome, String telefone, String email) {
        this.id = proximoId++;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        this.dataAcesso = LocalDateTime.now();
        this.porquinho = new Porquinho();
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDateTime getDataAcesso() {
        return dataAcesso;
    }

    public void setNome(String n) {
        if (n != null) {
            n = n.strip();
        }
        if (n == null || n.isEmpty()) {
            throw new IllegalArgumentException(
                    "O Porquinho não permite Usuário sem nome."
            );
        }
        else {
            nome = n.strip();
        }
    }

    public void setTelefone(String tel) {
        if (tel == null || tel.isEmpty()) {
            throw new IllegalArgumentException(
                    "O Porquinho não permite Usuário sem telefone."
            );
        }
        else {
            telefone = tel;
        }
    }

    public void setEmail(String em) {
        if (em == null || em.isEmpty()) {
            throw new IllegalArgumentException(
                    "O Porquinho não permite Usuário sem email."
            );
        }
        else {
            email = em;
        }
    }
}




//static final: um único valor compartilhado por todos os usuários e que não pode mudar.
//final: cada usuário pode ter seu próprio valor, mas esse valor não pode mudar depois de definido.