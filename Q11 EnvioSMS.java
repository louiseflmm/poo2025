public class EnvioSMS implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        this.status = "SMS enviado com sucesso!";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}
