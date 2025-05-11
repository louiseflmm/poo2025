public class EnvioWhatsApp implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        this.status = "WhatsApp enviado com sucesso!";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}
