public class MainEnvioMensagens {
    public static void main(String[] args) {
        GestorMensagens gestor = new GestorMensagens();

        EnvioMensagem email = new EnvioEmail();
        EnvioMensagem sms = new EnvioSMS();
        EnvioMensagem whatsapp = new EnvioWhatsApp();

        System.out.println("Enviando mensagens:");
        gestor.enviarMensagem(email, "Olá por Email!");
        gestor.enviarMensagem(sms, "Mensagem por SMS.");
        gestor.enviarMensagem(whatsapp, "Mensagem via WhatsApp.");
    }
}
