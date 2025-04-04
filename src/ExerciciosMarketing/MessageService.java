package ExerciciosMarketing;

public class MessageService {
    public void sendMessage(String message, MessageChannel channel) {
        switch (channel) {
            case SMS:
                sendSMS(message);
                break;
            case EMAIL:
                sendEMAIL(message);
                break;
            case SOCIAL_MEDIA:
                postOnSocialMedia(message);
                break;
            case WHATSAPP:
                sendWhatsApp(message);
                break;

            default:
                System.out.println("Canal de Mensagem não suportado");
        }
    }

    private void sendSMS(String message) {
        System.out.println("Enviando SMS: " + message);
    }

    private void sendEMAIL(String message) {
        System.out.println("Enviando E-mail: " + message);
    }

    private void postOnSocialMedia(String message) {
        System.out.println("Enviando SMS: " + message);
    }

    private void sendWhatsApp(String message) {
        System.out.println("Enviando SMS: " + message);
    }


}
