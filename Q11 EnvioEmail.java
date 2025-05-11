public class EnvioEmail implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        this.status = "Email enviado com sucesso!";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}
